package supermarket;

/**
 * 商品クラス。
 */
public class Product {
	/** 商品名 */
	private String name;
	
	/** 商品種別 */
	private String category;
	
	/** 税抜価格 */
	private int unitPrice;

	/**
	 * コンストラクタ。
	 * @param name 商品名
	 * @param category 商品種別
	 * @param unitPrice 税抜単価
	 */
	public Product(String name, String category, int unitPrice) {
		// 演習０（復習）このコンストラクタを完成させましょう。
		//   クラス変数にそれぞれの引数の値を代入させます
	}

	// 演習０－２（復習）：Productクラス、Fishクラス、Clothingクラスに
	//                     getterメソッドとsetterメソッドを実装してください

	/**
	 * 割引料金を計算する。１円以下は切り捨て
	 * @param percent 割引パーセント
	 * @return 割引された税抜単価
	 */
	public int getDiscountPrice(int percent) {
		return unitPrice * percent / 100;
	}

	public String toString() {
		return "商品：名前[" + this.name + "] カテゴリ[" + category + "] 単価[" + unitPrice + "]";
	}
}
