package sem4_java;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck=new Deck();
        int k=1;
        while(k==1){
            System.out.println("enter your choice of function\n1.Create Deck\n2.Display Deck\n3.Shuffle Dec\n4.Top Card in Deck\n5.Compare Cards\n6.Sort Card\n7. Find Card\n8. Deal Card\n9.SameCard\n");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    deck.createDeck();
                    break;
                case 2:
                    deck.showCards();
                    break;
                case 3:
                    deck.shuffleDeck();
                    System.out.println("the cards after shuffling is: ");
                    deck.showCards();
                    break;
                case 4:
                    System.out.println("the top card value is "+deck.topCard());
                    break;
                case 5:
                    Card c = deck.createCard();
                    Card v = deck.createCard();
                    deck.compareCard(c,v);
                    break;
                case 6:
                    deck.sortCard();
                    break;
                case 7:
                    System.out.println("enter the value of the card you want to search \n");
                    sc.nextLine();
                    String valsearch = sc.nextLine();
                    System.out.println("\n Enter the suit of the card you want to search");
                    String suitsearch=sc.nextLine();
                    deck.findCard(valsearch,suitsearch);
                    break;
                case 8:
                    System.out.println(deck.deal());
                    break;
                case 9:
                    Card e=deck.createCard();
                    deck.sameCard(e);
                    break;

            }
            System.out.println("\n Press 1 to contine \n");
            k=sc.nextInt();
        }

    }



    }
