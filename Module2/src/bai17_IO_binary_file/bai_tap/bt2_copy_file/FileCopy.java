package bai17_IO_binary_file.bai_tap.bt2_copy_file;


import java.io.*;

public class FileCopy {

    public static final String SOURCE_TXT = "D:\\Codegym\\module2\\Module2\\src\\bai17_IO_binary_file\\bai_tap\\bt2_copy_file\\source.txt";
    public static final String DEST_TXT = "D:\\Codegym\\module2\\Module2\\src\\bai17_IO_binary_file\\bai_tap\\bt2_copy_file\\dest.txt";

    private static void copyFileUsingStream(File source, File dest) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static long countByte(File source) {
        return source.length();
    }

    public static void main(String[] args) {
        File sourceFile = new File(SOURCE_TXT);
        if (!sourceFile.exists()) {
            System.out.println("File not found!!!");
        }
        File destFile = new File(DEST_TXT);
        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Copy completed");
            System.out.println("Total byte in file: " + countByte(sourceFile));
        } catch (RuntimeException ioe) {
            System.out.println("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }

    }

}
