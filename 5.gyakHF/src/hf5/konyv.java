package hf5;

public class konyv {
	
	private String cim;
	private String szerzo;
	private int ev;
	private double ar;
	
	
	public void setArNovel(int szazalek) {
		this.ar= this.ar+(ar*(szazalek/100));
	}
	
	
	public String toString() {
		return "Konyv [cim="+cim+",szezo="+ szerzo+",ar="+ar+", ev="+ev+"]";
	}
	
	public String getCim() {
		return cim;
	}


	public String getSzerzo() {
		return szerzo;
	}


	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}


	public int getEv() {
		return ev;
	}


	public void setEv(int ev) {
		this.ev = ev;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(double ar) {
		this.ar = ar;
	}


	public void setCim(String cim) {
		this.cim = cim;
	}


	public konyv(String cim, String szerzo, int ev, double ar) {
		super();
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = ev;
		this.ar = ar;
	}


	public konyv(String cim, String szerzo) {
		super();
		this.cim = cim;
		this.szerzo = szerzo;
		ar=2500;
		java.time.LocalDate currentDate = java.time.LocalDate.now(); // mai dátum
		int year = currentDate.getYear(); //mai dátumból az év
		ev= year;
	}
	
	
	
	
	
}
