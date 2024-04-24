package supermarket;

import java.util.ArrayList;

/**
 * スーパーマーケット業務クラス。
 */
public class Suparmarket {
	public static void main(String[] args) {
		Suparmarket supermarket = new Suparmarket();

		Food osechi = new Food("おせち","食品",100,100,"２か月後","おせち");
		receiver asan = new receiver("小泉純一郎",100,"2024-12-31",osechi);
		

		receiver bsan = new receiver("小泉純一郎",99,"2024-12-31",osechi);
		supermarket.addAmount(asan);
		supermarket.removeAmount(bsan);
		
		System.out.println(supermarket.stock.get(0).name);
		
	}

	/**
	 * 在庫リスト
	 */
	private ArrayList<Product> stock = new ArrayList<Product>();
	
	// 注文済みのリスト
	private ArrayList<receiver> ordered = new ArrayList<receiver>();
	
	// 注文するメソッド
	// 商品を強制的に注文するならば引数；duplicateOKをtrueにして渡す。
	// duplicateOKがfalseの場合、重複していたら注文しない。
	// 重複していなければ注文する。
	
	// 本当は、注文履歴を追加していくだけのリストと、
	// 重複した注文を許さないためのリスト（注文が届くたびに要素を削除する）の２つを
	// 用意するつもりだったが、前者のみの用意となってしまった。
	public void order(receiver receiver, boolean duplicateOK) {
		
		// 強制的に注文リストに追加
		if(duplicateOK) {
			ordered.add(receiver);
		}else {
			// 注文リストにあるかチェック
			for(receiver tryToOrder : ordered) {
				// すでにあるならば処理を終了する
				if(tryToOrder.product.name.equals(receiver.product.name)) {
					return;
				}
			}
			// for文を回しきったら（注文リストに無ければ）注文する
			ordered.add(receiver);
		}
	}

	// 入荷処理
	public void addAmount(receiver receiver) {
		// 注文したことがある品物ならば
		for(Product listedProduct : stock) {
			if(listedProduct.name.equals(receiver.product.name)) {
				// 量（在庫）を追加する
				listedProduct.addAmount(receiver);
				return;
			}
		}
		// リストになければ商品を登録する
		stock.add(receiver.product);
	}
	
	// 品出し
	public void removeAmount(receiver receiver) {
		// 注文したことがある商品ならば
		for(Product listedProduct : stock) {
			if(listedProduct.name.equals(receiver.product.name)) {
				// 在庫を減らす
				listedProduct.removeAmount(receiver);
				return;
			}
		}
		// ない商品を品出しすることは想定していないが、エラー処理とかできるとよさそう
	}
}
