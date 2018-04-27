package rs.ac.bg.fon.ai.dodatna.json.zadatak3;

import rs.ac.bg.fon.ai.dodatna.json.zadatak3.service.CurrencyLayerApiCommunication;

public class Main3 {

	public static void main(String[] args) {
		CurrencyLayerApiCommunication comm = new CurrencyLayerApiCommunication();
		
		double rate = comm.getRates("USD", "EUR");
		
		System.out.println("USD to EUR" + rate);
	}
}
