package HF4;

import java.util.Scanner; // KELL A SCANNER HEZ MERT HEADER ALLOM�NY VAGY A FASZ TUDJA

public class beolvass {

	public static void main(String[] args) {

		Szemely sz1 = new Szemely();								// haszn�ljuk a modult
		Scanner input = new Scanner(System.in);						// input v�ltoz�ba bek�ret�nk
		System.out.println("Adja meg az elso szemely adatait:");

		int ok = 0;

		String bestring = input.nextLine();						// inputot �talak�tjuk egy sztring� "inString"
		String[] stringtomb = bestring.split(" ");				// tomb� alak�tjuk �s stringtomb lesz a neve
		sz1.setNev(stringtomb[0]);								// stringtomb els� eleme a sz1.setNev tipus hasz
		sz1.setSuly(Integer.parseInt(stringtomb[1]));				// m�sodik elem	
		sz1.setMagassag(Double.parseDouble(stringtomb[2]));		// halmadik elem

		input.close();											// lez�rjuk a bek�r�st

		System.out.println(sz1.toString());						// vissza adjuk a sztringet amibe bek��rt�nk
		
		System.out.println(sz1.setTtindex());

	}

}
