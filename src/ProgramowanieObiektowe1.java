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


    }
}

    class Monitor{
        int szerokosc;
        int wysokosc;

        void on(){

        }
        void off(){

        }
    }
    class Pont{

        Pont(){
          //konstruktor domyslny z nadaniem wartosci domyslnych
            System.out.println("Wywolano konstruktor domyslny p");
            x = 20;
            y = 20;
        }
        Pont(int pierwszzy, int drugi){
            System.out.println("Konstruktor p2 z 2 parametrami int");
            x = pierwszzy;
            y=drugi;
        }
        int x;
        int y;
    }