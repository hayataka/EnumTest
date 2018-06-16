package jp.co.test.lesson03;

import static java.util.Arrays.asList;

import java.util.Map;

import jp.co.test.lesson03.consts.DbVal03;
import jp.co.test.lesson03.consts.ColumnEnum03.HogeStatus;
import jp.co.test.lesson03.consts.ColumnEnum03.OrderStatus;
import jp.co.test.lesson03.consts.ColumnEnum03.TestStatus;
//　http://www.casleyconsulting.co.jp/blog-engineer/java/%E5%86%8D%E5%B8%B0%E7%9A%84%E3%82%B8%E3%82%A7%E3%83%8D%E3%83%AA%E3%82%AF%E3%82%B9%E3%82%92%E6%B4%BB%E7%94%A8%E3%81%97%E3%81%9Fjava8%E6%99%82%E4%BB%A3%E3%81%AE%E3%82%B3%E3%83%BC%E3%83%89%E5%AE%9A/
// このケース３は、上記URLのブログをもとに作成しています
public class Main03 {

	public static void main(String[] args) {

		int dbVal = 2;

		if (DbVal03.eqAny(dbVal, asList(OrderStatus.a, OrderStatus.b))) {
			System.out.println("OK 1");
		}
// コンパイルエラー
//		if (DbVal02.eqAny(2, Arrays.asList(OrderStatus.a, OrderStatus.b, TestStatus.b))) {
//			System.out.println("compile error");
//		}		
		
	
		// おまけ
		DbVal03.getOrderedList(OrderStatus.class)
			.forEach(System.out::println);
		
		OrderStatus enum1 = DbVal03.getEnum(OrderStatus.class, 2);
		System.out.println(enum1);
		
		Map<Integer, TestStatus> testS = DbVal03.getMap(TestStatus.class);
		testS.entrySet().stream().forEach( e -> {
			System.out.println("key:" + e.getKey() + ", value:" + e.getValue());
		});
		
		System.out.println(DbVal03.hasCode(HogeStatus.class, "3"));
		
	}

}
