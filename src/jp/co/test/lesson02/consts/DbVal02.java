package jp.co.test.lesson02.consts;

/**
 * DBの値が文字か、数字か・・・などを一律で扱う
 * @param <T> String/Integerなどを想定
 */
public  interface DbVal02<V> {
	public V val();
	default boolean eq(V id) {
		return val().equals(id);
	}	
}
