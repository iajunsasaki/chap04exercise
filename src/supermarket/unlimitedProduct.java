package supermarket;

// 期限を持たない商品を表すクラス
public class unlimitedProduct extends Product {

	// カテゴリーを表す変数
	// Productクラスのフィールド"category"と役割が重複してそう
	String unlimitedProductCategory;
	
	// コンストラクタ
	public unlimitedProduct(String name,String category,int unitPrice,int amount, String unlimitedProductCategory) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name,category,unitPrice,amount);
		this.unlimitedProductCategory = unlimitedProductCategory;
	}
}
