package supermarket;

// 商品を入荷、あるいは品出し、あるいは注文した際に、
// 「誰が」「何を（商品名）」「いつ」「どれだけの量」入荷（品出し、注文）したのか
// をまとめて管理するためのクラス
public class receiver {

	public receiver(String receiver, int amount, String date, Product product) {
		this.receiver = receiver;
		this.amount = amount;
		this.date = date;
		this.product = product;
	}

	String receiver;
	
	int amount;
	
	// とりあえずStringだが、日付や時間を管理する適切なクラスに変えてもよさそう
	String date;
	
	Product product;
}
