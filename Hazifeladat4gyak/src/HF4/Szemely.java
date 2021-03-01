package HF4;

public class Szemely {

	private String nev;
	private int suly;
	private double magassag;
	
	
	
	public String setTtindex() {
		double tti;
		tti= this.suly/(this.magassag* magassag);
		
		if(tti<18.5) {
			return "sovany";
		}
		else if(tti>25) {
			return "kover";
		}
		else {
			return "normal";
		}
		
	}

	public String toString() {
		return "Szemely [nev=" + nev + ", suly=" + suly +" kg"+ ", magassag=" + magassag+ " m" +",tti="+ setTtindex() + "]";
	}
	
	public String getNev() {
		return nev;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}
	
	
	
	
}
