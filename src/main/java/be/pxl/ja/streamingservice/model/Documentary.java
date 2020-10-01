package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    private String topic;

    public Documentary(String title, Rating rating) {
        super(title, rating);
        this.setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getTopic());
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this.getTopic());
    }
}
