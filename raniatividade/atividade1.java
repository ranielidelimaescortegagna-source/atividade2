import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();

    if (idade >= 12 || idade >= 65) {
    System.out.println("Entrada gratuita!");
      } else {
		   System.out.println("Entrada paga!");
	  }	   
   }      
}     
