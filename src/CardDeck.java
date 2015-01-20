// create class CardDeck that extends CardList
import java.util.*;
public class CardDeck extends CardList
{
  private Random random=new Random();
  private int suits=4;
  private int ranks=13;
  private int swaps=10000;
  public CardDeck()
  {
    super();
    for(int i=1;i<=4;i++)
    {
      for(int x=1;x<=13;x++)
      {
        Card tempCard=new Card(i,x);
        this.addCardToTop(tempCard);
      }
    }
  }
  public void shuffle()
  {
    Card temp;
    for(int i=0;i<swaps;i++)
    {
      temp=this.removeRandomCard();
      this.addCardToTop(temp);
    }
  }
}
