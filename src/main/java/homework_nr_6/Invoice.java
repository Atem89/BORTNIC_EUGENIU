package homework_nr_6;

public class Invoice {

    private String deviceModel;
    private String productDescription;
    private int numberOfProductsPurchased;
    private double productPrice;

    public Invoice(String deviceModel, String productDescription, int numberOfProductsPurchased, double productPrice) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        setNumberOfProductsPurchased(numberOfProductsPurchased);
        setProductPrice(productPrice);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getNumberOfProductsPurchased() {
        return numberOfProductsPurchased;
    }

    public void setNumberOfProductsPurchased(int numberOfProductsPurchased) {
        if (numberOfProductsPurchased<0){
            this.numberOfProductsPurchased = 0;
        }
        else {
            this.numberOfProductsPurchased = numberOfProductsPurchased;
        }
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice < 0 ){
            this.productPrice = 0;
        }
        else {
            this.productPrice = productPrice;
        }
    }

    public double getAmount(){
        return numberOfProductsPurchased*productPrice;
    }

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Nes", "Console gaming", 4, 10.50);
        System.out.println(invoice1.getAmount());
        Invoice invoice2 = new Invoice("Nes", "Console gaming", -4, 10.50);
        System.out.println(invoice2.getAmount());
        Invoice invoice3 = new Invoice("Nes", "Console gaming", 4, -10.50);
        System.out.println(invoice3.getAmount());
    }
}
