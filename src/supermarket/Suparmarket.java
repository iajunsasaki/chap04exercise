package supermarket;

import java.util.ArrayList;

/**
 * スーパーマーケット業務クラス。
 */
public class Suparmarket {
	public static void main(String[] args) {
		// 演習０－１（復習）：Productクラスのコンストラクタを完成させてください
		// 演習０－２（復習）：Productクラス、Fishクラス、Clothingクラスに
		//                     getterメソッドとsetterメソッドを実装してください
		
		// 演習１：このパッケージにはProductクラス，そしてそれを継承するFishクラスとClothingクラスがあります。
		//   もう一つ、Productクラスを継承するMeatクラスを定義してください
		//   コンストラクタ内でsuperによるコンストラクタ呼び出しを活用します。
		
		// 演習２：FishクラスにあるtoStringメソッドを完成させてください
		//   完成させるために必要な変更を施してください
		
		// 演習３：FishクラスにてProductクラスで定義されているdiscountメソッドをオーバーライドしてください
		//   魚は通常の商品より5パーセント余分に割引させたいです。つまり通常商品を10％割引したい場合にFishクラス
		//   の場合は15％割引します
		
		// 演習４：Supermarketクラスのメンバ変数にはstockというArrayListがあります（※）
		//   stockは店内在庫を表現します。現在はFish型のマグロが登録されています。
		//   生鮮魚商品（Fish型のオブジェクト）を１つ、衣服（Clothing型のオブジェクト）を２つ
		//   その他（Product型のオブジェクト）を２つ作成（変数宣言＋new）して在庫登録してください。
		//   ※ArrayListとは配列の中身をプログラム内で安心して追加したり削除したりできる便利クラスです

		// ワンモアマイル１：同様にMeatクラスも在庫登録してみましょう。

		// ワンモアマイル２：プログラムを拡張してみましょう。在庫管理するにはProductクラスに数量を表す
		//   メンバ変数があるととても便利です。つまり、マグロ100gのパックは例えば200パック入荷して在庫登録
		//   すればそれがわかるようにしたいです。

		// ワンモアマイル３：プログラムを拡張してみましょう。Productクラスには税抜き単価と数量が管理できるように
		//   なりました。Supermarketクラスが持っている在庫の価値を計算できるSupermarketクラスのgetAllProductValue
		//   メソッドを実装して，mainメソッドから呼び出してください

		Suparmarket supermarket = new Suparmarket();
		
		// マグロ商品を準備
		Fish tuna = new Fish("マグロ", 500, 100F, 2, 5);
		Fish salmon = new Fish("鮭", 400, 100F, 2, 10);
		Clothing cap = new Clothing("キャップ", 700, "赤", 20);
		Clothing jeans = new Clothing("ジーンズ", 3000, "青", 5);
		Product tofu = new Product("豆腐", "生鮮食品", 120, 40);
		Product banana = new Product("バナナ", "生鮮食品", 200, 30);
		Meat pork = new Meat("豚バラ", 350, 20);
		Meat chicken = new Meat("鶏むね肉", 300, 50);
		
		System.out.println(tuna);
		
		// マグロを在庫に登録
		supermarket.stock.add(tuna);
		supermarket.stock.add(salmon);
		supermarket.stock.add(cap);
		supermarket.stock.add(jeans);
		supermarket.stock.add(tofu);
		supermarket.stock.add(banana);
		supermarket.stock.add(chicken);
		supermarket.stock.add(pork);
		
		for (Product product : supermarket.stock) {
			System.out.println("在庫：" + product);
		}
		
		System.out.println("在庫の合計価値は" + supermarket.getAllProductValue() + "円です。頑張って良いものをお客様に提供しましょう！");
	}
	
	/** 
	 * 在庫リスト
	 */
	private ArrayList<Product> stock = new ArrayList<Product>();
	
	public int getAllProductValue() {
		// 実装しないと0円のまま…
		int total = 0;
		for (Product product : this.stock) {
			total += product.getUnitPrice() * product.getQuantity();
		}
		return total;
	}
}
