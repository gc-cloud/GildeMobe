#CSCIE71 GildedRose Mob

This repository contains the refactored and enhanced GildedRose code for our mob **(we need a name!)**

Mob Membership:
* Alberto Garza
* Ran Zhang
* Rafael Flores
* Samuel Chao
* Gerardo Castaneda

The initial version shows the status as of end of day 9-18-2016

Changes into the repository can be done directly from IDEA



[link to video]

#Changes



Criteria
In Canvas, join a Mob Programming group with the members of your mob programming team from Sunday’s on-campus class. 
* Everyone joined Group Two

Create a public GitHub repository for your mob. 
* https://github.com/gc-cloud/GildedMobe

Identify at least one solution for remote pair- and mob programming. 
* We used Google hangouts.  With this we were able to discuss changes, generate ideas and share the screen.  Recording the session was a challenge within Google Hangouts and we used OBS
* We also used VCS control from inside Intellij IDEA.  This was helpful to have everyone make and access changes to the code base and push / pull to GitHub
![Alt text](GitIDEA_MENU.png?raw=true "Using Git in Intellij IDEA")
![Alt text](Result.png?raw=true "Using Git in Intellij IDEA")

Complete the Gilded Rose refactoring kata with your mob programming team.
* Moved redundant code to functions, eliminated nested if-else, added comments, eliminated magic numbers, etc
* Created constants exception items and other values
* Enhanced and completed battery of tests
* Added test for sulfuras always 80
* Added test for "conjured" items
* Enhanced code robustness to fix improperly declared new items
* New items with quality < 0 
* Sulfuras always has quality of 80
* Modified access levels to more robust settings when possible (private, package-private)
* Several other changes


Add your Gilded Rose code to your repo.
* Repo is current, 22 commits at the time this Readme file is written

Mob with your teammates to add unit tests until it is safe to refactor the legacy code. 
* The session took over three hours, this video shows the start of the session
* [Mob Session](https://www.youtube.com/watch?v=l6lQjZ9BMyc)

Aim for excellent code coverage of the production code; ignore code coverage of the test code. Some of the on-campus mobs achieved >90% code coverage before they began refactoring. Take a screenshot of your IDE or code coverage tool showing your project's code coverage. Include the screenshot in your git repo as a file named code-coverage.png.
* We achieved 100% code coverage for the GildedRose class (shown on screenshot above)

- Show that all your unit tests pass. Take a screen shot of the JUnit tests in your IDE, showing the list of all unit tests and their results. Or copy the console output of your JUnit tests into a text file. Include the screen shot or text file in your git repo. Name the file test-results.png or test-results.txt.

- Refactor the Gilded Rose production code, removing as many code smells as possible, refactoring for clean code. Your refactored Gilded Rose production code should be short and concise. Commit your refactored code to your repo.

- Add the new feature. Use TDD. Your test method(s) for the new inventory item, Conjured items, must start with the word “conjured”. You have at least one test method for Conjured items, and it proves that Conjured items degrade twice as fast as ordinary items. All tests pass.

