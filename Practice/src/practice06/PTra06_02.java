package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		for (int i = 1; i <= 20 ; i++) {
			//(int i = 0; i < 20; i++)模範
			
			// ★ 今何回目の処理なのかを出力してください
			System.out.println(i+"回目");
			//System.out.println((i + 1) + "回目");模範回答
			
			// ★ 奇数回のときには、「奇数」を出力してください
			if (i%2==1) {
				System.out.println("奇数");
			}else {
				System.out.println("");
			}
			/*if ((i + 1) % 2 != 0) {
				System.out.println("奇数");
			}模範*/

		}
		//-----for end
	}
}
