import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

    float diagonal1 , diagonal2 , area;

     System.out.println("Digite o tamanho da diagonal 2");
        diagonal1 = teclado.nextFloat();

     System.out.println("Digite o tamanho da diagonal 2");
        diagonal2 = teclado.nextFloat();

     //procesamento (calcular a area)
        area = diagonal1 * diagonal2 ;

     System.out.println("O valor da area do Triangulo eh= " +area);

    }

}
