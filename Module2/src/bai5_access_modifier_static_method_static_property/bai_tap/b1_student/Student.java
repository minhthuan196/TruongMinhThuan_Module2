package bai5_access_modifier_static_method_static_property.bai_tap.b1_student;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    // change access modifier: protected, default ok
    // private error
    /*private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }*/

}
