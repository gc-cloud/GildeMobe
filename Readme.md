#CSCIE71 GildedRose Mob

This repository contains the refactored and enhanced GildedRose code for group **Mob Programming 2**

##Mob Membership
* Alberto Garza
* Ran Zhang
* Rafael Flores
* Samuel Chao
* Gerardo Castaneda

The initial version shows the status as of end of day 9-18-2016



##Criteria list
###In Canvas, join a Mob Programming group with the members of your mob programming team from Sunday’s on-campus class. 
* Everyone joined Mob Programming 2

###Create a public GitHub repository for your mob. 
* https://github.com/gc-cloud/GildedMobe

###Identify at least one solution for remote pair- and mob programming. 
* We used Google hangouts.  With this we were able to discuss changes, generate ideas and share the screen.  Recording the session was a challenge within Google Hangouts and we used OBS
* We also used VCS control from inside Intellij IDEA.  This was helpful to have everyone make and access changes to the code base and push / pull to GitHub
![Alt text](GitIDEA_MENU.png?raw=true "Using Git in Intellij IDEA")


###Complete the Gilded Rose refactoring kata with your mob programming team.
* Moved redundant code to functions, eliminated nested if-else, added comments, eliminated magic numbers, etc
* Created constants exception items and other values
* Enhanced and completed battery of tests
* Added test for sulfuras always 80
* Added two tests for "conjured" items,first test decrease by 2 for non-expired items, second decrease by 4 for expired items.
* Enhanced code robustness to fix improperly declared new items
* New items with quality < 0 
* Sulfuras always has quality of 80
* Modified access levels to more robust settings when possible (private, package-private)
* Several other changes


###Add your Gilded Rose code to your repo.
* Repo is current, 29 commits at the time this Readme file is written

###Mob with your teammates to add unit tests until it is safe to refactor the legacy code. 
* The session took over three hours, this video shows the start of the session [Mob Session](https://www.youtube.com/watch?v=l6lQjZ9BMyc)

###Aim for excellent code coverage of the production code; ignore code coverage of the test code. 
* We achieved 100% code coverage for the GildedRose class
![Alt text](code-coverage.png?raw=true "Test Coverage & Hangout")

###Show that all your unit tests pass. Take a screen shot of the JUnit tests in your IDE, showing the list of all unit tests and their results. 
* Console output showing all JUnit tests passed
![Alt text](test-results.png?raw=true "All tests passed")

###Refactor the Gilded Rose production code, removing as many code smells as possible, refactoring for clean code. Your refactored Gilded Rose production code should be short and concise. Commit your refactored code to your repo.
* Cleaned-up code in repo

###Add the new feature. Use TDD. Your test method(s) for the new inventory item, Conjured items, must start with the word “conjured”. You have at least one test method for Conjured items, and it proves that Conjured items degrade twice as fast as ordinary items. All tests pass.
* Added new tests for conjured items.  
* Added statement to decrement quality by one when item name contains conjured items
