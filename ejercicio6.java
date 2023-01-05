import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ejercicio6 {
    public static void main(String[] args) {
    Scanner lector= new Scanner(System.in);
        ArrayList<Integer>num=new ArrayList<Integer>();
            System.out.println("Ingrese 10 digitos enteros");
            for(int i=0;i<=9;i++){
                int n=lector.nextInt();
                num.add(n);
            }
            System.out.println("ArrayList ordenado de forma ascendete");
       //forma ascendete
        ArrayList<Integer>array2=(ArrayList<Integer>)num.clone();
            Collections.sort(array2);
            for (Integer numero: array2) {
                System.out.println(numero);
            } 
            System.out.println("ArrayList ordenado de forma descendete");
       //forma descendente
        ArrayList<Integer>array3=(ArrayList<Integer>)num.clone();
            Collections.sort(array3, Collections.reverseOrder());
            for (Integer numero: array3) {
                System.out.println(numero);
            } 
    }  
}