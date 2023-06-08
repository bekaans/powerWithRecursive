import java.util.Scanner;
public class Main {
   static int us(int a,int b) {
       if (b != 0) {
           return a * us(a, b - 1);
       }else { return 1;}

   }

    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
int c,d;
        System.out.println("Taban değerini gir :"); c=inp.nextInt();
        System.out.println("Üs değerini gir :"); d=inp.nextInt();
        System.out.println("Değeriniz "+us(c,d));

    }
}

