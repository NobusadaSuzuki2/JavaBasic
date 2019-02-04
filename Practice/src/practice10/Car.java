package practice10;

import java.util.Random;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	public int run() {
		
		for(int i= 0;i<=50;i++) {
		gasoline-=1;
		Random rnd = new Random();
		int run = rnd.nextInt(15);
		if(gasoline==0) {
			return -1;
		}else {
			return run;
		}
		
		}
		return run();
		
	}
	
	/*int run() {
		// もう減らせない場合
		if (gasolin == 0) {
			return -1;
		}

		gasolin--;

		Random random = new Random();
		int distance = random.nextInt(15) + 1;
		return distance;
	}*/
}
