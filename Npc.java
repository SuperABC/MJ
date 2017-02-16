import java.util.*;

public class Npc {
	protected String name;
	protected Card[] inHand = new Card[13];
	protected Card newCatch;
	protected int cardNum = 0;
	Npc(String name){
		this.name = name;
	}
	Card throwOne(){
		Card ret = inHand[12];
		inHand[12] = newCatch;
		return ret;
	}
	void catchOne(Card c){
		if(cardNum<13){
			inHand[cardNum] = c;
			cardNum++;
		}
		else newCatch = c;
	}
	boolean touchOne(){
		return false;
	}
}
