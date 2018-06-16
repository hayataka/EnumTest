package jp.co.test.lesson01;

import static jp.co.test.lesson01.Const01.ORDER_STATUS_CANCEL;
import static jp.co.test.lesson01.Const01.ORDER_STATUS_UNPROCEED;
import static jp.co.test.lesson01.Const01.TEST_STATUS_A;

public class Main01 {

	/**
	 * DBからある列の値を取ってきたとして、その列の値が○ か　Xだったら、という処理をどう書くかという
	 * 話題の中でのenumについて説明用途。
	 * 以降の２、３でも同様
	 * @param args 未使用
	 */
	public static void main(String[] args) {

		int dbVal = 1;
		// ありがちな、dbの値が A　か Bだったら、の個所　dbValが２回でる
		if (dbVal == ORDER_STATUS_CANCEL || dbVal == ORDER_STATUS_UNPROCEED) {
		}

		// 間違えた値が使用されていても、　型はintなのでコンパイルエラーにならない
		if (dbVal == ORDER_STATUS_CANCEL || dbVal == TEST_STATUS_A) {
		}		

		String v = "1";
		// == か、equalsなのか、の使い分け
		// 2回　v　が出てくる
		if (v.equals(Const01.Fuga.A) || v.equals(Const01.Fuga.B)) {
		}		
	}
}
