import java.util.Scanner;
public class atividade3 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();
	 
    if (idade <=12) {
    System.out.println("atendimento infanti!");
      } else if (idade >= 13 && idade <= 59) {
		   System.out.println("atendimento adulto!");
	  } else {
		   System.out.println("atendimento preferencial!");
	  }	   
   }      
}     
