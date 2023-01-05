import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio5{
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Integer>numeros=new ArrayList<Integer>();
        int n;
        int contSi=0;
        int cont=0;
        int pos=0;
        for(int i=0;i<=50;i++){
            n=((int)(Math.random()*100)+1);
            numeros.add(n);
          //  System.out.println(n);
        }
        System.out.println("Ingrese el valor que desea buscar");
        int num=lector.nextInt();
            for(int j=0;j<=50;j++){
                if(numeros.get(j)==num){
                    contSi=contSi+1;
                    if(contSi<=1){
                        pos = j;
                    }
                }
            }
        if(contSi>=1){
            System.out.println("La valor se encuentra en la posicion: "+pos);
        }  
        if(contSi<=0){
            System.out.println("El valor no se encuentra en el arreglo");
        }
    }  
}