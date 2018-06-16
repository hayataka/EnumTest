package jp.co.test.lesson04.consts.consts;

public interface ColumnEnum04 {

	public enum OrderStatus implements DbVal04<Integer> {
		a(1, 1), b(2, 2), c(3, 3);
		private int status;
		private int order;

		private OrderStatus(int status, int order) {
			this.status = status;
			this.order = order;
		}

		public Integer val() {
			return status;
		}

		public int order() {
			return this.order;
		}
	}

	public enum TestStatus implements DbVal04<Integer> {
		a(1, 1), b(2, 1), c(3, 1);
		private int status;
		private int order;

		private TestStatus(int status, int order) {
			this.status = status;
			this.order = order;
		}

		public Integer val() {
			return status;
		}

		public int order() {
			return this.order;
		}
	}

	public enum HogeStatus implements DbVal04<String> {
		a("1", 1), b("2", 2), c("3", 3);
		private String status;
		private int order;

		private HogeStatus(String status, int order) {
			this.status = status;
			this.order = order;
		}

		public String val() {
			return status;
		}

		public int order() {
			return this.order;
		}
	}

	public enum FugaStatus implements DbVal04<String> {
		a("1", 1), b("2", 2), c("3", 3);
		private String status;
		private int order;

		private FugaStatus(String status, int order) {
			this.status = status;
			this.order = order;

		}

		public String val() {
			return status;
		}

		public int order() {
			return this.order;
		}
	}

}
