package jp.co.test.lesson02;

import static java.util.Arrays.asList;
import static jp.co.test.lesson02.consts.ColumnEnum02.HogeStatus.a;
import static jp.co.test.lesson02.consts.ColumnEnum02.HogeStatus.b;
import static jp.co.test.lesson02.util.DbValUtil02.equalsAny;

import jp.co.test.lesson02.consts.ColumnEnum02.HogeStatus;
import jp.co.test.lesson02.consts.ColumnEnum02.OrderStatus;
import jp.co.test.lesson02.consts.ColumnEnum02.TestStatus;

public class Main02 {

	public static void main(String[] args) {

		// case 1
		{
			String dbVal = "2";

			if (equalsAny(dbVal, asList(HogeStatus.a, HogeStatus.b))) {
			}

			// 個人的にはこっちの書き方の方が好みだが、
			// だが、同一ソース内での名前の衝突や、pullRequestレビュー時には上の書き方の方が見易い
			if (equalsAny(dbVal, asList(a, b))) {
			}

			// コンパイルエラーになる
			// if (equalsAny(dbVal, asList(HogeStatus.a,
			// HogeStatus.b,FugaStatus.a))) {
			// }
		}

		// case 2
		{
			int dbVal = 1;

			if (equalsAny(dbVal, asList(OrderStatus.a, OrderStatus.b))) {
			}

			// コンパイルエラーになる
			//if (equalsAny(dbVal, asList(OrderStatus.a, OrderStatus.b, TestStatus.a))) {
			// }
			System.out.println(TestStatus.a.val());
		}

	}
}
