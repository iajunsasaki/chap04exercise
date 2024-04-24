package supermarket;

// 期限のある商品のうち、食べ物以外を表すクラス
public class notFood extends limitedProduct {
	
	// カテゴリーを表す変数
	// Productクラスのフィールド"category"と役割が重複してそう
	String notFoodCategory;
	
	// コンストラクタ
	public notFood(String name, String category, int unitPrice, int amount, String limit, String notFoodCategory) {
		super(name,category,unitPrice,amount,limit);
		this.notFoodCategory = notFoodCategory;
	}
}
