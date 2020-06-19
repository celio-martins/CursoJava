import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

    float altura , base , area ;

     System.out.println("Digite o tamanho da area");
        base = teclado.nextFloat();

     System.out.println("Digite o tamanho da altura 2");
        altura = teclado.nextFloat();

     //procesamento (calcular a area)
        area = (altura * base) / 2 ;

     System.out.println("O valor da area do Triangulo eh= " +area);

}

}