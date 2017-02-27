import java.util.*;

public class Player extends Npc{
	Player(String name){
		super(name);
	}
	@Override
	Card throwOne(){
		Scanner s = new Scanner(System.in);
		System.out.println("\n«Î ‰»Î≥ˆ≈∆–Ú∫≈£∫");
		int th = s.nextInt() - 1;
		if(th==-1){
			return newCatch;
		}
		Card ret = inHand[th];
		for(int i = th; i < 12; i++){
			inHand[i] = inHand[i+1];
		}
		inHand[12] = newCatch;
		Card tmp;
		for(int i = cardNum-1; i > 0; i--){
			if(inHand[i].Lesser(inHand[i-1])){
				tmp = inHand[i];
				inHand[i] = inHand[i-1];
				inHand[i-1] = tmp;
			}
		}
		return ret;
	}
	@Override
	boolean touchOne(Card c){
		return false;
	}
	void show(){
		System.out.println("\n");
		for(int i = 0; i < 13; i++){
			System.out.print(i+1+"."+inHand[i].toString()+' ');
		}
		System.out.print("0."+newCatch.toString());
	}
}
