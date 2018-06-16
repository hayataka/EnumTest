package jp.co.test.lesson01;
/** いわゆるよく見る定数クラス.**/
public class Const01 {

	//少なくとも、 同じ定義を使用する限り、 実際の値を入れた場合に比べて
	// 変更に強い。値の入れ間違えを防ぎ易い、名前による説明となる
	
	public static final int ORDER_STATUS_UNPROCEED = 1;
	public static final int ORDER_STATUS_CANCEL = 2;
	public static final int ORDER_STATUS_COMPLETE = 3;

	public static final int TEST_STATUS_A = 1;
	public static final int TEST_STATUS_B = 2;
	public static final int TEST_STATUS_C = 3;

	// 一応こういう階層分けも可能　見通しの問題
	public final class Hoge {
		public static final String A = "1";
		public static final String B = "2";
		public static final String C = "3";
	}

	public final class Fuga {
		public static final String A = "1";
		public static final String B = "2";
		public static final String C = "3";
	}

}