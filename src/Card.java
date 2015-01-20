// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard
{
  public Card(int cardSuit, int cardRank)
  {
    super(cardSuit, cardRank);
  }
  public String toString()
  {
    String soot69;
    String ranke420;
    if(super.getRank()==10)
    {
      ranke420="T";
    }
    if(super.getRank()==11)
    {
      ranke420="J";
    }
    else if(super.getRank()==12)
    {
      ranke420="Q";
    }
    else if(super.getRank()==13)
    {
      ranke420="K";
    }
    else if(super.getRank()==1)
    {
      ranke420="A";
    }
    else if(super.getRank()==10)
    {
      ranke420="T";
    }
    else
    {
      ranke420=super.getRank()+"";
    }
    if(super.getSuit()==1)
    {
      soot69="H";
    }
    else if(super.getSuit()==2)
    {
      soot69="C";
    }
    else if(super.getSuit()==3)
    {
      soot69="D";
    }
    else if(super.getSuit()==4)
    {
      soot69="S";
    }
    else
    {
      soot69="ERROR";
    }
    return ranke420+"-"+soot69;
  }
  public int compareTo(Card other)
  {
    return (this.getRank())-(other.getRank());
  }
}

