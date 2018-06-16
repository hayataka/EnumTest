package jp.co.test.lesson04.consts;

import java.util.Arrays;

import jp.co.test.lesson04.consts.consts.DbVal04;
import jp.co.test.lesson04.consts.consts.ColumnEnum04.OrderStatus;

// lesson03 をもとに、一部構造を変更
public class Main04 {

	public static void main(String[] args) {

		if (OrderStatus.a.eqAny(2, Arrays.asList(OrderStatus.a, OrderStatus.b))) {
			// default実装にかくと、　ifの最初のenum値がノイズになる
		}
		
		DbVal04.getOrderedList(OrderStatus.class);

	}

}
