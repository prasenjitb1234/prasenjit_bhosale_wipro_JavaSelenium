Feature: Check user is able to remove item from cart
@Priority4
Scenario:
Successfully removed item from the cart
Given Page should open in default browsers
When Page loads navigate to cart  page
And remove item from cart
Then successfully removed item from cart 