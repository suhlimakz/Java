import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class EquacaoSegundoGrau {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme um valor para 'a':" );
    double a = scan.nextInt();

    if( a != 0 ) {
      System.out.println( "\nInforme um valor para 'b':" );
      double b = scan.nextInt();

      System.out.println( "\nInforme um valor para 'c':" );
      double c = scan.nextInt();

      System.out.println( "\nEquação delta:" );
      double delta = Math.pow( b, 2 ) - 4 * a * c;

      if( delta < 0  ) {
        System.out.println( "A equação não possui raízes reais." );
        
      } else if( delta == 0 ) {
        double raizDelta0 = (( -( b ) ) + Math.sqrt( delta )) / (2 * a ); 
        
        System.out.println( "A raiz da equação é :" + raizDelta0 );
        
      } else if( delta > 0 ) {
        double raizPositva = (( - ( b ) ) + Math.sqrt( delta )) / (2 * a ); 
        double raizNegativa = (( -( b ) ) - Math.sqrt( delta )) / (2 * a ); 
        
        System.out.println( "A raiz ( x' ) da equação é :" + raizPositva );
        System.out.println( "A raiz ( x'' ) da equação é :" + raizNegativa );
      }
    }
  }
}