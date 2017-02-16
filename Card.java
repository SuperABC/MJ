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
		case 1:ret+="һ";break;
		case 2:ret+="��";break;
		case 3:ret+="��";break;
		case 4:ret+="��";break;
		case 5:ret+="��";break;
		case 6:ret+="��";break;
		case 7:ret+="��";break;
		case 8:ret+="��";break;
		case 9:ret+="��";break;
		}
		switch(color){
		case 1:ret+="��";break;
		case 2:ret+="Ͳ";break;
		case 3:ret+="��";break;
		}
		return ret;
	}
	void Show(){
		System.out.println(this.toString());
	}
}
