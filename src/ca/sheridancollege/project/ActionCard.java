package ca.sheridancollege.project;

public class ActionCard extends Card{
    private int number;
    public ActionCard(String colour, int number) {
        super(colour);
        this.number = number;
    }
    public void use(){

    }
    public String getColour(){
        return super.getColour();
    }
    public void setColour(String colour){
        super.setColour(colour);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
