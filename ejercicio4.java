import java.util.Scanner;
import java.util.ArrayList;
public class ejercicio4 {
    
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<String>palabra=new ArrayList<>();
        String n;
        String mayor;
        int cant=0;
        int may=0;
        do{
            System.out.println("Ingrese palabras. Ingrese 'salir' para salir");
            System.out.println("Palabra:");
            n=lector.nextLine();
            palabra.add(n);
            may=n.length();
            if(may>cant){
                
            }
        }while(!n.equals("salir"));
        System.out.println(palabra);
    } 
}
