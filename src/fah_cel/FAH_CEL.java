
package fah_cel;
import java.util.Scanner;


public class FAH_CEL {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor em celsius:");
        int cel = entrada.nextInt();
        int i = 1;
        
        do
        {
            int f = (9 * cel + 160) / 5;
            System.out.println(f);
            System.out.println("Graus Fahrenheit: ");
            i++;
            cel = cel+10;
        }while (cel <= 100);
    
        
    }
}
    
