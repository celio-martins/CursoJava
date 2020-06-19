/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/

import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        int qtd=0;

        for(int cont = 1 ; cont <=6; cont++){   //Faça um programa que leia 6 valores
            num = teclado.nextFloat();
            if (num >0) {
                qtd = qtd+1;
            }
          }
          System.out.println(qtd +" valores positivos");
    }
}