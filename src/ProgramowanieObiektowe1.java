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