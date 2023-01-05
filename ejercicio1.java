import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Integer> numeros=new ArrayList();
            int n;
            do{
                System.out.println("Ingrese nùmeros. Numero menor a cero para salir");
                System.out.println("Numero:");
                n=lector.nextInt();
                if(n>=0){
                    numeros.add(n);
                }
            }while(n>0);
                System.out.println(numeros);  
    }
}
   

