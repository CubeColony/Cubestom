package net.cubecolony.server;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extras.MojangAuth;
import net.minestom.server.extras.optifine.OptifineSupport;

/**
 * @author LBuke (Teddeh)
 */
public final class CubestomServer {

    public CubestomServer() {
        MinecraftServer minecraftServer = MinecraftServer.init();

        start(minecraftServer);
    }

    private void start(MinecraftServer minecraftServer) {
        OptifineSupport.enable();
//        MojangAuth.init();

        minecraftServer.start("0.0.0.0", 25566);
    }
}
