package ca.sheridancollege.project;

public class ActionCard extends Card{
    private int number;
    public ActionCard(String colour, int number) {
        super(colour);
        this.number = number;
    }
    /**
     * Drawing the card chosen
     */
    public void use(){

    }
    /**
     * @return card's colour
     */
    public String getColour(){
        return super.getColour();
    }
    /**
     * set card's colour
     */
    public void setColour(String colour){
        super.setColour(colour);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
