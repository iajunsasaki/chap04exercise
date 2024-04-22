package supermarket;

/**
 * 衣服クラス。
 */
public class Clothing extends Product {
	/** 商品の色 */
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * コンストラクタ。
	 * @param name 商品名
	 * @param unitPrice 税抜単価
	 * @param color 商品の色
	 */
	public Clothing(String name, int unitPrice, String color) {
		super(name, "衣服", unitPrice);
	}
	
	// 演習０－２（復習）：Productクラス、Fishクラス、Clothingクラスに
	//                     getterメソッドとsetterメソッドを実装してください
}
