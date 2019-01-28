/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;

public class PTra15_02 {
	public static void main(String[] args) {

		//Room rooms = new Java2Month(); ←最初からあった
		
		Java2Month rooms = new Java2Month();
		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		rooms.getCurriculum();
		
		// 取得したカリキュラム情報を全て出力してください
		for(int i = 0;i< rooms.getCurriculum().length;i++) {
			System.out.println(rooms.getCurriculum()[i]);
		}
			
			
			/*for (Room room : rooms) {
				
				System.out.println(room.);
			}*/
	}
}
