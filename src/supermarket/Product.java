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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * コンストラクタ。
	 * @param name 商品名
	 * @param category 商品種別
	 * @param unitPrice 税抜単価
	 */
	public Product(String name, String category, int unitPrice) {
		// 演習０（復習）このコンストラクタを完成させましょう。
		//   クラス変数にそれぞれの引数の値を代入させます
		this.name=name;
		this.category=category;
		this.unitPrice=unitPrice;
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
