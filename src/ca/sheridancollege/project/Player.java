/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

    private String name; //the unique name for this player
    private ArrayList<Card> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
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
        System.out.println("Your Hand: ");
        for(int i = 0; i < hand.size(); i++){
            System.out.println("" + (i + 1) + ") " + hand.get(i));
        }
    }
    /**
     * Add card to player's hand
     */
    public void addCard(Deck deckOfCards){
        hand.add(deckOfCards.drawCard());
    }
    
    /** Player chooses a card to play (Might not need "useCard()" in any of the
     * card classes. Just a note for later).
     * 
     * @return Card playing played
     */
    public Card play(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which card would you like to play?");
        /**
         * Need to add something to check for invalid inputs such as
         *     - Out of range index
         *     - String inputs
         *     - etc
         */
        int indexOfCard = input.nextInt();
        Card playingCard = hand.get(indexOfCard);
        if(playingCard instanceof WildCard){
            System.out.println("What colour do you choose?");
            String colour = input.next().toLowerCase();
            playingCard.setColour(colour);
            hand.remove(indexOfCard);
        }
        return playingCard;
    }
}
