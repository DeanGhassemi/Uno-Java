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
    private String colourPlayed;
    private boolean playerTurn; //whose turn is currently is. False = player1

    public Game(String name) {
        this.name = name;
    }
    /** getter for playerTurn
     * 
     * @return current player turn
     */
    public boolean getPlayerTurn() {
        return this.playerTurn;
    }

    /** setter for playerTurn
     * 
     * @param playerTurn whose turn it is gonna be
     */
    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public String getColourPlayed() {
        return this.colourPlayed;
    }

    public void setColourPlayed(String colourPlayed) {
        this.colourPlayed = colourPlayed;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for recently played card
     * @return playedCard
     */
    public Card getPlayedCard() {
        return this.playedCard;
    }

    /**
     * Setter for playedCard
     * @param playedCard
     */
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
    
    /** Perform the skip card act
     * 
     * @param cardPlayed the card the player played
     * @param p player who played the card
     */
    public void skipLogic(Card cardPlayed, Player p){
        this.playedCard = cardPlayed;
        if(p == players.get(0)){
            this.playerTurn = false;
        }
        else{
            this.playerTurn = true;
        }

    }
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public void declareWinner(){

    }

}//end class
