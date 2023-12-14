package api.test.data;

import api.test.data.Response.JokeResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://official-joke-api.appspot.com/random_joke
		System.out.println("Test");
//		String json = "{\"type\":\"general\",\"setup\":\"I started a new business making yachts in my attic this year...\",\"punchline\":\"The sails are going through the roof.\",\"id\":68}";
//
//		Gson gson = new Gson();
//
//		// System.out.println(jokeResponse.toString());
//
//		for (int i = 0; i <= 11; i++) {
//			JokeResponse jokeResponse = gson.fromJson(json, JokeResponse.class);
//			System.out.println(jokeResponse.getType());
//			System.out.println(jokeResponse.getSetup());
//			System.out.println(jokeResponse.getPunchline());
//			System.out.println(jokeResponse.getId());
//		}

		// Not working
//		try {
//			// Create an HttpClient with custom SSL settings
//			CloseableHttpClient httpClient = createCustomHttpClient();
//
//			// Define the URL and headers
//			String url = "https://your-api-endpoint-here";
//			HttpGet request = new HttpGet(url);
//			request.addHeader("Authorization", "Bearer your-access-token");
//			// Add more headers as needed
//
//			// Execute the GET request
//			CloseableHttpResponse response = httpClient.execute(request);
//
//			// Read and parse the response
//			BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//			StringBuilder jsonResponse = new StringBuilder();
//			String line;
//			while ((line = reader.readLine()) != null) {
//				jsonResponse.append(line);
//			}
//
//			// Parse the JSON response into the POJO
//			Gson gson = new Gson();
//			JokeResponse jokeResponse = gson.fromJson(jsonResponse.toString(), JokeResponse.class);
//
//			// Close the HttpClient
//			httpClient.close();
//
//			// Print the parsed response
//			System.out.println(jokeResponse.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static CloseableHttpClient createCustomHttpClient() throws Exception {
//		return HttpUriRequestBaseUtil.client(HttpUriRequestBaseUtil.custom()
//				.setSSLContext(SSLContexts.custom().loadTrustMaterial(new TrustSelfSignedStrategy()).build()).build());

		for (int i = 1; i <= 11; i++) {
			try {
				HttpClient httpClient = HttpClients.createDefault();
				HttpGet request = new HttpGet("https://official-joke-api.appspot.com/random_joke");
				// request.setHeader("Authorization", "Bearer YOUR_API_TOKEN");

				HttpResponse response = httpClient.execute(request);

				if (response.getStatusLine().getStatusCode() == 200) {
					// Read the response as a string
					String jsonResponse = EntityUtils.toString(response.getEntity());

					// Parse the JSON response into the POJO
					ObjectMapper objectMapper = new ObjectMapper();
					JokeResponse jokeResponse = objectMapper.readValue(jsonResponse, JokeResponse.class);

					// Now you can work with the POJO
					System.out.println("Type: " + jokeResponse.getType());
					System.out.println("Setup: " + jokeResponse.getSetup());
					System.out.println("Punchline: " + jokeResponse.getPunchline());
					System.out.println("ID: " + jokeResponse.getId());

				} else {
					System.err.println("Request failed with status code: " + response.getStatusLine().getStatusCode());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
