package bai5_access_modifier_static_method_static_property.bai_tap.b1_student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
        student.setName("Truong Minh Thuan");
        student.setClasses("C0723G1");
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
    }
}
