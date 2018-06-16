package jp.co.test.lesson02.consts;

/**
 * いわゆる、区分値を集めたenumクラス群としてif下に記載.
 *
 */
public interface ColumnEnum02 {

	public enum OrderStatus implements DbVal02<Integer> {
		a(1),
		b(2),
		c(3);
		private int status;
		private OrderStatus(int status) {
			this.status = status;
		}
		public Integer val() {
			return status;
		}
	}

	public enum TestStatus implements DbVal02<Integer> {
		a(1),
		b(2),
		c(3);
		private int status;
		private TestStatus(int status) {
			this.status = status;
		}
		public Integer val() {
			return status;
		}
	}
	

	public enum HogeStatus implements DbVal02<String> {
		a("1"),
		b("2"),
		c("3");
		private String status;
		private HogeStatus(String status) {
			this.status = status;
		}
		public String val() {
			return status;
		}
	}

	public enum FugaStatus implements DbVal02<String> {
		a("1"),
		b("2"),
		c("3");
		private String status;
		private FugaStatus(String status) {
			this.status = status;
		}
		public String val() {
			return status;
		}
	}
	
}
