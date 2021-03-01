package gyakorlat4_2pack;

public class konyv {
	
	private String cim;
	private String szerzo;
	private int ev;
	private double ar;
	
	
	public void setArNovel(int szazalek) {
		this.ar= this.ar+(ar*(szazalek/100));
	}
	
	
	public string toString() {
		return "Konyv [cim="+cim+",szezo="+ szerzo+",ar="+ar+", ev="+ev+"]";
	}
	
	public String getCim() {
		return cim;
	}
	
}
