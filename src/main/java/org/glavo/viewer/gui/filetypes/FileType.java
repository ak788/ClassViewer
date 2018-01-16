package org.glavo.viewer.gui.filetypes;

import javafx.stage.FileChooser;
import org.glavo.viewer.gui.Viewer;
import org.glavo.viewer.gui.filetypes.classfile.ClassFileType;

import java.net.URL;

public abstract class FileType {
    public static final FileType[] fileTypes = {
            ClassFileType.Instance
    };

    public static FileType valueOf(String name) {
        switch (name) {
            case "JAVA_CLASS":
                return ClassFileType.Instance;
        }
        return null;
    }

    public FileChooser.ExtensionFilter filter = null;

    public abstract boolean accept(URL url);

    public abstract void open(Viewer viewer, URL url, boolean changeToNewTab);
}
