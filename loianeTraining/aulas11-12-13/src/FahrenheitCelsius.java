import java.util.Scanner;

public class FahrenheitCelsius {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nConversão de temperatura - Fahrenheit para Celsius \n" );

    System.out.println( "Informe a temperatura em Fahrenheit" );
    double fahrenheit = scan.nextDouble();

    double conversaoCelsius = ( 5 * ( fahrenheit - 32 ) / 9 );

    System.out.println( "\n" + fahrenheit + " °F = " + conversaoCelsius + " °C \n" );
  }
}
