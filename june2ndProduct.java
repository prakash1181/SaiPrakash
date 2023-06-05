public class june2ndProduct {
    public static void main(String args[]){
        Product ptd =new Product();
        ptd.setPrice(100);
        double price=ptd.getPrice(50);
        System.out.println(price);
    }
}
class Product{
    double price;

    public double getPrice() {

        return price;
    }
    public double getPrice(int quantity) {
        return quantity*price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}