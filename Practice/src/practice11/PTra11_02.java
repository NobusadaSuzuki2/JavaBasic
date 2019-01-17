package practice11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args)throws IOException {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books = FileReaderClass.readBookDataFile();



		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		String title;
	    title=d.readLine();
	    for(int i=0;i<books.length;i++) {
	    	if(books[i].title.contains(title)) {
	    		System.out.println(books[i].dispBookInfo());
	    	}
		}
	}
}
