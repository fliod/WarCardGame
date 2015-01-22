import java.util.*;
public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    
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
      hand1.shuffle();
      hand2.shuffle();
      System.out.println(hand1.size()+" ---round"+" "+rounds+"---"+hand2.size());
      stack1.addCardToTop(hand1.takeCardFromTop());
      stack2.addCardToTop(hand2.takeCardFromTop());
      System.out.println(("    "+stack1.get(0)).toString()+" : "+(stack2.get(0)).toString());
      int compare = stack1.get(0).compareTo(stack2.get(0));
      while(compare == 0 && stack1.size()>1 && stack2.size()>1 )
        {
          System.out.println(hand1.size()+ " --- WAR --- "+hand2.size());
          if(hand1.size()>1 && hand2.size()>1)
          {
            stack1.addCardToTop(hand1.takeCardFromTop());
            stack2.addCardToTop(hand2.takeCardFromTop());
            System.out.println("    "+stack1.get(0)+" : "+stack2.get(0));
            compare=stack1.get(0).compareTo(stack2.get(0));
          }
        }
//these check which card is bigger
      if(compare>0)
      {
        int ss1=stack1.size();
        for(int i=0;i<ss1;i++)
        {
          //when p1 wins then all cards are drained to bottom of his hand
          hand1.addCardToBottom(stack1.takeCardFromTop());
          hand1.addCardToBottom(stack2.takeCardFromTop());
        }
      }
      else if(compare<0)
      {
        int ss2=stack2.size();
        for(int i=0;i<ss2;i++)
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
