import java.util.Scanner;

public class Exercicio2a{
  public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);

      float lado, area;
      // entrada (o valor do lado do quadrado)
      System.out.println("Digiyte o lado do quadrado");
      lado = teclado.nextFloat();

      //procesamento (calcular a area)
      area = lado * lado;

      //saida (exibir o valor da area)
      System.out.println("O valor da area = " +area);
}
}