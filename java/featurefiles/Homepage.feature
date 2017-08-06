# logotest is a tag to run particular scenario
# is tag on top of file it will run all scenario on feature file
# Background it will execute before every scenario
# Scenario: Verify Links on the header
#     When I click on "//section[@class='QuickLinks']/ul/li/a" element 
# 	Then I should be on "/secure/account/Login"
	

Feature:  Verify Home Page

Background: 
  Given I am on "/"

	Scenario: Verify HomePage Title
#	Given I am on "/"
	Then I shoud see Title "Next Official Site: Online Fashion, Kids Clothes & Homeware"

	
	Scenario: Verify HomePage Logo
#	Given I am on "/"
	Then I shoud see "//a[@class='SiteLogo gold']" element
	
	@logotest
	Scenario Outline: Verify Links on the header
    When I click on "<xpath>" element 
	Then I should be on "<url>"
		Examples:
			|xpath                                          |url                  |
	        |//section[@class='QuickLinks']/ul/li[1]/a      |/secure/account/Login|
			|//section[@class='QuickLinks']/ul/li[2]/a      |/quickshop|	        
	        |//section[@class='QuickLinks']/ul/li[3]/a      |/help|
	        |//section[@class='QuickLinks']/ul/li[4]/a      |/stores|