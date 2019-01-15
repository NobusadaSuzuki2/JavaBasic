package practice;

public class Merchant {
	/*商人は「商品の値段(price)」 、「在庫(stock)」、「売上(money)」という属性を持っています。
	商品の値段は100、在庫は100、 売上は0 で初期化してください。そのうち商品の値段は定数で宣言してください。
	商人は「商品を売る」(sell)と、売上を確認する(confirm)という行動を取ることができます。
	*/

	final int PRICE=100;
	int stock=100;
	int money=0;
	
	//商人は以下の操作(メソッド)を持っています。
	//商品を売る(sellItem)：渡された引数(整数)の数だけ在庫が減り、売上が「商品の値段×引数」分増えます。戻り値はありません。
	void sellItem(int count) {
		this.stock-= count;
		this.money+= this.PRICE*count;
	}
	//売上を確認する(confirmMoney)：引数なしで、戻り値として「売上は○○円です。」という文字列を返す。○○には売上が入ります。
	String confirmMoney() {
		return"売り上げは"+this.money+"円です。";
	}
	
}
