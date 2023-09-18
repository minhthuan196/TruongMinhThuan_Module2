package bai10_DSA_danh_sach.bai_tap.bt1_ArrayList;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int cap) {
        elements = new Object[cap];
    }

    public int getLength() {
        return elements.length;
    }

    private void ensureCapacity(int minCapacity) {
        int newSize = minCapacity + elements.length;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            size++;
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }

    public E remove(int index) {
        Object temp = elements[index];
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return (E) temp;
        }
    }

    public int size() {
        return size;
    }

    public Object clone() {
        MyList<E> cloneMyList = new MyList<>();
        cloneMyList.size = size;
        cloneMyList.elements = Arrays.copyOf(elements, size);
        return cloneMyList;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = e;
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        String listNumber = "";
        for (int i = 0; i < size; i++) {
            listNumber += elements[i] + "\t";
        }
        return listNumber;
    }
}
