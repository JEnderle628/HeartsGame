import java.util.ArrayList;

public class Player {
	
	private int numOfPoints = 0;
	private String name = null;
	private ArrayList<Card> hand = new ArrayList();
	
	public Player(){
		numOfPoints = 0;
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	public void addCard(Card card){
		hand.add(card);
	}
	
	public void removeCard(Card card){
		hand.remove(card);
	}
	
	public void showHand(){
		for(int i = 0; i<hand.size(); i++){
			System.out.println(hand.get(i).value+hand.get(i).suit.toString()+hand.get(i).type);
		}
	}
	
	public boolean isLead(){
		for(int i = 0; i<hand.size(); i++){
			if(hand.get(i).value == 2 && hand.get(i).suit.equals(SuitEnum.Club)){
				return true;
			}
		}
		return false;
	}
	
	public void playHand(){
		
	}

}
