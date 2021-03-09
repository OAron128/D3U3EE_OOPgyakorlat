package hf5;

public class gyakorlat4_1class {

	public static void main(String[] args) {
        a[] alkTomb = new a[5];

        feltolt(alkTomb);
        kiir(alkTomb);
        a maxFiz = getLegmagasabbFiz(alkTomb);
        System.out.println("A legnagyobb fizetesu alkalmazott " + maxFiz.getAdatok());
        System.out.println("240-280 koze eso fizetesuek szama: " + getAlkDbFizIntervallum(alkTomb, 230, 280));
        System.out.println("Atlag " + getAtlag(alkTomb));
        System.out.println("Ado " + getAdo(alkTomb));

    }

    private static void feltolt(a[] alkTomb)
    {
        for(int i=0; i< alkTomb.length; i++)
        {
            alkTomb[i]= new a("Tomi", (int)(Math.random()*50+200));
        }
    }

    private static void kiir(a[] alkTomb)
    {
        for(int i=0; i< alkTomb.length; i++)
        {
            System.out.println(alkTomb[i].getAdatok());
        }
    }

    private static a getLegmagasabbFiz(a[] input)
    {
        a max = input[0];

        for(a alk : input)
        {
            if(alk.getFizetes()>max.getFizetes())
                max=alk;
        }

        return max;
    }

    private static int getAlkDbFizIntervallum(a[] input, int also, int felso)
    {
        int db=0;
        for(a alk : input)
        {
            if(alk.getFizHatarok(also,felso))
                db++;
        }

        return db;
    }

    private static double getAtlag(a[] input)
    {
        double sum=0;
        for(a alk : input)
        {
            sum+=alk.getFizetes();
        }

        return sum/input.length;
    }

    private static double getAdo(a[] input)
    {
        double sum=0;
        for(a alk : input)
        {
            sum+=alk.getAdo();
        }

        return sum;
    }


}