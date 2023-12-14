package api.test.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import api.test.data.Response.ConversionResult;
import api.test.data.Response.TimeZoneConversionResult;

public class TimeZoneConversion {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://timeapi.io/api/Conversion/ConvertTimeZone");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set the request method to POST
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("accept", "application/json");
			connection.setDoOutput(true);

			// Create the request body as a JSON string
			String requestBody = "{\"fromTimeZone\":\"Asia/Kuala_Lumpur\",\"dateTime\":\"2021-03-14 17:45:00\",\"toTimeZone\":\"Asia/Kolkata\",\"dstAmbiguity\":\"\"}";

			// Write the request body to the output stream
			try (OutputStream os = connection.getOutputStream()) {
				byte[] input = requestBody.getBytes("utf-8");
				os.write(input, 0, input.length);
			}

			int responseCode = connection.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
					StringBuilder response = new StringBuilder();
					String line;

					while ((line = in.readLine()) != null) {
						response.append(line);
					}

					// Parse the JSON response into your POJO class
					TimeZoneConversionResult result = parseJsonResponse(response.toString(),
							TimeZoneConversionResult.class);

					// Now you can work with the result object
					System.out.println("From Timezone: " + result.getFromTimezone());
					System.out.println("From DateTime: " + result.getFromDateTime());
					System.out.println("To Timezone: " + result.getToTimeZone());
					// Access conversion result and other properties
				}
			} else {
				System.err.println("POST request failed with status code: " + responseCode);
			}

			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static <T> T parseJsonResponse2(String jsonResponse, Class<T> responseType) {
		// Implement your JSON parsing logic here
		// You can use a JSON library like Jackson or Gson for a more robust solution
		// For simplicity, let's assume a simple manual parsing for this example
		// Note: This approach may not cover all edge cases and is for demonstration
		// purposes

		// Here, we assume a hypothetical structure of the JSON response
		// You need to adapt this based on the actual JSON structure
		// Note: This approach may not cover all edge cases and is for demonstration
		// purposes
		// It's recommended to use a JSON parsing library like Jackson or Gson for a
		// more robust solution

		// Your parsing logic here
		return null;
	}

	private static <T> T parseJsonResponse(String jsonResponse, Class<T> responseType) {
		// Implement your JSON parsing logic here
		// You can use a JSON library like Jackson or Gson for a more robust solution
		// For simplicity, let's assume a simple manual parsing for this example
		// Note: This approach may not cover all edge cases and is for demonstration
		// purposes

		// Here, we assume a hypothetical structure of the JSON response
		// You need to adapt this based on the actual JSON structure
		String fromTimezone = extractValue(jsonResponse, "fromTimezone");
		String fromDateTime = extractValue(jsonResponse, "fromDateTime");
		String toTimeZone = extractValue(jsonResponse, "toTimeZone");

		String conversionResultJson = extractValue(jsonResponse, "conversionResult");
		ConversionResult conversionResult = parseJsonResponse(conversionResultJson, ConversionResult.class);

		try {
			// Assume the existence of a constructor in the responseType class that takes
			// the extracted values
			return responseType.getConstructor(String.class, String.class, String.class, ConversionResult.class)
					.newInstance(fromTimezone, fromDateTime, toTimeZone, conversionResult);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String extractValue(String jsonString, String key) {
		// Implement your logic to extract the value associated with the key from the
		// JSON string
		// For simplicity, let's assume a simple manual extraction for this example
		// Note: This approach may not cover all edge cases and is for demonstration
		// purposes

		String keyPattern = "\"" + key + "\":\"([^\"]*)\"";
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(keyPattern);
		java.util.regex.Matcher matcher = pattern.matcher(jsonString);

		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return null;
		}
	}

	private String fromTimezone;
	private String fromDateTime;
	private String toTimeZone;
	private ConversionResult conversionResult;

	// Constructor, getters, and setters

	public TimeZoneConversion(String fromTimezone, String fromDateTime, String toTimeZone,
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

	public TimeZoneConversion(int year, int month, int day, int hour, int minute, int seconds, int milliSeconds,
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
