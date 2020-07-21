
public class Card {
	

	int value;
	SuitEnum suit; 
	String type;
	
	public Card(int value, SuitEnum suit, String type) {
		this.value = value;
		this.suit = suit;
		this.type = type;
	}
	
	public void printCard(){
		System.out.println(type + " of "+ suit.toString() );
	}

}
