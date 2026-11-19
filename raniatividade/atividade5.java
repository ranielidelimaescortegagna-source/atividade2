import java.util.Scanner;
public class atividade5 {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
		  System.out.println("produto: 1: boné - R$50,00; 2: calça - R$80.00; 3: tenis -R$150,00");
		  System.out.println("digite o código do produto");
          int codigo = entrada.nextInt();
		  System.out.println("quantas opçoes deseja");
		   int quant = entrada.nextInt();
          switch (codigo) {
                case 1:
					double valor = quant*50.00;
					System.out.println("produto: boné; preço" + valor);
                break;
                case 2:
					 valor = quant*80.00;
					 System.out.println("produto: calça; preço" + valor);
                break;
                case 3:
					  valor = quant*150.00;
					  System.out.println(" produto: tenis; preço" + valor);
				break;
                default:
                     System.out.println("opçao inválida");				
            }
        }
}