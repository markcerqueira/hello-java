package com.company;

/**
 * A class that represents a Note object.
 */
public class Note {

    // Every note object will have access to a String called content. EACH Note object has its own content so if you
    // create multiple new Notes, each of them will have its own content which can be manipulated.
    String content;

    // This is a special method called a constructor. The name of the method Note matches the name of the class above.
    // Using this method we can create new instances of Note.
    // e.g. Note myNote = new Note()
    public Note() {
        content = "";
    }

    // This is another (overloaded) constructor. This constructor takes a String parameter and then assigns the String
    // passed in to content. You can create Note objects using this constructor or the constructor above.
    public Note(String noteContent) {
        content = noteContent;
    }

    // This adds the text passed in as a parameter to the content of the note. It DOES NOT remove the existing content
    // but adds to it.
    public void addContent(String text) {
        content = content + text;
    }

    // This prints the content of the note to the console.
    public void printNote() {
        // Main.print refers to the print method we wrote in the Main class. Since that method has the word public in
        // its header we are allowed to do this. If the word was private we could NOT do this. The words public and
        // private are special in Java and they are called access modifiers because they modify who has access to the
        // method.
        //
        // More info on Java access modifiers: http://www.tutorialspoint.com/java/java_access_modifiers.htm
        Main.print(content);
    }

    // This method deletes the content of the note.
    public void clearContent() {
        // It deletes it by assigning a blank string, "", to content.
        content = "";
    }
}
