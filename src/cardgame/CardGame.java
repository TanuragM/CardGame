
package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 
 * 
 */
public class CardGame {

	public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            Card[] hand = new Card[7];  
            Random random = new Random();
            for (int i=0; i<hand.length; i++)
            {
                   Card card = new Card();
                   card.setValue(random.nextInt(13)+1);
               
                   card.setSuit(Card.SUITS[random.nextInt(4)]);
 
                   hand[i] = card;
            }
                //print each card so we can see what was generated
                for(Card card: hand)
                {
                    System.out.println(card.getValue() + " of " + card.getSuit());
                }
                
                //ask user for Card
                System.out.println("Please choose a suit for your lucky card:");
                for(int i=0; i<Card.SUITS.length; i++)
                {
                    System.out.println((i+1) + ": " + Card.SUITS[i]);
                }
                
                int suit = input.nextInt();
                System.out.println("Enter a value (1 to 13)");
                int value = input.nextInt();
                //create new Card with the two values chosen
                Card userGuess = new Card(value,Card.SUITS[suit-1]);
                
                //check if it matches
                boolean match=false;
                for(Card card: hand)
                {
                    if(card.getValue()==userGuess.getValue() && 
                            (card.getSuit().equals(userGuess.getSuit())))
                    {
                        match=true;
                        break;
                    }
                }
                System.out.println("Did you guess it? " + match);
            
        }


}
