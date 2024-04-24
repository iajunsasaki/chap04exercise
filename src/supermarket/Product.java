package supermarket;

import java.util.ArrayList;

/**
 * 商品クラス。すべての商品クラスは直接的あるいは間接的にこのクラスを継承する。
 */
public class Product {
	/** 商品名 */
	String name;

	/** 商品種別 */
	// FoodクラスのfoodCategory,
	// notFoodクラスのnotFoodCategory,
	// unlimitedProductクラスのunlimitedProductCategory
	// それぞれの変数と役割が重複しているため、どちらかでよさそう
	String category;

	ArrayList<receiver> receiver = new ArrayList<receiver>(); 
	
	// 閾値。在庫数がこれ以下になったときに警告を出す
	private int alertAmount;
	
	/** 税抜価格 */
	private int unitPrice;

	// 在庫数
	private int amount;
	
	// 倉庫のどこにあるかを示す変数
	private String place;
	
	// 在庫のgetter
	public int getAmount() {
		return amount;
	}

	// 在庫を追加するメソッド
	public void addAmount(receiver product) {
		this.amount += product.amount;
		receiver.add(product);
	}
	
	// 在庫から品出しするメソッド
	public void removeAmount(receiver product) {
		this.amount -= product.amount;
		
		// 在庫が0以下のとき、切れそうなときでそれぞれ処理をする。
		// 入力ミスなどで在庫の値がマイナスになった時はエラーが出るようにしたほうがよさそう
		if(this.amount <= 0) {
			System.out.println("在庫が切れました。");
		}else if(this.amount <= alertAmount) {
			System.out.println("在庫切れが迫っています。");
		}
		
	}
	
	
	// これより下、getter,setter,コンストラクタなど。
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
	 * 
	 * @param name      商品名
	 * @param category  商品種別
	 * @param unitPrice 税抜単価
	 */
	public Product(String name, String category, int unitPrice, int amount) {
		// 演習０（復習）このコンストラクタを完成させましょう。
		// クラス変数にそれぞれの引数の値を代入させます
		this.setName(name);
		this.setCategory(category);
		this.setUnitPrice(unitPrice);
		this.setAmount(amount);
	}

	private void setAmount(int amount) {
		// TODO 自動生成されたメソッド・スタブ
		this.amount = amount;
	}

	/**
	 * 割引料金を計算する。１円以下は切り捨て
	 * 
	 * @param percent 割引パーセント
	 * @return 割引された税抜単価
	 */
	// 今回決めた仕様では使われない。
	public int getDiscountPrice(int percent) {
		return this.getUnitPrice() * percent / 100;
	}

	public String toString() {
		return "商品：名前[" + name + "] カテゴリ[" + category + "] 単価[" + unitPrice + "] 入荷量[" + amount +"]";
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
