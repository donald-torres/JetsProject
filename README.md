# JetsProject

### Overview

   This program is a simulation of an airfield.  The planes already on the airfield display their details like price, speed, etc.  The user can cycle through various options to view the planes details or see which one is the fastest.  The user can also add and remove planes to the airfield and the program will display the new plane list afterwards. When the user is done at the airfield they simply select the number labeled Leave the Airfield and the program ends.  


### Technologies / Techniques Used

 - Java
 - List Interface
 - Array Lists
 - Abstraction, Polymorphism, and Inheritance
 - Interfaces


### How To Run

  Once running the program populates the airfield using the jets.txt and the user is given a menu screen to select an option.  The menu has the options from 1 to 9, option 1 will display the jets on the airfield and their details.  Option 2 will "Fly" all the jets on the airfield and display their info as well as their flight time in hours. Option 3 will show the fastest jet on the airfields speed and its details, option 4 will do the same but with the plane that has the longest distance.  Option 5 will cycle through the airfield and find all cargo jets and will prompt them to load their cargo.  Option 6 is similar to 5 but it sends all fighter jets to fire their payload.  Option 7 involves the user adding their own planes, it starts with which kind of jet you want to add, then the user will be prompted to input a name, max speed, max distance, and price of their jet.  Once complete the new jet will be added to the airfield, the user can add as many jets they want of the three types in the airfield.  Option 8 askes the user if they want to remove a jet from the airfield and prints out a numbered list for them to input the desired jet they want removed.  When the desired plane is selected they are given a printout showing their selected plane and its details. Lastly option 9 is the prompt for the user to leave the airfield thus closing the program. 


### Lessons Learned

  Pros -

 - Enhanced knowledge of Object-Oriented Programming in Java.

 - Use of O-O to divide information through various classes keeps, code clean on the "APP" or main class.

 - Better understanding of ArrayLists and List interfaces.

  Cons - 

   These two reasons took the most of my time coding the program 

 - Code for reading the list stumped me because it was printing the list how I wanted but it was adding the base list below the print and incrementing everytime an option was selected in the program .  It took me most of my time to figure out that I just needed to store the return in a seperate ArrayList and pass its parameters through the method to the initial List.

 - Initially removing a planes code worked but it was only taking from the top of the list so I had to do some research and I attempted several different methods for printing and removing the correct plane from the list.


