package sem4_java;
import java.util.*;

public class Card {
    Scanner sc = new Scanner(System.in);
    private String suit;
    private String value;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Card(String suit, String value) {
        this.suit=suit;
        this.value=value;
    }

    public String toString(){
        return "\n Value of card is "+value+" of "+suit+".";
    }

}
