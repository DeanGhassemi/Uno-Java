package ca.sheridancollege.project;
/**
 * @author Dean Ghassemi
 * @author Justin Joseph
 */ 
public class WildCard extends Card {

    public WildCard(String colour) {
        super(colour);
    }

    private boolean WildFour;

    @Override
    public boolean getWildFour(){
        return WildFour;
    }

    @Override
    public void setWildFour(boolean WildFour){
        this.WildFour = WildFour;

    }

    @Override
    public String toString() {
        return null;
    }

    
}
