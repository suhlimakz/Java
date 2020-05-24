import java.util.Scanner;

public class MaiorDoisNumeros {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nMaior número" );
    System.out.println( "\nInforme os números para comparação" );
    int primeiroNumero = scan.nextInt();
    int segundoNumero = scan.nextInt();
 
    System.out.println( "\nO maior número é:" );
    if( primeiroNumero > segundoNumero ) {
      System.out.println( primeiroNumero );
    } else {
      System.out.println( segundoNumero );
    }
  }
}
