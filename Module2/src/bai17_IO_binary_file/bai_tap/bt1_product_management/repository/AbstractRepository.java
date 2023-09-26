package bai17_IO_binary_file.bai_tap.bt1_product_management.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<O> implements IIOFileByteStream<O> {
    @Override
    public List<O> readByByteStream(String pathName) {
        File file;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            file = new File(pathName);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<O>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error file");
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error file");
            }
        }
        return new ArrayList<>();
    }

    @Override
    public void writeByByteStream(String pathName, List<O> data) {
        File file;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            file = new File(pathName);
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            System.out.println("Error file");
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error file");
            }
        }
    }
}
