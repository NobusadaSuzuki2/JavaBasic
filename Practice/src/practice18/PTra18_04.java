/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

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

      

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        
        	Collections.shuffle(playerList);
        	int df = 0;
        	int mf = 0;
        	int fw = 0;
        	
        	for(int i= playerList.size()-1;i >= 0 ;i--) {
        		if(playerList.get(i).getPosition().equals("GK")) {
        			System.out.print( playerList.get(i).getPosition());
        			System.out.println( playerList.get(i).getName());
 	    		   break;
 	    	   }
        	}
        	for(int i= playerList.size()-1;i >= 0 ;i--) {
        		if(playerList.get(i).getPosition().equals("DF")) {
        			System.out.print( playerList.get(i).getPosition());
        			System.out.println( playerList.get(i).getName());
       				df++;
        	
       				if(df==4) {
        			break;
       				}
        		}
        	}
        	for(int i= playerList.size()-1;i >= 0 ;i--) {
        		if(playerList.get(i).getPosition().equals("MF")) {
        			System.out.print( playerList.get(i).getPosition());
        			System.out.println( playerList.get(i).getName());
       				mf++;
        	
       				if(mf==4) {
        			break;
       				}
        		}
        	}
        	for(int i= playerList.size()-1;i >= 0 ;i--) {
        		if(playerList.get(i).getPosition().equals("FW")) {
        			System.out.print( playerList.get(i).getPosition());
        			System.out.println( playerList.get(i).getName());
       				fw++;
        	
       				if(fw==2) {
        			break;
       				}
        		}
        	}
	}
}
