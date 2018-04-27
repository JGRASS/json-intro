package rs.ac.bg.fon.ai.dodatna.json.zadatak3.service;

import java.io.IOException;

import rs.ac.bg.fon.ai.dodatna.json.zadatak3.util.URLConnectionUtil;

public class CurrencyLayerApiCommunication {

	private static final String ACCESS_KEY = "2e4baadf5c5ae6ba436f53ae5558107f";
	private static final String CURRENCY_LAYER_API_URL = "http://apilayer.net/api/live";
	
	public double getRates(String from, String to) {
		//http://apilayer.net/api/live?access_key=2e4baadf5c5ae6ba436f53ae5558107f&currencies=EURsource=USD
	
		String url = CURRENCY_LAYER_API_URL + "?" +
				"access_key=" + ACCESS_KEY +
				"&source=" + from +
				"&currencies=" + to;
		
		try {
			String content = URLConnectionUtil.getContent(url);
			
			// Kreiranje JSONArray objekta
			
			
			
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
