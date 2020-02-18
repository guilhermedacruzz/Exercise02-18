package MegaSena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
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
}
