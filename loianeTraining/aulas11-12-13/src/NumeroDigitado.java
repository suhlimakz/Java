import java.util.Scanner;

public class NumeroDigitado {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nDigite um número" );
    double numero = scan.nextDouble();

    System.out.println( "\nO número informado foi: " + numero );
  }
}
