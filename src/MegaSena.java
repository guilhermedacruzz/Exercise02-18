import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MegaSena {

    private int[] sorteio = new int[6];

    public static void main(String[] args) throws IOException {

        int aposta[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.printf("Digite o número %d:\t", i + 1);
            aposta[i] = sc.nextInt();

            if(aposta[i] >= 1 && aposta[i] <= 60) {
                for(int f = 0; f < i; f++) {
                    if(aposta[f] == aposta[i]) {
                        System.out.println("Número Repitido!");
                        new BufferedReader(new InputStreamReader(System.in)).readLine();
                        i--;
                    }
                }
            }
            else{
                System.out.println("Número Digitado fora dos Parâmetros!");
                new BufferedReader(new InputStreamReader(System.in)).readLine();
                i--;
            }
        }

        MegaSena mg = new MegaSena();
        mg.verificarVencedor(aposta);
    }

    public MegaSena(){
        for(int i = 0; i < 6; i++){
            this.sorteio[i] = new Random().nextInt() % 60 + 1;
        }
    }

    public void verificarVencedor(int aposta[]) {
        int acertos = 0;

        for(int i = 0; i < 6; i++)
            for(int f = 0; f < 6; f++)
                if(this.sorteio[f] == aposta[i])
                    acertos++;

        this.imprimirResultado(acertos);
    }

    private void imprimirResultado(int acertos){
        switch(acertos){
            case 1:
                System.out.println("Putz! Não foi dessa fez.....Você acertou apenas um número...\n");
                break;

            case 2:
                System.out.println("Parabéns! Você acertou dois números! Mas não ganhou nada\n");
                break;

            case 3:
                System.out.println("Parabéns! Você acertou metade!\n");
                break;

            case 4:
                System.out.println("Parabéns! Você acertou uma Quadra! Ganhou 400 reais!\n");
                break;

            case 5:
                System.out.println("Parabéns! Você acertou uma Quinta! Ganhou 1500 reais!\n");
                break;

            case 6:
                System.out.println("Parabéns! Você está milionário!\n");
                break;

            default:
                System.out.println("Que pena! Você não acertou nada.... Continue tentando.....\n");
                break;
        }
    }
}
