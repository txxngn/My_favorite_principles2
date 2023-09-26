package Game;

public class Player {


	private Weapon primaryWeapon;
	private Weapon weapon1;
	private Weapon weapon2;
	
	
	
	public Player(Weapon weapon) {
		//Dependency Injection with COnstructor
		//primaryWeapon = new Pistol(); //Dependency (initialize this object inside another object)
		
		/*k thể primaryWeapon = new Weapon, nó là abstract class
		class Pistol và Shotgun có thể vì là concrete class
		*/
		
		primaryWeapon = weapon;
		
	}
	
	public void setWeapon1(Weapon weapon) {
		//Dependency Injection with Setter
		this.weapon1=weapon;
	}
	public void setWeapon2(Weapon weapon) {
		this.weapon2=weapon;
	}
	
	
	
	public void onLeftClick() {
		primaryWeapon.shoot();
	}
	
	public void onRightClick() {		
		if(primaryWeapon instanceof SecondaryOption)   //check neu weapon do co option thu 2 thi moi dc dung method secondaryFire()
			((SecondaryOption)primaryWeapon).secondaryFire();
	}
	
	public void onRButtonCLick() {
		primaryWeapon.reload();
	}
	
	public void onButton1Click() {
		primaryWeapon =weapon1;
	}
	
	public void onButton2Click() {  
		primaryWeapon =weapon2;    //weapon2 lúc này đã được set là shotgun trong main class
	}
	
	/*--> no longer depend on new Pistol, new Shotgun, other team can create what ever 
	weapons like sniper, I still can inject it into this class
	*/
	
	
	
}
