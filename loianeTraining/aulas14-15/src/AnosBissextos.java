import java.util.Scanner;

public class AnosBissextos {
  public static void main(String[] args) {
    Scanner scan  = new Scanner( System.in );

    System.out.println( "\nInforme um ano: " );
    int ano = scan.nextInt();
  
    if( (ano % 4) == 0 && ( ano % 100 ) != 0 ) {
      System.out.println( ano + " é um ano bissexto." );
    } else if(( ano % 400 ) == 0 ) {
      System.out.println( ano + " é um ano bissexto." );
    } else {
      System.out.println( ano + " não é um ano bissexto." );
    }
  }
}
