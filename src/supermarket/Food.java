package supermarket;

// 期限のある商品のうち、食べ物を表すクラス
public class Food extends limitedProduct {

	// （食べ物の中でも）カテゴリーを表す変数
	// Productクラスのフィールド"category"と役割が重複してそう
	String foodCategory;
	
	// コンストラクタ
	public Food(String name, String category, int unitPrice, int amount, String limit, String foodCategory) {
		super(name,category,unitPrice,amount,limit);
		this.foodCategory = foodCategory;
	}
	
}
