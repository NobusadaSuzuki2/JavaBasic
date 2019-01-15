package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1=new Car();
		car1.color="RED";
		car1.gasoline=50;
		
		int run1 = 0;
		for(int i=1;i<=100;i++) {
			run1 += car1.run();
			if(car1.gasoline<=0) {
				System.out.println(car1.color+"は目的地に到達できませんでした");
				break;
			}else if(run1>=300) {
				System.out.println(car1.color+"は目的地にまで"+i+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
				break;
			}
		}
		Car car2=new Car();
		car2.color="BLUE";
		car2.gasoline=50;
		
		int run2 =0;
		for(int i=1;i<=100;i++) {
			run2 += car2.run();
			if(car2.gasoline<=0) {
				System.out.println(car2.color+"は目的地に到達できませんでした");
				break;
			}else if(run2>=300) {
				System.out.println(car2.color+"は目的地にまで"+i+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
				break;
			}
		}
		
		Car car3=new Car();
		car3.color="yellow";
		car3.gasoline=50;
		
		int run3=0;
		for(int i=1;i<=100;i++) {
			run3 += car3.run();
			if(car3.gasoline<=0) {
				System.out.println(car3.color+"は目的地に到達できませんでした");
				break;
			}else if(run3>=300) {
				System.out.println(car3.color+"は目的地にまで"+i+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
				break;
			}
		}

	}
}
