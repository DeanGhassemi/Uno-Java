/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

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
    public void addCard(){

    }
    
    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public void play(){

    }

}
