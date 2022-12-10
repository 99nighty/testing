package dateTest;

class MySingleton {
	int number;
	private static MySingleton instance;
	
	private MySingleton() {;}
	
	public static MySingleton getInstance() {
		if(instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}

public class MySingletonTest {
	public static void main(String[] args) {
		MySingleton ms = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();
		
		System.out.println(ms);
		System.out.println(ms2);
		
		ms.number = 10;
		ms2.number = 20;
		
		System.out.println(ms.number);
		System.out.println(ms2.number);
		
	}
}
