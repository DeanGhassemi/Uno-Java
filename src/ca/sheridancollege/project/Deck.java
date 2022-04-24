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
 * @author Dean Ghassemi
 */
public class Deck {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList<>();
    private int size;//the size of the deck

    public Deck(){} // For discard pile

    public Deck(int size) {
        this.size = size;
    }

    /**
     * A method that will create the deck as an ArrayList
     */
    public void createDeck(){
        /** Numbers go from 1 to 9 inclusively and cards like reverse and skip
         *  also have multiple ones. Each one of those cards have at least 2 of
         *  each colour.
         **/

         //Start by creating all cards and add them to the deck
         for(int i = 1; i < 25; i++){
            if(i == 10 || i == 22){
                cards.add(new ActionCard("red", "skip"));
                cards.add(new ActionCard("blue", "skip"));
                cards.add(new ActionCard("green", "skip"));
                cards.add(new ActionCard("yellow", "skip"));
                cards.add(new WildCard(false));
                cards.add(new WildCard(true));
            }
            else if(i == 11 || i == 23){
                cards.add(new ActionCard("red", "reverse"));
                cards.add(new ActionCard("blue", "reverse"));
                cards.add(new ActionCard("green", "reverse"));
                cards.add(new ActionCard("yellow", "reverse"));
                cards.add(new WildCard(false));
                cards.add(new WildCard(true));
            }
            else if(i == 12 || i == 24){
                cards.add(new ActionCard("red", "drawTwo"));
                cards.add(new ActionCard("blue", "drawTwo"));
                cards.add(new ActionCard("green", "drawTwo"));
                cards.add(new ActionCard("yellow", "drawTwo"));
                cards.add(new WildCard(false));
                cards.add(new WildCard(true));
                /* added twice since the occurance happens twice and there are
                only 3 if else statements */ 
                cards.add(new WildCard(false));
                cards.add(new WildCard(true));
            }
            else{
                if(i > 9){
                    cards.add(new NormalCard("red", i - 12));
                    cards.add(new NormalCard("blue", i - 12));
                    cards.add(new NormalCard("green", i - 12));
                    cards.add(new NormalCard("yellow", i - 12));

                }
                else{
                    cards.add(new NormalCard("red", i));
                    cards.add(new NormalCard("blue", i));
                    cards.add(new NormalCard("green", i));
                    cards.add(new NormalCard("yellow", i));

                }
            }
         }
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
     * A method that will give out a card at the top of the deck.
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
    /**
     * A method that will give out a card that is chosen.
     *
     * @return a card.
     */
    public Card drawCard(String card){
        // filler to avoid annoying errors
        if(card.equals("red 1")){
            return new NormalCard("red", 1);
        }
        Card givenCard = this.cards.get(0);
        this.cards.remove(0);
        this.size -= 1;
        return givenCard;
    }
    /**
     * Add card to deck, mostly used for discard pile
     * @param card
     */
    public void addCard(Card card){
        cards.add(card);
    }

}//end class
