// create class CardList
// create class CardList
import java.util.*;
public class CardList
{
  private Random random=new Random();
  private ArrayList<Card> cards=new ArrayList<Card>(52);
  public CardList()
  {
    for(int i=1;i<=4;i++)
    {
      for(int x=1;x<=26;x++)
      {
        Card tempCard=new Card(i,x);
        cards.add(tempCard);
      }
    }
  }
  public int size()
  {
    return cards.size();
  }
  public void addCardToBottom(Card card)
  {
    cards.add(card);
  }
  public void addCardToTop(Card card)
  {
    cards.add(0,card);
  }
  public Card takeCardFromTop(Card card)
  {
    Card temp=cards.get(0);
    cards.remove(0);
    return temp;
  }
  public Card removeRandomCard()
    //Ask about this, do I need to know which card was removed? It would only make sense.
  {
    int r=random.nextInt(cards.size());
    Card temp=cards.get(r);
    cards.remove(r);
    return temp;
  }
}
  
  
