package Game;

public class MyGame {
	public static void main (String [] args) {
		
		
		Player p1 = new Player (new Pistol()); //Injecting dependency
		p1.setWeapon1(new Pistol());      
		p1.setWeapon2(new Shotgun());      
		//vd nếu có thêm sniper class thì chỉ cần add nó vào đây là xong, k bị depend.
		
		
	}

}
