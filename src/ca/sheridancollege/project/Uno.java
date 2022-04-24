package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * @author Dean Ghassemi
 */ 
public class Uno {
    public static void main(String[] args) {
        Game UNO = new Game("Uno");
        // Once a card is played, it will go into this deck
        // 
        Deck discardPile = new Deck(); // might be moved into Game Class.
        Deck playDeck = new Deck();
        playDeck.createDeck();
        playDeck.shuffle();

        //Getting players
        System.out.println("Welcome to UNO, this version is a two players");
        System.out.println("What is the name of Player 1?");
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(input.nextLine());
        System.out.println("What is the name of player 2?");
        Player player2 = new Player(input.nextLine());
        UNO.getPlayers().add(player1);
        UNO.getPlayers().add(player2);

        /**
         * Starting game
         */
        
        // Hand out the cards
        for(int i = 0; i < 7; i++){
            player1.getHand().add(playDeck.drawCard());
            player2.getHand().add(playDeck.drawCard());
        }
        // Set default played card in the beginning
        UNO.setPlayedCard(playDeck.drawCard());


        //Players playing the game
        while(player1.getHand().size() > 1 || player2.getHand().size() > 1){

            //Player Turns
            if(!UNO.getPlayerTurn()){
                //Printing player's hand
                player1.showHand();
                // Choosing Card
                System.out.println("Which card do you want to play? Choose" +
                " the index");

                //Calling UNO
                if(player2.getHand().size() == 1){
                    System.out.println("Call UNO? Y/N");
                    if(input.nextLine().equalsIgnoreCase("Y")){

                    }
                }
                else{
                    String strMove;
                    strMove = input.nextLine();
                    try{
                        Integer.parseInt(strMove);
                    }catch(Exception e){
                        System.out.println("Invalid input");
                        continue;
                    }
                    int move = Integer.parseInt(strMove);
                    //Check for SKIP
                    if(player1.getHand().get(move - 1).toString().contains("skip")){
                        UNO.skipLogic(player1.getHand().get(move - 1), player1);
                    }
                    //Check for REVERSE (in a two player game, its a skip)
                    else if(player1.getHand().get(move - 1).toString().contains("reverse")){
                        UNO.skipLogic(player1.getHand().get(move - 1), player1);
                    }
                    //Check for DRAWTWO
                    else if(player1.getHand().get(move - 1).toString().contains("drawTwo")){
                        
                    }
                    //Check for WILDCARD
                    else if(player1.getHand().get(move - 1) instanceof WildCard){
                        
                    }
                    //Check for WILDDRAWFOUR
                    else if(player1.getHand().get(move - 1) instanceof WildCard && 
                    player1.getHand().get(move - 1).getWildFour() == true){
                        
                    }
                    //Check for normal card
                    else{

                    }
                }


            }
            else{
                System.out.println("Your hand:");
                for(int i = 1; i < player2.getHand().size() + 1; i++){
                    System.out.println(i + ": " + player2.getHand().get(i - 1));
                }
            }
        }
        

    }
}
