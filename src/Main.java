public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] tab1;
        tab1=new int[5];
        tab1[0]=10;
        tab1[1]=11;
        tab1[2]=12;
        tab1[3]=13;
        tab1[4]=14;

        //for (tab1:tab1) {
        //    System.out.println(tab1);
      //  }
        for (int i = 0; i<=tab1.length-1;i++)
            System.out.println("Talica "+ i+" "+  tab1[i]);

        System.out.println("\n#_________#________#");

        int[] tab2 = new int[10];
        int i = 0 ;
        int j = 1;
            while (i < tab2.length ){
                tab2[i] = 10*j;
                System.out.println(tab2[i]);
                i++;
                j++;

            }

    }
}
