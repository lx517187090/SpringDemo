package demo;

public class PoeticJuggler extends Juggler{

    private Poem poem;
    @Override
    public void perform() {
        super.perform();
    }

    public PoeticJuggler(int beanBags,Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }
}
