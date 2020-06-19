import java.util.Scanner;

public class Exercicio2b{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float base , altura , area ;

        System.out.println("Digite o tamanho da base");
        base = teclado.nextFloat();

        System.out.println("Digite o tamanho da Altura");
        altura = teclado.nextFloat();
        
        //procesamento (calcular a area)
        area = base * altura;

      //saida (exibir o valor da area)
      System.out.println("O valor da area = " +area);

    }
}