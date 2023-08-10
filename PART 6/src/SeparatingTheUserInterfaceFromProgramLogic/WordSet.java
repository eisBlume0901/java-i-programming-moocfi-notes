package SeparatingTheUserInterfaceFromProgramLogic;

import java.util.ArrayList;

public class WordSet
{
    //Encapsulate instance variables
    private ArrayList<String> words;

    //Constructor
    public WordSet()
    {
        this.words = new ArrayList<>();
    }

    //Methods
    public void add(String word)
    {
        this.words.add(word);
    }

    public boolean contains(String word)
    {
        return this.words.contains(word);
    }
}
