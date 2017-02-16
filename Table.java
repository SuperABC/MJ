import java.util.*;

public class Table {
	static Npc npc1 = new Npc("ymdl"), npc2 = new Npc("hahaha"), npc3 = new Npc("orz");
	static Player player;
	static Manager manager = new Manager();
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = s.nextLine();
		player = new Player(name);
		for(int i = 0; i < 13; i++){
			npc1.catchOne(manager.Distribute());
			npc2.catchOne(manager.Distribute());
			npc3.catchOne(manager.Distribute());
			player.catchOne(manager.Distribute());
		}
		player.catchOne(manager.Distribute());
		while(!manager.Empty()){
			player.show();
			player.throwOne();
		}
	}
}
