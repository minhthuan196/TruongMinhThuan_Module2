package bai17_IO_binary_file.bai_tap.bt1_product_management.repository;

import java.util.List;

public interface IIOFileByteStream<O> {
    List<O> readByByteStream(String pathName);

    void writeByByteStream(String pathName, List<O> data);
}
