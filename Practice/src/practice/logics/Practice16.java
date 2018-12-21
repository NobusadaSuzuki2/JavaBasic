package practice.logics;

public class Practice16 {
	public static void main(String[] args) {

		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();


		boolean result= PracticeLogic16.checkChid(age);
		if(result==true) {
			System.out.println("子供");
		}else {
			System.out.println("大人");
		}
	}
}
