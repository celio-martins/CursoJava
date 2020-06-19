import java.util.Scanner;

public class Exercicio2h{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

    float raio ,altura, volume ;
    float pi = 3.14f;

     System.out.println("Digite o tamanho do raio");
        raio = teclado.nextFloat();

     System.out.println("Digite o tamanho da altura");
        altura = teclado.nextFloat();

    volume = pi * raio *raio * altura;

     //procesamento (calcular a area)
    //  volum = diagonal1 * diagonal2 ;

     System.out.printf("O valor do volume = %.2f\n", volume);

    }

}
