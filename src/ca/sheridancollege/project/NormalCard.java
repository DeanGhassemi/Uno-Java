package ca.sheridancollege.project;

public class NormalCard extends Card{
    private int number;
    public NormalCard(String colour, int number) {
        super(colour);
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            "}";
    }

    
}
