package api.test.data.Response;

public class ConversionResult {

	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int seconds;
	private int milliSeconds;
	private String dateTime;
	private String date;

	private String time;
	private String timeZone;
	private boolean dstActive;

	// Constructor, getters, and setters

	public ConversionResult(int year, int month, int day, int hour, int minute, int seconds, int milliSeconds,
			String dateTime, String date, String time, String timeZone, boolean dstActive) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
		this.milliSeconds = milliSeconds;
		this.dateTime = dateTime;
		this.date = date;
		this.time = time;
		this.timeZone = timeZone;
		this.dstActive = dstActive;
	}

	// Getters and setters

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMilliSeconds() {
		return milliSeconds;
	}

	public void setMilliSeconds(int milliSeconds) {
		this.milliSeconds = milliSeconds;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public boolean isDstActive() {
		return dstActive;
	}

	public void setDstActive(boolean dstActive) {
		this.dstActive = dstActive;
	}
}
