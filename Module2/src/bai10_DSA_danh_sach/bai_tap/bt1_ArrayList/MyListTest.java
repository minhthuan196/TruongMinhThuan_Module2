package bai10_DSA_danh_sach.bai_tap.bt1_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger1 = new MyList<>();
        MyList<Integer> listInteger2;
        listInteger1.add(0, 1);
        listInteger1.add(1, 1);
        listInteger1.add(2, 2);
        listInteger1.add(3, 3);
        listInteger1.add(4, 4);
        listInteger1.add(5, 5);
        System.out.println("List first: ");
        System.out.println(listInteger1);
        listInteger1.add(5, 8);
        System.out.println("List after add at index: ");
        System.out.println(listInteger1);
        listInteger1.remove(2);
        System.out.println("List after remove at index: ");
        System.out.println(listInteger1);
        listInteger2 = (MyList<Integer>) listInteger1.clone();
        System.out.println("List 2 clone from List 1: ");
        System.out.println(listInteger2);
        int number = 9;
        System.out.println("Check " + number + " have in List with contains? ");
        System.out.println(listInteger1.contains(number));
        System.out.println("Check " + number + " have in List with indexOf? ");
        System.out.println(listInteger1.indexOf(number));
        System.out.println("Check boolean add method: " + listInteger1.add(1));
        System.out.println("Check boolean add method: " + listInteger1.add(9));
        System.out.println(listInteger1);
        System.out.println(listInteger1.get(2));
        listInteger1.clear();
        System.out.println("List after clear: " + listInteger1);
    }
}
