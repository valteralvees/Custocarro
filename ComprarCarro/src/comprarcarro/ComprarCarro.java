package comprarcarro;
import java.util.Scanner;

public class ComprarCarro {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double custofabrica =0;
        double distribuicao = 28;
        double impostos =45;
        double custofinal =0;
        System.out.println("Por favor, digite o valor de fabricação do veículo");
        custofabrica = teclado.nextDouble();
        custofinal = (custofabrica/100 *distribuicao) + (custofabrica/100 *impostos) + custofabrica;
        System.out.println("O valor de mercvado a ser pago no veículo é de R$"+custofinal+".");
        
    }
    
}
