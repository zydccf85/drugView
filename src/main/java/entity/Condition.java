package entity;

public class Condition extends Emp {
		private Integer start;
		private Integer lenght;
		private int page;
		private int row;
		public int getPage() {
			return page;
		}
		public Integer getStart() {
			return start;
		}
		public void setStart(Integer start) {
			this.start = start;
		}
		public Integer getLenght() {
			return lenght;
		}
		public void setLenght(Integer lenght) {
			this.lenght = lenght;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		@Override
		public String toString() {
			return "Condition [page=" + page + ", row=" + row + "]";
		}
		
}
