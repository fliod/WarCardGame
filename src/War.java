import java.util.*;
public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    Scanner scan=new Scanner(System.in);
    CardDeck deck=new CardDeck();
    deck.shuffle();
    CardList hand1=new CardList();
    CardList hand2=new CardList();
    CardList stack1=new CardList();
    CardList stack2=new CardList();
    
    int rounds=1;
    // deal the cards
    for(int i=0;i<26;i++)
    {
      hand1.addCardToTop(deck.takeCardFromTop());
      hand2.addCardToTop(deck.takeCardFromTop());
    }
    System.out.println("A --- player --- B");
    while(hand1.size()>0 && hand2.size()>0)
    {
      System.out.println(hand1.size()+" ---round"+" "+rounds+"---"+hand2.size());
      stack1.addCardToTop(hand1.takeCardFromTop());
      stack2.addCardToTop(hand2.takeCardFromTop());
      System.out.println(("    "+stack1.get(0)).toString()+" : "+(stack2.get(0)).toString());
      while((stack1.get(0)).compareTo(stack2.get(0))==0)
      {
        if(hand1.size()>2 && hand2.size()>2)
        {
          System.out.println(hand1.size()+ " --- WAR --- "+hand2.size());
          stack1.addCardToTop(hand1.takeCardFromTop());
          stack2.addCardToTop(hand2.takeCardFromTop());
          stack1.addCardToTop(hand1.takeCardFromTop());
          stack2.addCardToTop(hand2.takeCardFromTop());
          System.out.println("    "+stack1.get(0)+" : "+stack2.get(0));
          if((stack1.get(0)).compareTo(stack2.get(0))>=1)
          {
            for(int i=0;i<stack1.size();i++)
            {
              //when p1 wins then all cards are drained to bottom of his hand
              hand1.addCardToBottom(stack1.takeCardFromTop());
              hand1.addCardToBottom(stack2.takeCardFromTop());
            }
            break; 
          }
          else if((stack2.get(0)).compareTo(stack1.get(0))>=1)
          {
            for(int i=0;i<stack2.size();i++)
            {
              //same but when p2 wins
              hand2.addCardToBottom(stack1.takeCardFromTop());
              hand2.addCardToBottom(stack2.takeCardFromTop());
            }
            break;
          }
          else
          {
          }
        }
        else if(hand1.size()<=2)
        {
          System.out.println("Player B wins!");
          break;
        }
        else if(hand2.size()<=2)
        {
          System.out.println("Player A wins!");
          break;
        }
      }
      //these check which card is bigger
      if((stack1.get(0)).compareTo(stack2.get(0))>0)
      {
        int ss=stack1.size();
        for(int i=0;i<ss;i++)
        {
          //when p1 wins then all cards are drained to bottom of his hand
          hand1.addCardToBottom(stack1.takeCardFromTop());
          hand1.addCardToBottom(stack2.takeCardFromTop());
        }
      }
      else if((stack2.get(0)).compareTo(stack1.get(0))>0)
      {
        int ss=stack2.size();
        for(int i=0;i<ss;i++)
        {
          //same but when p2 wins
          hand2.addCardToBottom(stack1.takeCardFromTop());
          hand2.addCardToBottom(stack2.takeCardFromTop());
        }
      }
      rounds++;
    }
    if(hand1.size()>0)
    {
      System.out.println("------WINNER-------\nPlayer A wins!\n");
    }
    else
    {
      System.out.println("------WINNER-------\nPlayer B wins!\n");
    }
  }
}
