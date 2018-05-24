Feature: Test of content AddToYourOrder page

#  Background:
#    Given User is on worpress website "https://worpress.com"
#    When User clicks to login button
#    Then Email login page is displayed

    @wordpress @login
  Scenario: Checking of CartSubtotal content
    Given User is on wordpress website "https://wordpress.com/"
    When User clicks to login button
    Then Email login page is displayed
    When User enters email and clicks continue button
    Then Password login page is displayed
    When User enters password and press LogIn button
    Then Main loged page is displayed
#    When User press avatar
#    Then Personal page is displayed
#    When User clicks notification link
#    Then Notification page is displayed
#    When User press checkbox
#    Then Checkbox is unselected

