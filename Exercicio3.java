import java.util.Scanner;

public class Exercicio3{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

    float salario_minimo , Kw, ValorKw, Custo, Desconto ;
    
     System.out.println("Digite o Salario Minimo:");
        salario_minimo = teclado.nextFloat();

     System.out.println("Digite o Quantidade de KW");
        Kw = teclado.nextFloat();

//procesamento 
        ValorKw = salario_minimo / 7 / 100 ;
        Custo = ValorKw * Kw;
        Desconto = Custo - (Custo * 0.1f);

     
    //  saida

     System.out.printf("O valor em reais KW %.2f\n", ValorKw);
     System.out.printf("O valor a ser pago %.2f\n", Custo);
     System.out.printf("Novo valor com 10%% desconto %.2f\n", Desconto);

    }

}
