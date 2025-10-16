package Util;

import java.io.File;

public class CreationFolderIfNotExist {

    public static void createDiretoryIfNotExists(String filePath){
        File f = new File(filePath);
    f.mkdir();
    }
}
