package MegaSena;

import java.util.Random;

public class MegaSena {
    private int[] sorteio = new int[6];

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
                System.out.printf("Putz! Não foi dessa fez.....Você acertou apenas um número...\n");
                break;

            case 2:
                System.out.printf("Parabéns! Você acertou dois números! Mas não ganhou nada\n");
                break;

            case 3:
                System.out.printf("Parabéns! Você acertou metade!\n");
                break;

            case 4:
                System.out.printf("Parabéns! Você acertou uma Quadra! Ganhou 400 reais!\n");
                break;

            case 5:
                System.out.printf("Parabéns! Você acertou uma Quinta! Ganhou 1500 reais!\n");
                break;

            case 6:
                System.out.printf("Parabéns! Você está milionário!\n");
                break;

            default:
                System.out.printf("Que pena! Você não acertou nada.... Continue tentando.....\n");
                break;
        }
    }
}
