package jp.co.test.lesson02.util;

import java.util.List;

import jp.co.test.lesson02.consts.DbVal02;


public class DbValUtil02 {
	/**
	 * targetで渡した値が、comparerのenumのいづれかに相当する場合はtrueを返す
	 * @param target  {@link DbVal02#val()}に相当する値
	 * @param comparer 候補のList
	 * @return　いづれかに相当する場合：true
	 */
	public static <V, E extends Enum<E> & DbVal02<V>> boolean equalsAny(V target, List<E> comparer) {
		return comparer.stream().anyMatch(x ->x.eq(target));
	}
}
