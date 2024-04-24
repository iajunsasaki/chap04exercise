package supermarket;

// 賞味期限や使用期限のある商品を表すクラス
public class limitedProduct extends Product{
	
	// 期限を表す変数
	String limit;
	
	// コンストラクタ
	public limitedProduct(String name, String category, int unitPrice, int amount, String limit) {
		super(name,category,unitPrice,amount);
		this.limit = limit;
	}
}
