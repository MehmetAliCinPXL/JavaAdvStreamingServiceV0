package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 16;

    private String director;
    private LocalDate releaseDate;
    private Genre genre;
    private int duration;

    public Movie(String title, Rating rating) {
        super(title, rating);
    }
    //moest get en set title weg doen terwijl die niet in superklasse zijn?????
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    // deze van junit gecopieerd video
    public boolean isLongPlayingTime(){ return duration >= LONG_PLAYING_TIME;}
    //

    public String getPlayingTime(){
        int hours = duration / 60;
        int minutes = duration % 60;
        StringBuilder result = new StringBuilder();
        if (hours > 0){
            result.append(hours).append(" u ");
        }
        if (minutes > 0){
            result.append(minutes).append(" min ");
        }
        return result.toString().trim();
        // return "2 u 30 min;"
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
        // waarom abs ??
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String jaar = "";
        if (this.releaseDate != null)
        {
            jaar =" " + String.valueOf(releaseDate.getYear());
        }
        return this.getTitle() + jaar;
    }

//    public static void main(String[] args) {
//        Movie Frozen = new Movie("Frozen", Rating.LITTLE_KIDS);
//        Movie HarryPotter = new Movie("Harry Potter", Rating.TEENS);
//        HarryPotter.setDuration(10);
//        Frozen.director = "John Smith";
//        Frozen.setReleaseDate(LocalDate.of(1997, 12, 31));
//        System.out.println(Frozen.toString());
//        System.out.println(HarryPotter.toString());
//        System.out.println(HarryPotter.getDuration());
//
//   }
}


