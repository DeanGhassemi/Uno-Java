package ca.sheridancollege.project;
/**
 * @author Dean Ghassemi
 * @author Justin Joseph
 */ 
public class WildCard extends Card {

    private boolean WildFour;

    public WildCard(boolean WildFour) {
        this.WildFour = WildFour;
    }


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
        if(this.WildFour){
            return "Wild Draw Four";
        }
        return "Wild Card";

    }

    
}
