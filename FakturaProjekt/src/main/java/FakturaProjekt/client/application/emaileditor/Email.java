package FakturaProjekt.client.application.emaileditor;

import java.io.Serializable;

public class Email implements Serializable {

	private String email;
	private String zatwierdz;
	private String cennaJednostki;
	private String ilosc;
	private String jednostki;
	
	
	
	
	
	
	

	public String getJednostki() {
		return jednostki;
	}


	public void setJednostki(String jednostki) {
		this.jednostki = jednostki;
	}


	public String getIlosc() {
		return ilosc;
	}


	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}


	public String getCennaJednostki() {
		return cennaJednostki;
	}


	public void setCennaJednostki(String cennaJednostki) {
		this.cennaJednostki = cennaJednostki;
	}


	public Email() {
	}
	

	public String getZatwierdz() {
		return zatwierdz;
	}


	public void setZatwierdz(String zatwierdz) {
		this.zatwierdz = zatwierdz;
	}


	public Email(String email, String zatwierdz,String cennaJednostki,String ilosc,String jednostki) {
		this.email = email;
		this.zatwierdz=zatwierdz;
		this.cennaJednostki=cennaJednostki;
		this.ilosc=ilosc;
		this.jednostki=jednostki;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}