package ca.sheridancollege.project;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    /**
     * @return the player name
     */
    public String getName() {
        return super.getName();
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Print their hand with numbers along each card so the player can choose.
     * Some thing like so
     * 1) 1Blue
     * 2) 4Red
     * 
     * Depends on how we display each card
     */
    public void showHand(){

    }
    /**
     * Add card to player's hand
     */
    public void addCard(){

    }
    
    @Override
    /**
     * Depends on their move and how we implement it
     */
    public void play() {
        // TODO Auto-generated method stub
        
    }

}
