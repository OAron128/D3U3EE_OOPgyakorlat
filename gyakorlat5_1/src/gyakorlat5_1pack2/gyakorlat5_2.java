package gyakorlat5_1pack2;

import java.util.Scanner;

public class gyakorlat5_2 {
	public static void main(String[] args) {
		teglalap teglalapTomb[] = new teglalap[10];

		feltolt(teglalapTomb);
		kiir(teglalapTomb);
		System.out.println("A legkissebb terulet adatai:" + legkisebbTerulet(teglalapTomb));

		teglalap uj;
		Scanner sc = new Scanner(System.in);

		System.out.println("Új téglalap");
		System.out.println("kérek az a oldalt:");
		int a = sc.nextInt();
		System.out.println("kérek az a oldalt:");
		int b = sc.nextInt();

		uj = new teglalap(a, b);
		System.out.println(uj);

		System.out.println("ennyien voltak nagyobb teruletuek: " + getTeruletNagyobb(teglalapTomb, uj));

		if (keresEgyezoAdatok(teglalapTomb, uj) != -1) {
			System.out.println("az egyezo adatokat .... indexe:" + keresEgyezoAdatok(teglalapTomb, uj));
		} else {
			System.out.println("Nincs egyezo");
		}

	}

	private static void feltolt(teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			teglalapTomb[i] = new teglalap((int) (Math.random() * 9 + 2), (int) (Math.random() * 9 + 2));
		}
	}

	private static void kiir(teglalap[] teglalapTomb) {
		for (int i = 0; i < teglalapTomb.length; i++) {
			System.out.println(teglalapTomb[i]);
		}
	}

	private static teglalap legkisebbTerulet(teglalap[] teglalapTomb) {
		teglalap min = teglalapTomb[0];

		for (teglalap teglalap : teglalapTomb) {
			if (teglalap.getTerulet() < min.getTerulet()) {
				min = teglalap;
			}
		}

		return min;
	}

	public static int getTeruletNagyobb(teglalap[] tomb, teglalap t) {
		int db = 0;
		for (teglalap teglalap : tomb) {
			if (teglalap.getTerulet() > t.getTerulet())
				db++;
		}
		return db;
	}

	public static int keresEgyezoAdatok(teglalap[] tomb, teglalap t) {
		int index = -1;

		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].getOldalakEgyeznekE(t)) {
				index = i;
				break;
			}
		}
		return index;
	}

}