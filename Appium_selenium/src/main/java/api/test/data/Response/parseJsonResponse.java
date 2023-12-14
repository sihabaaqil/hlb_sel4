package api.test.data.Response;

import java.util.Arrays;
import java.util.List;

public class parseJsonResponse {

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

	private static List<String> parseJsonResponse2(String jsonResponse) {
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
