import java.util.Scanner;

public class GrowingTwo {
    public static void main(String[] args) {

        int value[] = new int[2];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        do{
            System.out.printf("Digite o tamanho do vetor %d:\t", i + 1);
            int numbers = sc.nextInt();
            if(numbers > 0 && numbers < 100) {
                value[i] = numbers;
                i++;
            }
        }while(i < 2);
        System.out.printf("\n\n");

        int sequenceOne[] = new int[value[0]];
        int sequenceTwo[] = new int[value[1]];
        int sequenceMax[] = new int[value[0] + value[1]];
        int j = 0;

        for(i = 0; i < value[0]; i++){
            System.out.printf("Digite o valor %d do vetor %d:\t", i + 1, 1);
            sequenceOne[i] = sc.nextInt();
            sequenceMax[j++] = sequenceOne[i];
        }
        System.out.printf("\n\n");

        for(i = 0; i < value[1]; i++){
            System.out.printf("Digite o valor %d do vetor %d:\t", i + 1, 2);
            sequenceTwo[i] = sc.nextInt();
            sequenceMax[j++] = sequenceTwo[i];
        }
        System.out.printf("\n\n");

        GrowingTwo g = new GrowingTwo();
        g.organizeGrowing(sequenceMax, value[0] + value[1]);
        g.printVetor(sequenceMax);
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

}
