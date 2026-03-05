package basics;

public enum Days {
	SUNDAY(false), MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);

	private boolean isWorkDay;

	private Days(boolean isWorkDay) {
		this.isWorkDay = isWorkDay;
	}

	public String getType() {
		return isWorkDay ? "workDay" : "holyDay";
	}
}
