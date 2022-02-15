/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Deck {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the deck

    public Deck(){} // For discard pile

    public Deck(int size) {
        this.size = size;
    }

    /**
     * A method that will create the deck as an ArrayList
     */
    public void createDeck(){

    }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /** 
     * Shuffle the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * A method that will give out a card.
     *
     * @return a card.
     */
    public Card drawCard(){
        // filler to avoid annoying errors
        Card givenCard = this.cards.get(0);
        this.cards.remove(0);
        this.size -= 1;
        return givenCard;
    }
    public void addCard(Card card){
        cards.add(card);
    }

}//end class
