package ch.giuntini.netjlo_fos.packages;

import ch.giuntini.netjlo_base.packages.BasePackage;

import java.io.Serializable;

public class FilePartPackage extends BasePackage implements Serializable {
    public final boolean EOF;

    public FilePartPackage(String information) {
        super(information);
        EOF = false;
    }

    public FilePartPackage(boolean EOF) {
        super("");
        this.EOF = EOF;
    }
}
