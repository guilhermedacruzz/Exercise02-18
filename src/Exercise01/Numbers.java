package Exercise01;

public class Numbers {

    private final int START = 1;
    private final int STOP = 2500;

    public void division(int divider, int rest){
        System.out.printf("Números que divididos por %d tem resto %d:\t", divider, rest);
        for(int i = START; i < STOP; i++)
            if(i % divider == rest)
                System.out.printf("%d ", i);
        System.out.println();
    }

    public void pairNumbers(int value){
        System.out.printf("Números %s:\t", (value % 2 == 0  ? "par":"impar"));
        for(int i = value; i < STOP; i+=2)
            System.out.printf("%d ", i);
        System.out.println();
    }

    public void primeNumbers() {
        boolean flag;

        System.out.print("Números Primos:\t");
        for(int i = START + 1; i < STOP; i++) {
            flag = true;
            for(int f = 2; f < i; f++)
                if(i % f == 0)
                    flag = false;

            if(flag)
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
