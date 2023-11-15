package day33_a_static;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    @Override
    public String toString() {
        return "Song name: " + name +
                "\n\tLength: " + (length !=0.0 ? length: "There is not length for this object") +
                "\n\tArtist: " + artist +
                "\n\tGenre: " + genre;
    }

    public Song (String name) {
        this.name = name;
    }
    public Song (String name, double length) {
        this.name = name;
        this.length = length;
    }
    public Song (String name, double length, String artist) {
        this.name = name;
        this.length = length;
        this.artist = artist;
    }
    public Song (String name, double length, String artist, String genre) {
        this (name,length,artist);
        this.genre = genre;
    }

}
