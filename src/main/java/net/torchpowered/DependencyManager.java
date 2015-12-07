package net.torchpowered;

public class DependencyManager {
    public static MavenRepository getMavenRepository(String remoteUrl){
        return new MavenRepository(remoteUrl);
    }
}
