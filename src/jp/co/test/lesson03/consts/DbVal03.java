package jp.co.test.lesson03.consts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface DbVal03<V, E extends Enum<E>> {
	V val();

	int order();

	default boolean eq(V id) {
		return val().equals(id);
	}

	
	default E toEnum() {
		@SuppressWarnings("unchecked")
		E v = (E) this;
		return v;
	}

	static <V, E extends Enum<E> & DbVal03<V, E>> boolean eqAny(V id, List<E> candidate) {
		return candidate.stream().anyMatch(e -> e.eq(id));
	}


	
	
	// ここから下はおまけ
	
	
	/**
	 * 指定したenumクラスのenumの一覧をソート順で返す
	 * 
	 * @param clazz enumクラス
	 * @param <V> Enum
	 * @return List (order順）
	 */
	static <V, E extends Enum<E> & DbVal03<V, E>> List<E> getOrderedList(Class<? extends DbVal03<V, E>> clazz) {
		return Arrays.stream(clazz.getEnumConstants())
				.sorted(Comparator.comparing(DbVal03::order))
				.map(DbVal03::toEnum)
				.collect(Collectors.toList());
	}

	
	static <V, E extends Enum<E>> E getEnum(Class<? extends DbVal03<V, E>> clazz, V id) {
		return Arrays.stream(clazz.getEnumConstants())
				.filter(e -> e.eq(id))
				.map(DbVal03::toEnum)
				.findFirst()
				.orElse(null);
	}
	
	static <V, E extends Enum<E>> Map<V, E> getMap(Class<? extends DbVal03<V, E>> clazz) {
		return Arrays.stream(clazz.getEnumConstants())
				.collect(Collectors.toMap(DbVal03::val, DbVal03::toEnum));
	}
	
	
	static <V, E extends Enum<E>> boolean hasCode(Class<? extends DbVal03<V, E>> clazz, V id) {
		return Arrays.stream(clazz.getEnumConstants())
				.anyMatch(e -> e.eq(id));
	}
}
