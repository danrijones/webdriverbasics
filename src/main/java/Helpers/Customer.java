package Helpers;

/**
 * Created by mba on 08/06/15.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String country;

    public Customer(String firstName, String lastName, String address, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
