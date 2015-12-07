package net.torchpowered;

import java.io.File;

/**
 * Testing DependencyManager
 */
public class ExampleUsage {
    public static void main(String[] args){
        MavenRepository mavenRepository = DependencyManager.getMavenRepository("http://repo1.maven.org/maven2/");
        mavenRepository.resolveJar("commons-io", "commons-io", "2.4", new File(System.getProperty("user.dir"), "commons-io.jar"));
    }
}
