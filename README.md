# Android Classes

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

### Create Listeners

1. Create an even listener for the button in MainActivity.kt
2. Create data members for all other widgets MainActivity.kt

### Write a Contact class

1. Create a new file called "Contact.kt"
2. Create a class called `Contact`
3. Add `name` and `phoneNumber` properties to the signature, both are `String` objects.
4. Write an constructor that takes `name` and `phoneNumber` as arguments and initializes the corresponding properties using `this.` syntax.
5. Write a property called `display` with a getter that combines the `name` and `phoneNumber` and returns it

### Write A Contacts Manager class

1. Create a new file called "ContactsManager.kt"
2. Create a class called `ContactsManager`
3. It should contain a property called `contacts` whose type is `MutableList<Contact>`
> this property should be in the primary constructor definition and can be given a default value of a new empty list

4. Add a method with the signature `fun createContact(name: String, phone: String)`. It should create a new instance of `Contact`, and add it to the `contacts` ArrayList.
5. In `MainActivity.kt`, add a data member called `contactsManager` instantiate and assign an instance of `ContactsManager` to it
> `val contactsManager = ContactsManager()` can do this

### Implement The User Interface

1. In the action for the "Create Contact" button, get the strings entered in the text field.
2. Use these strings to call the contacts manager's `createContact()` method.
3. Write a method that will generate and return a `TextView` that accepts a `String` as the text value.  
3. Refresh the the text view by adding the new contact as a new text view to your linear layout view.
4. Every contact from the array should be in this list

### Build, Run, and Test Your App

1. Build and run your app using the your preferred testing environment.
2. Enter various contacts making sure that they text view shows each contact you create.

### Bonus

If you finish and want another challenge try adding the ability to delete contacts.

> TIP: You'll have to find a way to identify which contact to delete. The "TAG" attribute allows you to attach hidden information to the UI element. This could be used to add a unique id that would then be matched in the `Contact` class to ensure that the correct contact is deleted.
