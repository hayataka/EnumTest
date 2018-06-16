package jp.co.test.lesson04.consts.consts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface DbVal04<V> {
	V val();

	int order();

	default boolean eq(V id) {
		return val().equals(id);
	}

	// // DbValで受け取る形にすると、別のEnumが混ざってしまってもコンパイルエラーにならない
	default boolean eqAnyNG(V id, List<DbVal04<V>> candidate) {
		return candidate.stream().anyMatch(e -> e.eq(id));
	}

	default <E extends Enum<E> & DbVal04<V>> boolean eqAny(V id, List<E> candidate) {
		return candidate.stream().anyMatch(e -> e.eq(id));
	}

	// // ここから下はおまけ
	 /**
	 * 指定したenumクラスのenumの一覧をソート順で返す
	 *
	 * @param clazz enumクラス
	 * @param <V> Enum
	 * @return List (order順）
	 */
	static <V, E extends Enum<E> & DbVal04<V>> List<E> getOrderedList(Class<E> clazz) {

		return Arrays.stream(clazz.getEnumConstants())
				.sorted(Comparator.comparing(DbVal04::order))
				.collect(Collectors.toList());
	}

	static <V, E extends Enum<E> & DbVal04<V>> E getEnum(Class<E> clazz, V id) {
		return Arrays.stream(clazz.getEnumConstants())
				.filter(e -> e.eq(id))
				.findFirst()
				.orElse(null);
	}

	
	 static <V, E extends Enum<E> & DbVal04<V>> Map<V, E> getMap(Class<E> clazz) {
		 return Arrays.stream(clazz.getEnumConstants())
				 .collect(Collectors.toMap(DbVal04::val, e -> e));
	 }

	 static <V, E extends Enum<E> & DbVal04<V>> boolean hasCode(Class<E> clazz, V id) {
		 return Arrays.stream(clazz.getEnumConstants())
				 .anyMatch(e -> e.eq(id));
	 }
}
