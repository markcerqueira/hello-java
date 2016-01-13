package com.company;

import java.util.ArrayList;

/**
 * A class that represents a Notebook object.
 */
public class Notebook {

    // An ArrayList is a class provided by Java that has functionality similar to a list. You can add things to it,
    // remove things, get things from it, ask how long it is, etc. We don't need to know or necessarily care about how
    // it does these things internally so long as it does them. That's the beauty of APIs - it's a contract.
    //
    // Here is the API reference for the ArrayList: https://developer.android.com/reference/java/util/ArrayList.html
    // If you look at the Public Methods section you can see all the methods you can call on an ArrayList and what
    // will happen.
    //
    // What does the <Note> mean in ArrayList<Note>? It means we can ONLY add Note objects to our list. If we tried
    // adding a String or integer, we would NOT be able to run out program.
    ArrayList<Note> noteList;

    // The constructor for our Notebook class. We'll need to use this to create a Notebook object before we can
    // call anything else.
    public Notebook() {
        // This creates a new ArrayList using the ArrayList constructor.
        noteList = new ArrayList<>();
    }

    // Adds the Note object passed in as a parameter to our Notebook
    public void addNote(Note note) {
        // add is a method of the ArrayList class. It adds the object to the end of the list.
        noteList.add(note);

        // There is an overloaded version of add that also takes an integer which lets you specify which position in
        // the list you want to put the new object. For example:
        //
        // noteList.add(0, note);
        //
        // would add the note to the front of the list. Why 0? Computer scientists start counting at 0! If you want
        // to read up more on this, look up "zero-based indexing"
    }

    // Removes note from the Notebook
    public void removeNote(Note note) {
        // remove is a method on the ArrayList class that removes the object from the list.
        noteList.remove(note);

        // Again, there is an overloaded version of remove that uses the position. If we wanted to remove the first
        // item in the list, we could do this:
        //
        // noteList.remove(0);
        //
        // Again, because of zero-based indexing, 0 is the index of the first item in the list!
    }

    // This returns an integer (keyword int specifies this method needs to return an int) that is the number of notes
    // in this notebook.
    public int notebookSize() {
        // size is a method that returns the number of elements in the list
        return noteList.size();
    }

    // This method prints the content of all notes in the notebook.
    public void printAllNotes() {
        // This is a for-each loop. It will loop over every Note in noteList and do the operation inside the brackets
        // on that note.
        for (Note note : noteList) {
            note.printNote();
        }
    }
}
