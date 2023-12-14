package api.test.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.test.data.Response.DateTimeResponse;

public class Time_Zone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://timeapi.io/api/Time/current/zone?timeZone=Asia/Kolkata";
		// Asia/Calcutta or Asia/Kolkata
		// Indian/Kerguelen

		String Time_zone_URL = "https://timeapi.io/api/TimeZone/AvailableTimeZones";
		try {
			URL url = new URL(URL);
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

					// Parse the JSON response using Jackson ObjectMapper
					ObjectMapper objectMapper = new ObjectMapper();
					DateTimeResponse dateTimeResponse = objectMapper.readValue(response.toString(),
							DateTimeResponse.class);

					// Now you can work with the DateTimeResponse object
					// System.out.println(dateTimeResponse);

					System.out.println(dateTimeResponse.getDate());

					System.out.println(dateTimeResponse.getDateTime());

					System.out.println(dateTimeResponse.isDstActive());

					System.out.println(dateTimeResponse.getHour() + ":" + dateTimeResponse.getMinute());

					System.out.println(dateTimeResponse.getTime());

					System.out.println(dateTimeResponse.getTimeZone());

				}
			} else {
				System.err.println("GET request failed with status code: " + responseCode);
			}

			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
