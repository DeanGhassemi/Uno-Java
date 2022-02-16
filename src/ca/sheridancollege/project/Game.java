/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Dean Ghassemi
 */
public class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players = new ArrayList<Player>();// the players of the game
    private Card playedCard; //Current colour that needs to be matched

    public Game(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public Card getPlayedCard() {
        return this.playedCard;
    }

    public void setPlayedCard(Card playedCard) {
        this.playedCard = playedCard;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public void declareWinner(){

    }

}//end class
