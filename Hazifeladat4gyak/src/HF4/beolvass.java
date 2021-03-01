package HF4;

import java.util.Scanner; // KELL A SCANNER HEZ MERT HEADER ALLOMÁNY VAGY A FASZ TUDJA

public class beolvass {

	public static void main(String[] args) {

		Szemely sz1 = new Szemely();								// használjuk a modult
		Scanner input = new Scanner(System.in);						// input változóba bekéretünk
		System.out.println("Adja meg az elso szemely adatait:");

		int ok = 0;

		String bestring = input.nextLine();						// inputot átalakítjuk egy sztringé "inString"
		String[] stringtomb = bestring.split(" ");				// tombé alakítjuk és stringtomb lesz a neve
		sz1.setNev(stringtomb[0]);								// stringtomb elsõ eleme a sz1.setNev tipus hasz
		sz1.setSuly(Integer.parseInt(stringtomb[1]));				// második elem	
		sz1.setMagassag(Double.parseDouble(stringtomb[2]));		// halmadik elem

		input.close();											// lezárjuk a bekérést

		System.out.println(sz1.toString());						// vissza adjuk a sztringet amibe bekéértünk
		
		System.out.println(sz1.setTtindex());

	}

}
