package eTradeDemo2.business.concretes;

import eTradeDemo2.business.abstracts.eMailService;

public class eMailManager implements eMailService{

	@Override
	public void send(String message) {
		System.out.println("Mesaj adrese gönderildi : " + message);				
	}

}
