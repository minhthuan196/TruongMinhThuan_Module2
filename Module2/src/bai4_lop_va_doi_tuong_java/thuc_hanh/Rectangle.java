package bai4_lop_va_doi_tuong_java.thuc_hanh;

public class Rectangle {
    double width;
    double height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width =width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter() {
        return (this.height + this.width) * 2;

    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
