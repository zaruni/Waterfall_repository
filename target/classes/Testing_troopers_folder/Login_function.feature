Feature: This is a testing trooper login functionality

@ElementDisplayed
Scenario:verify Login link displayed in home page header
#Given open Demoblaze "<URL>" Application URL
#Then verify Login link in homepage is displaying


Scenario:verify Login page is  displayed
Given open Demoblaze "<URL>" Application URL
Then click login link in homepage header
Then verify Login page is displayed