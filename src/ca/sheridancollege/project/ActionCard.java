package ca.sheridancollege.project;

/**
 * @author Dean Ghassemi
 * @author Justin Joseph
 */ 

public class ActionCard extends Card{
    
    private String type;

    public ActionCard(String colour, String type) {
        super(colour);
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
    
    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            "}";
    }

}

    
