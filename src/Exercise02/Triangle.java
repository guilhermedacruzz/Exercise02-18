package Exercise02;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int triangle[] = new int [3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.printf("Digite o lado %d do triângulo:\t", i + 1);
            triangle[i] = sc.nextInt();
        }

        if(Triangle.triangleExist(triangle)){
            Triangle.triangleType(triangle);
        }
        else{
            System.out.println("Os valores digitados não são os lados de um Triângulo!");
        }
    }

    public static boolean triangleExist(int triangle[]) {
        if(triangle[0] + triangle[1] > triangle[2] && triangle[1] + triangle[2] > triangle[0]
        && triangle[0] + triangle[2] > triangle[1]) {
            return true;
        }
        return false;
    }
    public static void triangleType(int triangle[]){

        System.out.print("O triângulo é ");

        if(triangle[0] == triangle[1] && triangle[0] == triangle[2]){
            System.out.println("Equilátero");
        }
        else if(triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2]) {
            System.out.println("Isósceles");
        }
        else{
            System.out.println("Escaleno");
        }
    }
}
