package Day3.Zadanie2;

public class Poem {

    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator(){
        return creator;
    }

    public int getStropheNumbers(){
        return stropheNumbers;

    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }

    public void prin(){
        System.out.println(toString());
    }
}
