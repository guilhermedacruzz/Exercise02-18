import java.util.ArrayList;
import java.util.Scanner;

public class Statistic {

    public static void main(String[] args){
        ArrayList<Integer> sequence = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int i = -1;
        do{
            System.out.printf("Digite um número inteiro positivo:\t");
            sequence.add(sc.nextInt());
            i++;
        }while(sequence.get(i) > -1);
        sequence.remove(i);

        if(sequence == null || sequence.isEmpty())
            System.exit(0);

        Statistic s = new Statistic();

        System.out.printf("O maior número:\t%d\n", s.biggestNumbers(sequence));
        System.out.printf("O menor número:\t%d\n", s.smallestNumbers(sequence));
        System.out.printf("Soma de todos os números:\t%d\n", s.addNumbers(sequence));
        s.biggestNumbersReplace(sequence);
        s.smallestNumbersAdded(sequence);
        System.out.printf("A diferença entre o número digitado e a média de todos os números: %f", s.meanDifference(sequence));
    }

    public int biggestNumbers(ArrayList<Integer> sequence) {
        int bigger = sequence.get(0);

        for(int i: sequence)
            if(i > bigger)
                bigger = i;

        return bigger;
    }

    public int smallestNumbers(ArrayList<Integer> sequence) {
        int smaller = sequence.get(0);

        for(int i: sequence)
            if(i < smaller)
                smaller = i;

        return smaller;
    }

    public int addNumbers(ArrayList<Integer> sequence) {
        int add = 0;

        for(int i: sequence)
            add += i;

        return add;
    }

    public void biggestNumbersReplace(ArrayList<Integer> sequence) {
        int add = this.biggestNumbers(sequence);

        System.out.print("Cada número digitado subtraído do maior:\t\n");
        for(int i: sequence)
            System.out.printf("%d ", i - add);
        System.out.println();
    }

    public void smallestNumbersAdded(ArrayList<Integer> sequence) {
        int add = this.smallestNumbers(sequence);

        System.out.print("Cada número digitado acrescido do menor:\t\n");
        for(int i: sequence)
            System.out.printf("%d ", i + add);
        System.out.println();
    }

    public double meanDifference(ArrayList<Integer> sequence) {
        double mean = this.addNumbers(sequence) / sequence.size();

        System.out.println("Digite um número:\t");
        double number = new Scanner(System.in).nextDouble();

        return number - mean;
    }
}
