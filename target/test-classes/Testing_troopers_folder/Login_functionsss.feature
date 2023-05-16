Feature: This is a testing trooper login functionality

@ElementDisplayed
Scenario:verify Login link displayed in home page header
Given open Demoblaze "<URL>" Application URL
Then verify Login link in homepage is displaying

@ElementDisplayed
Scenario:verify Login page is  displayed
#Given open Demoblaze "<URL>" Application URL
#Then click login link in homepage header
#Then verify Login page is displayed

@ElementDisplayed
Scenario:Verify Log in Text display in Login page
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then Verify Log in Text display in Login page

@ElementDisplayed
Scenario:Verify username field display in login page
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then Verify username field display in login page

@ElementDisplayed
Scenario:Verify password field display in login page
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then Verify password field display in login page

@ElementDisplayed
Scenario: Verify Login button display in login page
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then Verify Login button display in login page

@CloseLoginpage
Scenario:Verify Login page closes
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then click close button
#Then Verify Login page closes successfully

@Login
Scenario:verify user can login successfully
#Given open Demoblaze "<URL>" Application URL
#Then click Login link in homepage header
#Then UserName Password click login
#Then verify user can login successfully

@InvalidCredentials
Scenario:Verify user Redirected to login page for Blank Credentials
Given open Demoblaze "<URL>" Application URL
Then click Login link in homepage header
Then click log in button
Then Verify user can Redirected to login page

Scenario: Verify user Redirected to login page for invalid Username
Given open Demoblaze "<URL>" Application URL
Then click Login link in homepage header
Then Enter invalid usernameandpassword and click login button
Then Verify user can Redirected to login page
