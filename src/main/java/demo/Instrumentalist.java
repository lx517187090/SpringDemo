package demo;

public class Instrumentalist implements Performer ,Instrument{
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {

    }
    public Instrumentalist(){

    }

    private String song;

    private Instrument instrument;

    @Override
    public void play() {

    }

    public void play(Instrument instrument) {
        this.instrument = instrument;
    }
}
