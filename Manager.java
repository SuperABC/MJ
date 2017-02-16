import java.util.*;

public class Manager {
	final private Card[] whole;
	private boolean[] revealed = new boolean[108];
	Manager(){
		whole = new Card[108];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				for(int k = 0; k < 4; k++){
					whole[i*36+j*4+k] = new Card(j+1, i+1);
				}
			}
		}
		for(int i = 0; i < 108; i++){
			revealed[i] = false;
		}
	}
	Card Distribute(){
		int tmp;
		while(revealed[tmp = (int)(Math.random()*108)]);
		revealed[tmp] = true;
		return whole[tmp];
	}
	boolean Empty(){
		int i;
		for(i = 0; i < 108; i++){
			if(!revealed[i])break;
		}
		if(i==108)return true;
		else return false;
	}
}

