import java.util.*;

public class Player extends Npc{
	Player(String name){
		super(name);
	}
	@Override
	Card throwOne(){
		Scanner s = new Scanner(System.in);
		System.out.println("\n«Î ‰»Î≥ˆ≈∆–Ú∫≈£∫");
		int th = s.nextInt();
		Card ret = inHand[th];
		inHand[th] = newCatch;
		return ret;
	}
	@Override
	boolean touchOne(){
		return false;
	}
	void show(){
		for(int i = 0; i < 13; i++){
			System.out.print(inHand[i].toString()+' ');
		}
	}
}
