package FakturaProjekt.client.application.pozycjafaktury;

public class Pozycjaaa {
	
	private String imie;
	private String cennaJednostki;
	private String ilosc;
	private String nazwa;
	private String zatwierdz;
	public Pozycjaaa(String imie, String cennaJednostki, String ilosc, String nazwa, String zatwierdz) {
		super();
		this.imie = imie;
		this.cennaJednostki = cennaJednostki;
		this.ilosc = ilosc;
		this.nazwa = nazwa;
		this.zatwierdz = zatwierdz;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getCennaJednostki() {
		return cennaJednostki;
	}
	public void setCennaJednostki(String cennaJednostki) {
		this.cennaJednostki = cennaJednostki;
	}
	public String getIlosc() {
		return ilosc;
	}
	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getZatwierdz() {
		return zatwierdz;
	}
	public void setPowrot(String zatwierdz) {
		this.zatwierdz = zatwierdz;
	}

}
