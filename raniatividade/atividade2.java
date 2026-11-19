import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua nota: ");
    double nota = entrada.nextInt();
	 System.out.println("Digite seu percentual de frequencia: ");
     double frequencia = entrada.nextInt(); 
	 
    if (nota >= 7 || frequencia >= 75) {
    System.out.println("aluno aprovado!");
      } else {
		   System.out.println("aluno reprovado!");
	  }	   
   }      
}     
