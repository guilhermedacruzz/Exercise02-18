import java.util.ArrayList;
import java.util.Scanner;

public class Growing {

    public static void main(String[] args){
        int amount;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.printf("Digite o tamanho do vetor:\t");
            amount = sc.nextInt();
        }while(amount <= 0);

        int numbers[] = new int[amount];

        for(int i = 0; i < amount; i++){
            System.out.printf("Digite um número:\t");
            numbers[i] = sc.nextInt();
        }

        Growing g = new Growing();

        if(g.checkGrowing(numbers, amount)){
            g.printVetor(numbers);
        }
        else{
            g.printVetor(numbers);
            g.organizeGrowing(numbers, amount);
            g.printVetor(numbers);
        }

    }

    public void organizeGrowing(int numbers[], int index) {
        for(int i = 0; i < index; i++) {
            for(int f = 0; f < i; f++) {
                if(numbers[i] < numbers[f]) {
                    int help = numbers[i];
                    numbers[i] = numbers[f];
                    numbers[f] = help;
                }
            }
        }
    }

    public void printVetor(int numbers[]) {
        System.out.print("Sequência:\t");
        for(int i: numbers)
            System.out.printf("%d ", i);
        System.out.println();
    }

    public boolean checkGrowing(int numbers[], int index) {
        for(int i = 0; i < index - 1; i++)
            if(numbers[i] > numbers[i + 1])
                return false;

        return true;
    }
}
