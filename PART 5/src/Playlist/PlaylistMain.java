package Playlist;

public class PlaylistMain
{
    public static void main(String[] args)
    {
        Playlist kateList = new Playlist();
        kateList.addSong("A Temporary High - AURORA");
        kateList.addSong("A Dangerous Thing - AURORA");
        kateList.addSong("Give into the Love - AURORA");
        kateList.printSongs();
    }
}
