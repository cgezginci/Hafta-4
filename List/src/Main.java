
public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));


        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Liste durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(20);
        liste.add(90);
        liste.add(100);
        liste.add(110);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());


        liste.get(2);
        liste.remove(2);
        liste.set(2, 5);
        liste.get(2);
        System.out.println(liste);
        System.out.println( liste.indexOf(100));
        System.out.println(liste.lastIndexOf(20));


        MyList<Integer> altListem = liste.subList(1, 4);
        System.out.println(altListem.toString());



        System.out.println("Listemde 20 değeri var mı? " + liste.contains(20));
        System.out.println("Listemde 3 değeri var mı? " + liste.contains(3));

        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinini ilk elemanı: "  + dizi[0]);

        liste.clear();
        System.out.println(liste);






    }
}
