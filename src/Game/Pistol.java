package Game;

public class Pistol implements Weapon{

	@Override				//abstract method k có body, nó áp dụng ở đây, sẽ dc override ở class con
	public void shoot() {
		//Shoot the pistol
	}


	@Override
	public void reload() {
		// TODO Auto-generated method stub
		
	}
	
/*lý do là vì shoot ở mỗi weapon sẽ khác nhau, k thể đặt shoot() ở Player class được
	bằng cách này mình có thể viết shoot() cho các weapon khác nhau
	
	*/
	
	
}
