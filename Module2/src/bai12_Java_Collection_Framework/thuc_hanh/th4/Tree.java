package bai12_Java_Collection_Framework.thuc_hanh.th4;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
