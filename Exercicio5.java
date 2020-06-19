import java.util.Scanner;

public class Exercicio5{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

    float tempo, vel, dist, consumo;

    System.out.println ("Digite o tempo da viagem");
    tempo = input.nextFloat();
    Sytem.out.println ("Digite a velocidade media");
    vel = input.nextFloat();

    dist = tempo * vel;

    consumo = dist / 12;

    System.out.printf("Voce percorreu %3f Km \n" +"a uma velocidade de %3f km/h \n" + "e consumiu %3.f litros \n", dist, vel, consumo);
    
    }

}