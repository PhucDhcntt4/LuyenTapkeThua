class Vehicle{

public void color(){
	System.out.println("Mau cua xe la while");
	}

public void model(){
	System.out.println("toyota!");
	}
public void run(){
	System.out.println("hin hin!");
	}	
}

class bycycle extends Vehicle{
	public void xedap(){
		System.out.println("chay bang com !");
	}
}

class car extends Vehicle{

	public void Xehoi(){
		System.out.println("chay bang xang !");
	}
}

public class cau2 {
 public static void main(String[] args) {

		bycycle bc = new bycycle();
		bc.color();
		bc.model();
		bc.run();
		bc.xedap();

		car c = new car();
		c.color();
		c.model();
		c.run();
		c.Xehoi();
	}
}