import java.util.Scanner;
public class atividade6 {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
		  System.out.println("digite o codigo para selecionar o turno: turno: 1: - manha: 2 - tarde;");
		  int turno = entrada.nextInt();
		  System.out.println("digite o código para selecionar a diciplina:  manha: 1- matematica - 2 portugues ");
          int disciplina = entrada.nextInt();
		  
		   
          switch (turno){
            case 1:
				switch (disciplina){
					case 1:
						System.out.println("matematica");
						break;
					case 2:
						System.out.println("portugues");
						break;
					default:
				    System.out.println("disciplina nao disponivel no periodo da manha");
			break;
				}
            case 2:
				switch (disciplina){
				case 1:
					System.out.println("historia");
					break;
                default:
				    System.out.println("disciplina nao disponivel no periodo da tarde");
					break;
				}
			default:
				System.out.println("turno invalido");
						
						
          }  
        }
}