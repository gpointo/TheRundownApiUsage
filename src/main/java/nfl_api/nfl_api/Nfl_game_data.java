package nfl_api.nfl_api;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Nfl_game_data {
	
public Response getNFLApi() throws IOException {
	OkHttpClient client = new OkHttpClient();

	Request request = new Request.Builder()
		.url("https://therundown-therundown-v1.p.rapidapi.com/sports/2/events/2019-08-09?include=all_periods&include=scores&offset=0")
		.get()
		.addHeader("x-rapidapi-host", "therundown-therundown-v1.p.rapidapi.com")
		.addHeader("x-rapidapi-key", "c088a41ae5mshe0038de824b7430p14f586jsn49f120c1bdd2")
		.build();

	Response response = client.newCall(request).execute();
	return response;
}
}
