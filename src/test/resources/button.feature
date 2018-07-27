@Button
Feature: As a enduser
I should able to check the button enable or disbled

@undo_button
Scenario:trying to check buton enable or disabled
Given Iam on dashboardpage 
When I click undo button 
Then I should see the pervious action

@Autorefresh_button
Scenario:trying to check buton enable or disabled
Given Iam on dashboard homepage
When I click on autorefresh button
Then I should see the homepage is automaticaly update the information

@gridline_enabel_or_disbale
Scenario:trying to check buton enable or disabled
Given Iam on dashboard gridlinepage
When I check the gridline button is disbaled 
Then I should see the current page

