package FakturaProjekt.client.application.wystawianiefaktur;

public class Pozycja {
	
	private String Nazwa;
	private String cennaJednostki;
	private String ilosc;
	
	public Pozycja(String nazwa, String cennaJednostki, String ilosc) {
		super();
		Nazwa = nazwa;
		this.cennaJednostki = cennaJednostki;
		this.ilosc = ilosc;
	
	}
	public String getNazwa() {
		return Nazwa;
	}
	public String getCennaJednostki() {
		return cennaJednostki;
	}
	public String getIlosc() {
		return ilosc;
	}
	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}
	public void setCennaJednostki(String cennaJednostki) {
		this.cennaJednostki = cennaJednostki;
	}
	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}
}
