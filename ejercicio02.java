import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Double>num=new ArrayList<>();
        double n;
        for(int i=0;i<=2;i++){
            System.out.println("Ingrese numero "+(i+1));
            n=lector.nextDouble();
            num.add(n);
        }
        System.out.println("Numeros ingresados"+num);
        System.out.println("El mayor del arreglo es: "+Collections.max(num));
        System.out.println("El mayor del arreglo es: "+Collections.min(num));
        System.out.println("El rango entre el mayor y el menor es: "+ (Collections.max(num)-Collections.min(num)));
    }
}
