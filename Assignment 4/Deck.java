package sem4_java;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public class Deck {

    Scanner sc= new Scanner(System.in);
    String[] suit={"Club","Spade","Heart","Diamond"};
    String[] value={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    ArrayList<Card> card =new ArrayList<Card>();

    public void createDeck(){
        for (int i =0;i<value.length;i++){
            for (int j = 0;j < suit.length;j++){
            this.card.add(new Card(suit[j],value[i]));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.card);
    }

    public void showCards(){
        System.out.println(this.card);
    }

    public Object topCard(){
        return card.get(0);
    }

    public Card createCard() {
        System.out.println("Enter the Suit of the card \n ");
        String suit= sc.nextLine();
        System.out.println("Enter the Value of the card \n ");
        String value=sc.nextLine();
        return new Card(suit,value);
    }
    public void compareCard(Card c,Card v){

        ArrayList <String> suitorder=new ArrayList<String>(Arrays.asList(suit));
        ArrayList <String> valueorder= new ArrayList<String>(Arrays.asList(value));
        int csuitorder=suitorder.indexOf(c.getSuit());
        int cvalorder=valueorder.indexOf(c.getValue());
        int vsuitorder=suitorder.indexOf(v.getSuit());
        int vvalueorder=valueorder.indexOf(v.getValue());
        if (c.getSuit()==v.getSuit() && c.getValue()==v.getValue())
        {
            System.out.println("The cards are similar ");
        }
        else if (cvalorder>vvalueorder || (cvalorder==vvalueorder && csuitorder>vsuitorder))
        {
            System.out.println("The first card is higher");
        }
        else if (cvalorder<vvalueorder || (cvalorder==vvalueorder &&
                csuitorder<vsuitorder)) {
            System.out.println("The second card is higher");
        }
    }
    public void sortCard(){
        ArrayList<String> deckcrds= new ArrayList<String>();
        for(Card crd:card){
            deckcrds.add(crd.getValue()+crd.getSuit());
        }
        Collections.sort(deckcrds);
        System.out.println(deckcrds);
    }
    public void findCard(String val , String suit){
        int flag=0;
        for (Card crd:this.card){
            if((crd.getSuit().equals(suit)) && (crd.getValue().equals(val))) {
                System.out.println("Card Found at "+this.card.indexOf(crd)+" of the deck");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Card not found ");
        }
    }
    public void sameCard(Card c){
        String c_val=c.getValue();
        String c_suit=c.getSuit();
        System.out.println("Cards similar to the given card are ");
        for(Card crd:this.card){
            if(crd.getSuit().equals(c_suit)&& !(crd.getValue().equals(c_val))){ System.out.println(crd);
            }
        }
    }
    public ArrayList<Card> deal(){
        // loop to print elements at randonm
        ArrayList<Card> dealcards=new ArrayList<Card>();
        for (int i = 0; i < 5; i++)
        {
            // generating the index using Math.random()
            int index = (int)(Math.random() * card.size());
            dealcards.add(card.get(index));
        }
        return dealcards;
    }
    }

