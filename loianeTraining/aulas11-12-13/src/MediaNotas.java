import java.util.Scanner;

public class MediaNotas {
  
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "Primeira nota:" );
    double primeiraNota = scan.nextDouble();
    
    System.out.println( "Segunda nota:" );
    double segundaNota = scan.nextDouble();
    
    System.out.println( "Terceira nota:" );
    double terceiraNota = scan.nextDouble();
    
    System.out.println( "Quarta nota:" );
    double quartaNota = scan.nextDouble();

    double media = ( primeiraNota + segundaNota +
      terceiraNota + quartaNota) / 4 ;

    System.out.println( "A média das notas é " + media );

  }
}