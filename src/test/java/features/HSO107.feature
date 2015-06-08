Feature: This is a test for HSO107

  @wip
  Scenario Outline: HS107 is sent

    Given the Db is primed with an <order>
    And a <job_name> file with a status of <status> has been placed in the outgoing folder
    When the TCPL <job_name> has completed
    Then the <job_name> file is correct

    Examples:
      | job_name | status       |
      | HSO107   | cancelled    |
      | HSO107   | partial pick |

