package supermarket;

/**
 * 生鮮商品：魚クラス。
 */
public class Fish extends Product {
	/** 重さ */
	private float weightGrams;
	
	/** 消費期限までの日数 */
	private int expiresInDays;

	/**
	 * コンストラクタ。
	 * @param name 商品名
	 * @param unitPrice 税抜単価
	 * @param weightGrams 商品の重さ（グラム単位）
	 * @param expiresInDays 消費期限までの日数
	 * @param quantity 数量
	 */
	public Fish(String name, int unitPrice, float weightGrams, int expiresInDays, int quantity) {
		super(name, "生鮮食品", unitPrice, quantity);
		
		this.weightGrams = weightGrams;
	}
	
	// 演習０－２（復習）：Productクラス、Fishクラス、Clothingクラスに
	//                     getterメソッドとsetterメソッドを実装してください
	public float getWeightGrams() {
		return weightGrams;
	}

	public void setWeightGrams(float weightGrams) {
		this.weightGrams = weightGrams;
	}

	public int getExpiresInDays() {
		return expiresInDays;
	}

	public void setExpiresInDays(int expiresInDays) {
		this.expiresInDays = expiresInDays;
	}

	// 演習３：FishクラスにてProductクラスで定義されているdiscountメソッドをオーバーライドしてください
	//   魚は通常の商品より5パーセント余分に割引させたいです。つまり通常商品を10％割引したい場合にFishクラス
	//   の場合は15％割引します
	public int getDiscountPrice(int percent) {
		// Math.maxはpercent + 5と100の大きい方の値を選ぶ
		return this.getUnitPrice() * Math.max(100, percent + 5) / 100;
	}

	public String toString() {
		// 演習２：toStringメソッドを完成させ，親クラスの「商品名」と「消費期限までの日数」を表示させてください
		return "商品名[" + this.getName() + "] 消費期限までの日数[" + this.expiresInDays + "]";
	}
}
