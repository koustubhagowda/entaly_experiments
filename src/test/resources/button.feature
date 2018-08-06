@Button
Feature: As a enduser
I should able to check the button enable or disbled


#@undo_button
#Scenario:trying to check buton enable or disabled
#Given Iam on dashboard undo button page 
#When I click undo button 
#Then I should see the pervious action
#
#@Autorefresh_button
#Scenario:trying to check buton enable or disabled
#Given Iam on dashboard autorefresh button page
#When I click on autorefresh button
#Then I should see the homepage is automaticaly update the information
#
#@gridline_enabel_or_disbale
#Scenario:trying to check buton enable or disabled
#Given Iam on dashboard gridline page
#When I check the gridline button is disbaled 
#Then I should see the current page

@undo_button
Scenario:trying to check buton enable or disabled
Given Iam on dashboard undo button page 
When I click undo button 
Then I should see the pervious action

@Autorefresh_button
Scenario:trying to check buton enable or disabled
Given Iam on dashboard autorefresh button page
When I click on autorefresh button
Then I should see the homepage is automaticaly update the information

@gridline_enabel_or_disbale
Scenario:trying to check buton enable or disabled
Given Iam on dashboard gridline page
When I check the gridline button is disbaled 
Then I should see the current page

@dragAnddrop
Scenario: trying to drag the image from floder to trash
Given Iam on drag and drop page
When I drag the image from image floder to trash
Then I should see the image in the Trash

@color_text
Scenario: verify the color of the text
Given Iam on  color text page
When I verify the particular color of the text
Then I should see the specified color

@color_pannel
Scenario: trying to change the color of the graph
Given Iam on color pannel page
When I choose the color set
Then I should see the specified color set in graph

@zoomin_zoomout
Scenario: trying to check the zoom in and zoomout views
Given Iam on zoomin/zoomout page 
When I click zoomin/zoomout button 
Then  I should see the zoomin/zoomout views
@Resize_graph
Scenario: trying to check the resize function
Given Iam resize page
When I click resize button
Then I should see the size of the widget