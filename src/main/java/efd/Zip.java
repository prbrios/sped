package efd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

    public static void main(String[] args) {
        String result_message=zipFiles("c:\\users\\prbri\\Desktop\\teste3.zip","c:\\users\\prbri\\Desktop\\metafile\\");
        System.out.println(result_message);
    }

    public static String zipFiles(String zipFile, String srcDir) {
        try {
            File srcFile = new File(srcDir);
            File[] files = srcFile.listFiles();
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (int i = 0; i < files.length; i++) {
// create byte buffer
                byte[] buffer = new byte[1024];
                FileInputStream fis = new FileInputStream(files[i]);
                zos.putNextEntry(new ZipEntry(files[i].getName()));
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
// close the InputStream
                fis.close();
            }
            zos.close();
        }
//
        catch (Exception e)
        {return e.getMessage();}
        return "Successfully created the zip file" + zipFile;
    }
}
