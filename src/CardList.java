// create class CardList
import java.util.*;
public class CardList
{
  private Random random=new Random();
  private ArrayList<Card> cards;
  public CardList()
  {
    cards=new ArrayList<Card>();
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
  public Card takeCardFromTop()
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
  public Card get(int location)
  {
    return cards.get(location);
  }
  public Card seetop()
  {
    return cards.get(0);
  }
}
