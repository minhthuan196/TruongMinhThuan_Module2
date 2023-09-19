package bai12_Java_Collection_Framework.bai_tap.ProductManager.model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Product(int idProduct, String nameProduct, double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "ID Product = " + idProduct +
                ", Name Product = " + nameProduct +
                ", Price Product = " + priceProduct + "\n";
    }
}
