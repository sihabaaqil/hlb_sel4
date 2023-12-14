package api.test.data.Response;

public class TimeZoneConversionResult {
	private String fromTimezone;
	private String fromDateTime;
	private String toTimeZone;
	private ConversionResult conversionResult;

	// Constructor, getters, and setters

	public TimeZoneConversionResult(String fromTimezone, String fromDateTime, String toTimeZone,
			ConversionResult conversionResult) {
		this.fromTimezone = fromTimezone;
		this.fromDateTime = fromDateTime;
		this.toTimeZone = toTimeZone;
		this.conversionResult = conversionResult;
	}

	// Getters and setters

	public String getFromTimezone() {
		return fromTimezone;
	}

	public void setFromTimezone(String fromTimezone) {
		this.fromTimezone = fromTimezone;
	}

	public String getFromDateTime() {
		return fromDateTime;
	}

	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public String getToTimeZone() {
		return toTimeZone;
	}

	public void setToTimeZone(String toTimeZone) {
		this.toTimeZone = toTimeZone;
	}

	public ConversionResult getConversionResult() {
		return conversionResult;
	}

	public void setConversionResult(ConversionResult conversionResult) {
		this.conversionResult = conversionResult;
	}
}
