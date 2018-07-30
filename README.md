# Android_Classes

This project will help you practice the skills and concepts you learned related to structs and classes in Java. For this project you'll build an app that is a basic contacts manager app. It will allow you to save and view contact information for your friends.

### Create an Android Studio Project

1. Create a new Android Studio project
2. Name the project "Friends"

### Add UI Elements to activity_main.xml

1. Open the app's activity_main.xml file.
2. Add two edit text fields to the main screen.
3. Add a button to the main screen
4. Make the button's text "Create Contact"
5. Add a scroll view with a linear layout child to the screen.
6. Use the Add Missing Constraints option to make sure everything is properly constrained

### Create Listeners

1. Create an even listener for the button in MainActivity.java
2. Create data members for all other widgets MainActivity.java

### Write a Contact class

1. Create a new file called "Contact.java"
2. Create a class called `Contact`
3. Add `String name` and `String phoneNumber` properties.
4. Write an constructor that takes `name` and `phoneNumber` as arguments and initializes the corresponding properties using `this.` syntax.

### Write A Contacts Manager class

1. Create a new file called "ContactsManager.java"
2. Create a class called `ContactsManager`
3. It should contain a variable array property called `contacts` whose type is an ArrayList of `Contact` objects
4. Add a method called `Contact createContact(String name, String phoneNumber)`. It should create a new instance of `Contact`, add it to the `contacts` ArrayList, and return it.
5. In `MainActivity.java`, add a data member called `contactsManager` instantiate and assign an instance of `ContactsManager` to it (`ContactsManager contactsManager = new ContactsManager()`)

### Implement The User Interface

1. In the action for the "Create Contact" button, get the strings entered in the text field.
2. Use these strings to call the contacts manager's `createContact()` method.
3. Refresh the the text view by adding the new contact as a new text view to your linear layout view.
4. Every contact from the array should be in this list

### Build, Run, and Test Your App

1. Build and run your app using the your preferred testing environment.
2. Enter various contacts making sure that they text view shows each contact you create.

### Bonus

If you finish and want another challenge try adding the ability to delete contacts.

> TIP: You'll have to find a way to identify which contact to delete. The "TAG" attribute allows you to attach hidden information to the UI element. This could be used to add a unique id that would then be matched in the `Contact` class to ensure that the correct contact is deleted.
