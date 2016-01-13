package com.company;

public class Main {

    // The main method is always the first method called when you run your program.
    public static void main(String[] args) {
        // This is a single line comment. It begins with two slashes and covers the entire line

        /* This is a multi-line comment.
           It will span multiple lines until you end it with an asterisk and a slash.
           Like this */

        // This prints Hello World to the console
        System.out.println("Hello World"); // You can also put comments after a line of code like this!

        // This prints the string but uses the print method we defined below.
        print("Hello World using the print method");

        // Here we are creating a variable. The type is "int" and the name of the variables is i and j. Names can be
        // anything you want. If possible they should be descriptive, but for integers, it's not unusually to just
        // pick a single letter for names.
        int i = 1;
        int j = 2;

        // Some basic arithmetic. We assign the values 1 to i and 2 to j.
        // Then you can do operations like: i + j, i * j, i - j, i / j
        int k = i * j + 2 + 3 - 1 * i + j / i + 10;

        // This will print to the console "k = " and then the ACTUAL numeric value of k (i.e. 18).
        System.out.println("k = " + k);

        // Calling some arithmetic helper methods we made AND printing their output to the console.
        // Note that the print method called above uses the print method below that takes a String parameter.
        // The print calls here use the method with an integer parameter because the add, subtract, multiply
        // methods return an integer.
        //
        // This concept of having a method with the same name but different parameters is called METHOD OVERLOADING.
        print(add(2, 3));
        print(subtract(2, 3));
        print(multiply(2, 3));

        // In these next few lines, I'm going to create a Note and add content to it

        // Call the constructor of Note() which creates a new Note object for us and assigns it to myFirstNote
        // myFirstNote is the name of the variable and Note is the type. myFirstNote is just a name and can be
        // whatever you want (e.g. coolNote, awesomeNote, note1, note2, etc.)
        Note myFirstNote = new Note();

        // This will print an empty line because the note currently has no content
        myFirstNote.printNote();

        // Here we add some content to the note. Because when we add content we do content = content + text, if we
        // make multiple calls to addContent it will ADD content to our note, not replace it!
        myFirstNote.addContent("My name is Mark ");
        myFirstNote.addContent("and I am in California right now");

        // Print the content of the note.
        myFirstNote.printNote();

        // Using the Notebook constructor create a new Notebook object
        Notebook myFirstNotebook = new Notebook();

        // Then add the Note created above to the Notebook object we just created
        myFirstNotebook.addNote(myFirstNote);

        // This will print the number of notes in our Notebook (i.e. 1)
        print(myFirstNotebook.notebookSize());

        // This will print the content of all notes in the Notebook
        myFirstNotebook.printAllNotes();

        // Create another Note object using an overloaded constructor that takes the content at the time we create
        // the note. Unlike above where we create the Note (new Note()) and then add content using the addContent
        // method, here we will do it in one line.
        Note secondNote = new Note("This is the content in the second note");

        // Note that we are calling addContent on secondNote. Each Note object has its own content so think of them
        // as separate entities. secondNote is a Note and myFirstNote above is also a Note, but they each have their
        // own state (content) that can be manipulated individually.
        secondNote.addContent(" and the second note is pretty long.");

        secondNote.printNote();

        // Add secondNote to myFirstNotebook
        myFirstNotebook.addNote(secondNote);

        // Print all notes in myFirstNotebook (i.e. prints myFirstNote and secondNote)
        myFirstNotebook.printAllNotes();
    }

    // This method takes an integer and prints it to the console.
    public static void print(int i) {
        // What's happening here? We are calling our print method below, but why do we do "" + i?
        // The print method below requires us to pass a String as the parameter. We have an int in this method. By
        // doing "" + i we are essentially creating a new String that is the value of i as a String. This is a simple
        // way to convert an int to a String.
        print("" + i);
    }

    // This method returns nothing (so the return type is void). It prints the String parameter passed in (text) to
    // the console.
    public static void print(String text) {
        System.out.println(text);
    }

    // This method returns an int (integer) that is the sum of parameters a and b (i.e. a + b)
    public static int add(int a, int b) {
        return a + b;
    }

    // This method returns an int (integer) that is the difference of parameters a and b (i.e. a - b)
    // Note that in this method header, we switch the order of static and public. Both ways are valid so just pick
    // which one you like more and be consistent.
    static public int subtract(int a, int b) {
        return a - b;
    }

    // This method returns an int (integer) that is the product of parameters a and b (i.e. a * b)
    public static int multiply(int a, int b) {
        return a * b;
    }
}
