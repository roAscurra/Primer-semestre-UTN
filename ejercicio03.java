import java.util.Scanner;
import java.util.ArrayList;
public class ejercicio03 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Integer>num=new ArrayList<Integer>();
        int n;
        int cont=0;
        int acum=0;
        int prom=0;
        int contIgual=0;
        int contMenor=0;
        int contMayor=0;
        do{
            n=((int)(Math.random()*100)+1);
            if(n%2==0 && n>=0){
                num.add(n);
                acum=acum+n;
                cont++;
            }
        }while(cont<20);
        System.out.println(num);
        //promedio aritmetico:
        prom=(acum/20);
        for(int i=0;i<=19;i++){
            if(num.get(i)==prom){
                contIgual=contIgual+1;
            }
            if(num.get(i)<prom){
                contMenor=contMenor+1;
            }
            if(num.get(i)>prom){
                contMayor=contMayor+1;
            }

        }
        
        System.out.println("El promedio es: "+prom);
        System.out.println("Cantidad de numeros iguales al promedio: "+contIgual);
        System.out.println("Cantidad de numeros menores al promedio: "+contMenor);
        System.out.println("Cantidad de numeros mayores al promedio: "+contMayor);
    }
}
