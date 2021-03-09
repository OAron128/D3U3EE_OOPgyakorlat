package hf5;

public class a {
	String nev;
	int fizetes;
	
	public void fizetesNovel(int ertek) {
		fizetes+=ertek;
	}
	
	public String getAdatok() {
		return "Nev"+nev+"Fizetes: "+fizetes;
	}
	
	public String setNev(String nev) {
		return nev;
	}
	
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
		
	}
	
	public String getNev() {
		return this.nev;
	}
	
	public int getFizetes() {
		return this.fizetes;
	}
	
	public boolean getFizHatarok(int also, int felso) {
		if(this.fizetes<= felso && this.fizetes >= also)
			return true;
		
		return false;
	}
	
	public double getAdo() {
		return this.fizetes*(16/100);
	}
	
	public boolean getAlkFizNagyobb(a alk) {
		if(this.fizetes > alk.fizetes)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "a [nev=" + nev + ", fizetes=" + fizetes + "]";
	}
	
	

	//kontruktor
	public a(String nev, int fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}
	
	public a(String nev) {
		this.nev = nev;
		fizetes=250000;
	}
	

	
	
	
}
