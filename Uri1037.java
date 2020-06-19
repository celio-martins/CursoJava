import java.util.Scanner;
public class  Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        
        valor = teclado.nextFloat();


        if (valor >= 0 && valor <= 25) {               //intervalos ([0,25],
            System.out.println("Intervalo [0,25]");
        }
        else{   
            if (valor >= 25f && valor <= 50){          // seguintes  (25,50]
                System.out.println("Intervalo (25,50]");
            }
            else{   
                if (valor > 50f && valor <= 75)  {                // (50,75]
                    System.out.println("Intervalo (50,75]");
                }
                else{ 
                    if (valor > 75f && valor <= 100) {                // (75,100])
                        System.out.println("Intervalo (75,100]");
                    }
                    else{ 
                         // (fora do intervalo])
                            System.out.println("Fora de intervalo");
                    }
                }

            }
        }
    }
} 