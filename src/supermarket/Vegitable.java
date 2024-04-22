package supermarket;

/**
 * 野菜クラス。
 */
public class Vegitable extends Product {
	/**
	 * コンストラクタ。
	 * 
	 * @param name      商品名
	 * @param unitPrice 税抜単価
	 */
	public Vegitable(String name, int unitPrice) {
		super(name, "生鮮食品", unitPrice);
	}
}
