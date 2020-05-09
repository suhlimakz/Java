package loianeTraining.src.aula13;

import java.util.Scanner;

public class SomaImpressaoNum {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "Digite o primeiro número:" );
    int num1 = scan.nextInt();

    System.out.println( "Digite o segundo número:" );
    int num2 = scan.nextInt();

    int resultado = num1 + num2;

    System.out.println( "A soma de " + num1 + " + " + num2 + " é " + resultado );
  }

}