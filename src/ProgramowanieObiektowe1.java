import java.awt.*;

public class ProgramowanieObiektowe1 {
    int a;
    static void  test(){
        System.out.println("Metoda statyczna wywołana ze statycznego kontestu, WYmaganaj jest by była Statyczną");
    }

    public static void main(String[] args) {

        test();
        Monitor abc = new Monitor();
        Monitor abc2 = new Monitor();
        abc.szerokosc=122;
        abc2.szerokosc=221;

        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);

        new Pont();
        Pont p = new Pont();
        p.x=10;
        p.y=20;

        Pont p2 = new Pont(100,200);

        System.out.println("P: x;y = "+p.x+" "+p.y);
        System.out.println("P2: x;y = "+p2.x+" "+p2.y);

        Metodowa metodowa = new Metodowa();
        metodowa.wypisz("kamil","kamil2");

        Metodowa metodowa1 = new Metodowa();
        metodowa1.wypisz("kamilek","kamilek");

        System.out.println("-----------Oddzielenie -----------");

        int wynik = metodowa.dodaj(100,99);
        System.out.println(wynik);

        double wynik2 = metodowa.dziel(100,10);
        System.out.println(wynik2);
        System.out.println("\n-----------Oddzielenie -----------");

        Matematyka test = new Matematyka();
        double wynik11 = test.dodaj(10,12);
        System.out.println(wynik11);
    }
}

    class Monitor{
        int szerokosc;
        int wysokosc;

        void on(){

        }
        void off(){
                // metoda funkcyjna
        }

    }
    class Pont{

        Pont(){
          //konstruktor domyslny z nadaniem wartosci domyslnych
            System.out.println("Wywolano konstruktor domyslny p");
            x = 20;
            y = 20;
        }
        Pont(int x, int y){
            System.out.println("Konstruktor p2 z 2 parametrami int");
           this.x = x;
            this.y = y;
        }
        int x;
        int y;
    }

    class Metodowa{
        // funkcja - metoda, która jest poza klasą (dziala niejako samoistnie). W javie Wewnątrz klasy wszystko Wiec nazywa się metoda

        void wypisz(){
            System.out.println("Metodowa z konstr. domyslnego - hahahah - tada");
        }
        void wypisz(String name,String surname){
            System.out.println("Imie "+name +" \nNazwisko "+surname +"\n");
        }

        int dodaj(int a,int b){
            return a + b;
        }

        double dodaj(double a,double b){
            return a + b;
        }
        double dziel(double a,double b){
            if (b==0)
                return 0; // po 1 returnie reszta zostanie pominieta
            //wypisanie jak ok
            return a/b;

        }
    }

        // statyczna metoda - istnieje zawsznei, nie ma potrzeby tworzenia instancji klasy - odwołanie do metody poprzez . - po klasie
        // przy stałych zmiennych - tak jak z klasa, aby dostep był dostepny po kropce z klasy
    class Matematyka{
       static final double PI = 3.14;
        static double dodaj(double a, double b){
            return a+b;
        }
    }

    class Klient{
        Klient(String name){
            this.name = name;
        }
        String name;
        int id;
    }