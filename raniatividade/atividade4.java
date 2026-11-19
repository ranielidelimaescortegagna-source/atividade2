import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua nota (0 a 10): ");
    double nota = entrada.nextInt();
	 System.out.println("Digite seu percentual de frequencia: ");
     double frequencia = entrada.nextInt(); 
	 
    if (nota >= 6 && frequencia >= 75) {
		if (nota >= 9 && frequencia >=90) {
            System.out.println("aluno destacado!");
		} else {
			System.out.println("aluno aprovado!"); 
		}	
			
      } else if(frequencia >=74) {
		   System.out.println("aluno em reavaliaçao!");
	  } else {
		   System.out.println("aluno reprovado por frequencia!");
	  }	   
   }      
 }     
