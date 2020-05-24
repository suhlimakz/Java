import java.util.Scanner;

public class MaiorTresNumeros {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
    
    System.out.println( "\nMaior número entre três números" );
    System.out.println( "Informe três numeros" );
    int primeiroNumero = scan.nextInt();
    int segundoNumero = scan.nextInt();
    int terceiroNumero = scan.nextInt();

    if( primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero ) {
      System.out.println( primeiroNumero + " é o maior numero." );
    } else if ( segundoNumero > terceiroNumero ) {
      System.out.println( segundoNumero + " é o maior número." );
    } else {
      System.out.println( terceiroNumero + " é o maior número." );
    }
  }
}