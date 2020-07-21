import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMaster {



	Deck deck = new Deck();

	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();	
	Player player4 = new Player();

	Map<Integer, Player> playerMap = new HashMap<Integer, Player>();
	Integer leadPlayer = 0;

	public GameMaster(){
		deck = new Deck();
		playerMap.put(1, player1);
		player1.setName("Player 1");
		playerMap.put(2, player2);
		player2.setName("Player 2");
		playerMap.put(3, player3);
		player3.setName("Player 3");
		playerMap.put(4, player4);
		player4.setName("Player 4");
	}

	public void Deal(){
		for(int i =0; i<13; i++){
			player1.addCard(deck.getRandomCard());
			player2.addCard(deck.getRandomCard());
			player3.addCard(deck.getRandomCard());
			player4.addCard(deck.getRandomCard());
		}
	}
	public void findFirstPlayer(){
		for(Map.Entry<Integer, Player> entry : playerMap.entrySet()){
			if(entry.getValue().isLead()){
				leadPlayer = entry.getKey();
				break;
			}
		}
	}

	public void cardsPlayed(ArrayList<Card> cardsPlayed){
		for(int i=0; i<cardsPlayed.size(); i++){
			cardsPlayed.get(i).printCard();
		}
	}

	public void roundOne(){
		Player currentPlayer = playerMap.get(leadPlayer); 
		System.out.println(currentPlayer.getName() + " play a card");
		ArrayList<Card> cardsPlayed = new ArrayList<Card>();
		System.out.println("Cards played: ");
		cardsPlayed(cardsPlayed);
		System.out.println("Pick a card to play ");
		ArrayList<Card> currentHand = currentPlayer.getHand();
		for(int i=0; i<currentHand.size(); i++){
			System.out.print(i+1 + ".)"); 
			currentHand.get(i).printCard();
		}
		Scanner scan = new Scanner(System.in);
		int cardChoice = scan.nextInt();
		while(cardChoice<1 || cardChoice>currentHand.size()){
			System.out.println("Please enter a proper choice");
			cardChoice = scan.nextInt();
		}
		cardsPlayed.add(currentHand.get(cardChoice-1));
		currentPlayer.removeCard(currentHand.get(cardChoice-1));
		

		if(leadPlayer<4){
			leadPlayer++;
			currentPlayer = playerMap.get(leadPlayer);
		}
		else{
			leadPlayer = 1;
			currentPlayer = playerMap.get(leadPlayer);
		}
		
		
		System.out.println(currentPlayer.getName() + " play a card");
		System.out.print("Cards played: ");
		cardsPlayed(cardsPlayed);
		System.out.println("Pick a card to play ");
		currentHand = currentPlayer.getHand();
		for(int i=0; i<currentHand.size(); i++){
			System.out.print(i+1 + ".)"); 
			currentHand.get(i).printCard();
		}
		cardChoice = scan.nextInt();
		while(cardChoice<1 || cardChoice>currentHand.size()){
			System.out.println("Please enter a proper choice");
			cardChoice = scan.nextInt();
		}
		cardsPlayed.add(currentHand.get(cardChoice-1));
		currentPlayer.removeCard(currentHand.get(cardChoice-1));
		

		if(leadPlayer<4){
			leadPlayer++;
			currentPlayer = playerMap.get(leadPlayer);
		}
		else{
			leadPlayer = 1;
			currentPlayer = playerMap.get(leadPlayer);
		}
		
		System.out.println(currentPlayer.getName() + " play a card");
		System.out.print("Cards played: ");
		cardsPlayed(cardsPlayed);
		System.out.println("Pick a card to play ");
		currentHand = currentPlayer.getHand();
		for(int i=0; i<currentHand.size(); i++){
			System.out.print(i+1 + ".)"); 
			currentHand.get(i).printCard();
		}
		cardChoice = scan.nextInt();
		while(cardChoice<1 || cardChoice>currentHand.size()){
			System.out.println("Please enter a proper choice");
			cardChoice = scan.nextInt();
		}
		cardsPlayed.add(currentHand.get(cardChoice-1));
		currentPlayer.removeCard(currentHand.get(cardChoice-1));
		

		if(leadPlayer<4){
			leadPlayer++;
			currentPlayer = playerMap.get(leadPlayer);
		}
		else{
			leadPlayer = 1;
			currentPlayer = playerMap.get(leadPlayer);
		}
		
		System.out.println(currentPlayer.getName() + " play a card");
		System.out.print("Cards played: ");
		cardsPlayed(cardsPlayed);
		System.out.println("Pick a card to play ");
		currentHand = currentPlayer.getHand();
		for(int i=0; i<currentHand.size(); i++){
			System.out.print(i+1 + ".)"); 
			currentHand.get(i).printCard();
		}
		cardChoice = scan.nextInt();
		while(cardChoice<1 || cardChoice>currentHand.size()){
			System.out.println("Please enter a proper choice");
			cardChoice = scan.nextInt();
		}
		cardsPlayed.add(currentHand.get(cardChoice-1));
		currentPlayer.removeCard(currentHand.get(cardChoice-1));
		

		if(leadPlayer<4){
			leadPlayer++;
			currentPlayer = playerMap.get(leadPlayer);
		}
		else{
			leadPlayer = 1;
			currentPlayer = playerMap.get(leadPlayer);
		}
		
	}
	public void roundTwo(){
		
		
	}



}
