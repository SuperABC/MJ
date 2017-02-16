import java.util.*;

class Card {
	private int rank;
	private int color;
	Card(int rank, int color){
		this.rank = rank;
		this.color = color;
	}
	boolean Greater(Card c){
		return color==c.color?rank>c.rank:color>c.color;
	}
	boolean Lesser(Card c){
		return color==c.color?rank<c.rank:color<c.color;
	}
	boolean Equal(Card c){
		return color==c.color&&rank==c.rank;
	}
	public String toString(){
		String ret = new String("");
		switch(rank){
		case 1:ret+="一";break;
		case 2:ret+="二";break;
		case 3:ret+="三";break;
		case 4:ret+="四";break;
		case 5:ret+="五";break;
		case 6:ret+="六";break;
		case 7:ret+="七";break;
		case 8:ret+="八";break;
		case 9:ret+="九";break;
		}
		switch(color){
		case 1:ret+="万";break;
		case 2:ret+="筒";break;
		case 3:ret+="条";break;
		}
		return ret;
	}
	void Show(){
		System.out.println(this.toString());
	}
}
