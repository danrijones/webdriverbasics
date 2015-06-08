Feature: This is a test for HSO106

  @wip
  Scenario Outline: HSO106 is sent
    Given a customer in <country>, I can place an order for <number> items and with <carrier> and <payment_option>
    When the TCPL <job_name> job has completed
    Then the <job_name> file is correct

    Examples:
      | country | number | carrier    | payment_option | job_name |
      | UK      | "5"    | Hermes std | Paypal         | HSO106   |
      | FR      | 5      | Hermes std | Mastercard     | HSO106   |



