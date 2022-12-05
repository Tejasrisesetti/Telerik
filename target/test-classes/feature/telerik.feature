Feature: feature to test Progress Telerik

  Scenario: verify the logo on the page
    
    Given open the browser
    When user enter the url  "https://www.telerik.com"
    And Check the logo on header page
	When Check All Products on header
	Then open All Products
 And go to the All Products on header page
 Then click on the All Product arrow icon
When click on SERVICES button
Then click on BLOGS button
When click on DOCS & SUPPORT button
Then click on PRICING
When click on Search icon
And click on Your Account
When click on GET A FREE TRIAL button 

