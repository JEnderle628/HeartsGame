import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>();

	public Deck(){
		deck.add(new Card(2,SuitEnum.Heart, "two"));
		deck.add(new Card(3,SuitEnum.Heart, "three"));
		deck.add(new Card(4,SuitEnum.Heart, "four"));
		deck.add(new Card(5,SuitEnum.Heart, "five"));
		deck.add(new Card(6,SuitEnum.Heart, "six"));
		deck.add(new Card(7,SuitEnum.Heart, "seven"));
		deck.add(new Card(8,SuitEnum.Heart, "eight"));
		deck.add(new Card(9,SuitEnum.Heart, "nine"));
		deck.add(new Card(10,SuitEnum.Heart, "ten"));
		deck.add(new Card(11,SuitEnum.Heart, "Jack"));
		deck.add(new Card(12,SuitEnum.Heart, "Queen"));
		deck.add(new Card(13,SuitEnum.Heart, "King"));
		deck.add(new Card(14,SuitEnum.Heart, "Ace"));
		
		deck.add(new Card(2,SuitEnum.Spade, "two"));
		deck.add(new Card(3,SuitEnum.Spade, "three"));
		deck.add(new Card(4,SuitEnum.Spade, "four"));
		deck.add(new Card(5,SuitEnum.Spade, "five"));
		deck.add(new Card(6,SuitEnum.Spade, "six"));
		deck.add(new Card(7,SuitEnum.Spade, "seven"));
		deck.add(new Card(8,SuitEnum.Spade, "eight"));
		deck.add(new Card(9,SuitEnum.Spade, "nine"));
		deck.add(new Card(10,SuitEnum.Spade, "ten"));
		deck.add(new Card(11,SuitEnum.Spade, "Jack"));
		deck.add(new Card(12,SuitEnum.Spade, "Queen"));
		deck.add(new Card(13,SuitEnum.Spade, "King"));
		deck.add(new Card(14,SuitEnum.Spade, "Ace"));
		
		deck.add(new Card(2,SuitEnum.Diamond, "two"));
		deck.add(new Card(3,SuitEnum.Diamond, "three"));
		deck.add(new Card(4,SuitEnum.Diamond, "four"));
		deck.add(new Card(5,SuitEnum.Diamond, "five"));
		deck.add(new Card(6,SuitEnum.Diamond, "six"));
		deck.add(new Card(7,SuitEnum.Diamond, "seven"));
		deck.add(new Card(8,SuitEnum.Diamond, "eight"));
		deck.add(new Card(9,SuitEnum.Diamond, "nine"));
		deck.add(new Card(10,SuitEnum.Diamond, "ten"));
		deck.add(new Card(11,SuitEnum.Diamond, "Jack"));
		deck.add(new Card(12,SuitEnum.Diamond, "Queen"));
		deck.add(new Card(13,SuitEnum.Diamond, "King"));
		deck.add(new Card(14,SuitEnum.Diamond, "Ace"));
		
		deck.add(new Card(2,SuitEnum.Club, "two"));
		deck.add(new Card(3,SuitEnum.Club, "three"));
		deck.add(new Card(4,SuitEnum.Club, "four"));
		deck.add(new Card(5,SuitEnum.Club, "five"));
		deck.add(new Card(6,SuitEnum.Club, "six"));
		deck.add(new Card(7,SuitEnum.Club, "seven"));
		deck.add(new Card(8,SuitEnum.Club, "eight"));
		deck.add(new Card(9,SuitEnum.Club, "nine"));
		deck.add(new Card(10,SuitEnum.Club, "ten"));
		deck.add(new Card(11,SuitEnum.Club, "Jack"));
		deck.add(new Card(12,SuitEnum.Club, "Queen"));
		deck.add(new Card(13,SuitEnum.Club, "King"));
		deck.add(new Card(14,SuitEnum.Club, "Ace"));
		
		
	}
	
	public Card getRandomCard(){
		Random random = new Random();
		int randomIndex = random.nextInt(deck.size());
		Card randomCard = deck.get(randomIndex);
		deck.remove(randomIndex);
		return randomCard;
		
	}

}



