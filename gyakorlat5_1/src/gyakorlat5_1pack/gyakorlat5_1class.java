package gyakorlat5_1pack;

public class gyakorlat5_1class {

	public static void main(String[] args) {
		teglalap aTeglalap= new teglalap(4,6);
		teglalap bTeglalap= new teglalap(2,7);
		teglalap cTeglalap;
		
		
		cTeglalap = aTeglalap;   // hivatkozás
		
		System.out.println(aTeglalap);
		System.out.println(bTeglalap);
		System.out.println(cTeglalap);
		System.out.println();
		
		aTeglalap.setOldalak(8, 2);
		
		System.out.println(aTeglalap);
		System.out.println(bTeglalap);
		System.out.println(cTeglalap);
		
		System.out.println();
		aTeglalap.setOldalak(2, 7);
		
		System.out.println(aTeglalap);
		System.out.println(bTeglalap);
		System.out.println(cTeglalap);
		
		
		System.out.println();
		System.out.println(aTeglalap == bTeglalap);
		System.out.println(aTeglalap == cTeglalap);
		
		System.out.println();
		System.out.println(aTeglalap.getOldalakEgyeznekE(bTeglalap));
		
		teglalap dTeglalap= cTeglalap;
		System.out.println(dTeglalap);


	}

}
