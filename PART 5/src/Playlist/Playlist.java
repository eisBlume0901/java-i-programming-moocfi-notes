package Playlist;

import java.util.ArrayList;
//There is also a Stack class in Java.
public class Playlist
{
    //Encapsulate instance variables
    private ArrayList<String> songs;

    //Constructor
    public Playlist()
    {
        this.songs = new ArrayList<>();
    }

    //Method
    public void addSong(String song)
    {
        this.songs.add(song);
    }

    public void removeSong(String song)
    {
        this.songs.remove(song);
    }

    public void printSongs()
    {
        for (String song: this.songs)
        {
            System.out.println(song);
        }
    }

}
