# About This Project:

 - Personal project to clean the UI/UX of the Wells Fargo App based off of user reviews and to help improve customer retention, thus increase profits. 

[![N|Solid](https://media.giphy.com/media/IzjLhMorQDMxwubbu8/giphy.gif)](https://play.google.com/store/apps/details?id=com.passionatesolutions.app.eloteman)



# Project Features:

 - Navigation Drawer
 - Custom Toolbar
 - Slidable Cards
 - “How can we help” GridView buttons

# List of ways I would suggest improving the app:

  Clean up the UI by:

 - making the login section less cluttered and have larger text
 
 - add the “Need online access?  Enroll now” button easier to see by placing a simple button under the login button
add the articles as sliding cards instead of separate views with buttons

 - move the “Open a checking account” “Explore home loans” and “Find a credit card” to the “How can we help?” section with appropriate buttons to go with them
 
 - move the privacy information to one button named “Privacy/Important Information” that brings up a dialog window with all of that information. 
  
 - move the hamburger menu item button to the left of the toolbar
 
 - removing the image and bold text from the menu items in the Navigation Panel to keep things simple and easier to load
 
 - removing the app from being able to rotate to prevent any data leaking or loss of data inputs to help with security and ease of use with functionality.  The Chase app also doesn't allow for landscape mode. 


 - If the navigation drawer is open and the user presses the back button, close the navigation drawer.  If the navigation drawer is not open and the user presses the back button, exit the app

# List of bugs, UI fixes or stability issues in the application:

 - When going to landscape and then switching portrait mode there is a huge empty space that gets created at the bottom.


 - When going to landscape and then switching portrait mode the username and passwords are not saved


 - The hamburger menu button that calls the Drawer is on the right side of the toolbar.  In every app I have seen, the menu button is on the left.  By default it is created to the left.  I think maybe LTR (left to right) was implemented as the default somehow in the toolbar for the official app.  


 - After reviewing the reviews on the Google Play Store, many people complained about the UI being way too complicated and cluttered.  Someone referred to “K.I.S” which stands for “Keep it simple...”


 - The favorites functionality does not work.  When I favorite an article it does not add the article to the favorites tab.  If this only works when a user is logged on, the UI should inform the user to login in order to save the article correctly, or the app should use SharedPreferences to store the data locally to the phone rather than needing to login.  I would remove this feature and instead move the helpful articles to the Slidable Card View.


 - What appears to me to be a sliding CardView with the different sliding images, sometimes loads all the same image and information for each card.


 - When the navigation drawer window is open, if the user presses the back button the app closes. 

