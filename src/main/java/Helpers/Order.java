package Helpers;

public class Order extends Customer {

    private String carrier;
    private String numberOfItems;
    private String payment_option;
    private Customer customer;

    public Order(String firstName, String lastName, String address, String country, String carrier, String numberOfItems, String payment_option, Customer customer) {
        super(firstName, lastName, address, country);
        this.carrier = carrier;
        this.numberOfItems = numberOfItems;
        this.payment_option = payment_option;
        this.customer = customer;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(String numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getPayment_option() {
        return payment_option;
    }

    public void setPayment_option(String payment_option) {
        this.payment_option = payment_option;
    }
}
