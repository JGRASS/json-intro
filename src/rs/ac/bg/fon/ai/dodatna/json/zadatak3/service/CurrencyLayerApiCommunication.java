package rs.ac.bg.fon.ai.dodatna.json.zadatak3.service;

import java.io.IOException;
import java.text.MessageFormat;

import rs.ac.bg.fon.ai.dodatna.json.zadatak3.util.URLConnectionUtil;

public class CurrencyLayerApiCommunication {

	private static final String ACCESS_KEY = "2e4baadf5c5ae6ba436f53ae5558107f";
	private static final String SERVICE_URL_PATTERN = "http://apilayer.net/api/live?access_key="+ACCESS_KEY+"&source={0}&currencies={1}";
	
	public double getRates(String from, String to) {
		String url = MessageFormat.format(SERVICE_URL_PATTERN, from, to);
		
		try {
			String content = URLConnectionUtil.fetchContentFromURL(url);
			
			
			
			
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
