// create class CardDeck that extends CardList
// create class CardDeck that extends CardList
import java.util.*;
public class CardDeck extends CardList
{
  private Random random=new Random();
  private int suits;
  private int ranks;
  private int swaps;
  public CardDeck()
  {
    super();
  }
  public ArrayList shuffle(ArrayList cards)
  {
    int r;
    int x;
    ArrayList out=cards;
    Card temp;
    for(int i=0;i<10000;i++)
    {
      r=random.nextInt(cards.size());
      x=random.nextInt(cards.size());
      temp=(Card)out.get(r);
      out.set(r,out.get(x));
      out.set(x,temp);
    }
    return out;
  }
}
