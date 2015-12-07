package net.torchpowered;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MavenRepository {
    private String link;
    public MavenRepository(String link){
        this.link = link;
    }

    void resolveJar(String groupId, String artifactId, String version, File destination){
        String urlGroupId = groupId.replaceAll("\\.", "/");
        String artifactName = artifactId + "-" + version;
        String mavenUrl = link + urlGroupId + "/" + artifactId + "/" +  version + "/" + artifactName + ".jar";
        System.out.println(mavenUrl);
        URL url;
        try {
            url = new URL(mavenUrl);
        } catch (MalformedURLException e) {
            throw new UnsupportedOperationException("URL failed to parse.");
        }
        try {
            FileUtils.copyURLToFile(url, destination);
        } catch (IOException e) {
            throw new UnsupportedOperationException("Failed to resolve.");
        }
    }
}
