package gyakorlat5_1pack2;

public class teglalap {

	 private int a;
	 private int b;
	 
	 //konstruktór
	 
	 public teglalap(int a, int b) {
		 this.a=a;
		 this.b=b;
	 }
	 

	 public teglalap(int a) {
		 this.a=a;
		 this.b=a;
	 }
	 
	 
	 //terület
	 
	 public int getTerulet() {
		 return a * b;
	 }
	 
	 public String toString() {
		 return "a:"+ this.a +"b:"+ b +"terulet:"+ this.getTerulet();
	 }


	 public void setOldalak(int a, int b) {
		 this.a=a;
		 this.b=b;
	 }
	 
	 
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	public boolean getNagyobbTerulet(teglalap masik) {
		if(this.getTerulet()> masik.getTerulet())
			return true;
		
		return false;
	}
	
	
	public boolean getOldalakEgyeznekE(teglalap masik) {
		if(this.a == masik.a && this.b == masik.b)
			return true;
		
		return false;
	}
	
	 
}
