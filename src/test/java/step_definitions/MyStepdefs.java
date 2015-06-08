package step_definitions;

import Helpers.Customer;
import Helpers.Order;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
//    @When("^£(\\d+) is deposited in to the account$")
//    @Given("^a customer in (([a-z])\\w+), I can place an order for (\\d+) items and with (([a-z])\\w+) and (([a-z])\\w+) ")
//    @Given("^a customer in , I can place an order for  items and with  and (([a-z])\\w+)$")
//    public void a_customer_in_country_I_can_place_an_order_for_number_items_and_with_carrier(String country, int number, String carrier, String payment_option) throws Throwable {
    @Given("^a customer in (.*?), I can place an order for (.*?) items and with (.*?) and (.*?)$")
    public void place_order_for_item(String country, String number, String carrier, String payment_option) throws Throwable {
        Customer c1 = new Customer("Dan", "Jones", "London", country);
        System.out.println("customer address is : " + c1.getAddress());
        System.out.println("customer country is : " + c1.getCountry());
        Order o1 = new Order("Dan", "Jones", "London", country, number, carrier, payment_option, c1);

        System.out.println("Using an endpoint create new customer with country, payment option");
        System.out.println("Buy number items ");
        System.out.println(country + " "
            + number + " "
        + carrier + " "
        + payment_option);
    }


//    @When("^the TPLC HSO(\\d+) has completed$")
    @When("^the TCPL HSO(.*?) has completed$")
    public void the_TCPL_job_name_job_has_completed(String job_name) throws Throwable {
        System.out.println("call endpoint to run the " + job_name);
        System.out.println("check for return status of successful job run");

    }

    @Then("^the (.*?) file is correct$")
    public void the_job_name_file_is_correct(String job_name) throws Throwable {
        System.out.println("parse file, check it matches known good." + job_name);

    }

    @Given("^the Db is primed with an <order>$")
    public void the_Db_is_primed_with_an_order() throws Throwable {
        System.out.println("Add an order to the database directly? perhaps reuse the" +
                "a_customer_in_country_I_can_place_an_order_for_number_items_and_with_carrier() method?? ");

    }

    @And("^a HS(.*?) file with a status of (.*?) has been placed in the outgoing folder$")
    public void a_HS_file_with_a_status_of_status_has_been_placed_in_the_outgoing_folder(String job_name, String status) throws Throwable {
        System.out.println("Create a " + job_name + " file with correct details and put in the outgoing folder");
        System.out.println("check status of file is " + status);

    }

}
