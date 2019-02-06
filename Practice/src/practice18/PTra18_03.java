/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> playerList = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	               String[] list = line.split(",");
	               Player player = new Player();
	        		player.setPosition(list[0]);
	        		player.setName(list[1]);
	        		player.setCountry(list[2]);
	        		player.setTeam(list[3]);

	        		playerList.add(player);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

	       for(int i= playerList.size()-1;i >= 0 ;i--) {
	    	   if(playerList.get(i).getTeam().equals("レアル・マドリード")) {
	    		   playerList.remove(i);
	    	   }
	    	   if(playerList.get(i).getTeam().equals("バルセロナ")) {
	    		   playerList.remove(i);
	    	   }
	       }
	       
	       /*for (int i = playerList.size() - 1; 0 < i; i--) {
			Player player = playerList.get(i);
			String team = player.getTeam();
			if ("レアル・マドリード".equals(team) || "バルセロナ".equals(team)) {
				playerList.remove(i);
			}
		}*/
	       
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
       
		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player list: playerList) {
        	System.out.println(list);
        }


	}
}
