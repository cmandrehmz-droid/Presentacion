import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Reto {
    public static void main(String[] args) {
        int Intentos = 0;
        int IDs;
        int Contador = 8;
        int[] BlackList = {4123,3123,1223,2123,9333};
        int[] WhiteList = {1112,1123,4422,2132,9292};

        Scanner sc = new Scanner(System.in);

       while (true) {
        System.out.println("Bienvenido al ingreso");
        System.out.println("Ingrese la ID correspondiente, recuerda que solo tienes"+Contador+ " intentos");
        IDs = sc.nextInt();
        for(int i= 0;i <WhiteList.length; i++){
            
        }
       }
    }
}
