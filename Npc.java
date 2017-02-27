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
		Card tmp;
		for(int i = 12; i > 0; i--){
			if(inHand[i].Lesser(inHand[i-1])){
				tmp = inHand[i];
				inHand[i] = inHand[i-1];
				inHand[i-1] = tmp;
			}
		}
		System.out.print(name + ':' + ret.toString() + ' ');
		return ret;
	}
	void catchOne(Card c){
		if(cardNum<13){
			inHand[cardNum] = c;
			cardNum++;
			Card tmp;
			for(int i = cardNum-1; i > 0; i--){
				if(inHand[i].Lesser(inHand[i-1])){
					tmp = inHand[i];
					inHand[i] = inHand[i-1];
					inHand[i-1] = tmp;
				}
			}
		}
		else newCatch = c;
	}
	boolean touchOne(Card c){
		return false;
	}
}
