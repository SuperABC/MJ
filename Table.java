import java.util.*;

public class Table {
	static Npc npc1 = new Npc("ymdl"), npc2 = new Npc("hhh"), npc3 = new Npc("orz");
	static Player player;
	static Manager manager = new Manager();
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = s.nextLine();
		player = new Player(name);
		int next = 0;
		for(int i = 0; i < 13; i++){
			npc1.catchOne(manager.Distribute());
			npc2.catchOne(manager.Distribute());
			npc3.catchOne(manager.Distribute());
			player.catchOne(manager.Distribute());
		}
		Card newOne;
		while(!manager.Empty()){
			switch(next){
			case 0:
				player.catchOne(manager.Distribute());
				player.show();
				newOne = player.throwOne();
				if(npc1.touchOne(newOne))next = 1;
				if(npc2.touchOne(newOne))next = 2;
				if(npc3.touchOne(newOne))next = 3;
				break;
			case 1:
				npc1.catchOne(manager.Distribute());
				newOne = npc1.throwOne();
				if(player.touchOne(newOne))next = 0;
				if(npc2.touchOne(newOne))next = 2;
				if(npc3.touchOne(newOne))next = 3;
				break;
			case 2:
				npc2.catchOne(manager.Distribute());
				newOne = npc2.throwOne();
				if(player.touchOne(newOne))next = 0;
				if(npc1.touchOne(newOne))next = 1;
				if(npc3.touchOne(newOne))next = 3;
				break;
			case 3:
				npc3.catchOne(manager.Distribute());
				newOne = npc3.throwOne();
				if(player.touchOne(newOne))next = 0;
				if(npc1.touchOne(newOne))next = 1;
				if(npc2.touchOne(newOne))next = 2;
				break;
			}
			next = (next+1)%4;
		}
	}
}
