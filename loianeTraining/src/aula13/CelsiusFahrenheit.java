package loianeTraining.src.aula13;

import java.util.Scanner;

public class CelsiusFahrenheit {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nConversão de temperatura - Celsius para Fahrenheit \n" );

    System.out.println( "Informe a temperatura em Celsius" );
    double celsius = scan.nextDouble();

    double conversao = ( celsius * 9 / 5 ) + 32;

    System.out.println( "\n" + celsius + " °C = " + conversao + " °F \n" );
  }
}
