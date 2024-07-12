package ch.giuntini.netjlo_fos.socket;

import java.io.File;

public interface Send {

    default void send(File file) {
        // TODO set proper Exception message
        throw new UnsupportedOperationException("");
    }

    default void sendToAll(File file) {
        // TODO set proper Exception message
        throw new UnsupportedOperationException("");
    }
}
