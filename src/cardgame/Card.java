
package cardgame;

/**
 * 
 */
public class Card 
{
   

  
    private int value;
    private String suit;
    
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "clubs"};
   public Card()
   {
       
   }
  
    public Card(int v, String s)
   {
       this.suit=s;
       this.value=v;
   }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    static class Value {

        public Value() {
        }
    }
   
    
}
