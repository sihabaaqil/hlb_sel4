package api.test.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class TimeZoneRequest {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://timeapi.io/api/TimeZone/AvailableTimeZones");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");

			int responseCode = connection.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
					StringBuilder response = new StringBuilder();
					String line;

					while ((line = in.readLine()) != null) {
						response.append(line);
					}

					// Parse the JSON response into a list of strings
					List<String> timeZoneList = parseJsonResponse(response.toString());

					// Now you can work with the list of time zones
					for (String timeZone : timeZoneList) {
						System.out.println(timeZone);
					}
				}
			} else {
				System.err.println("GET request failed with status code: " + responseCode);
			}

			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<String> parseJsonResponse(String jsonResponse) {
		// You can use a JSON library like Jackson or Gson to parse the JSON response,
		// but since you requested not to use external libraries, we'll use a simple
		// approach.

		// Remove brackets and quotes and split by comma
		String[] timeZoneArray = jsonResponse.replaceAll("\\[|\\]|\"", "").split(",");

		// Convert the array to a list

		List<String> targetList = Arrays.asList(timeZoneArray);

		return targetList;

	}

}
