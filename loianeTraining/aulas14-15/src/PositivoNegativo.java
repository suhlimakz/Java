import java.util.Scanner;

public class PositivoNegativo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println( "\nNúmero negativo ou positivo" );
    System.out.println( "\nInsira um número" );
    int numero = scan.nextInt();

    if( numero < 0 ){
      System.out.println( "\nO número " + numero + " é negativo." );
    } else {
      System.out.println( "\nO número " + numero + " é positivo." );
    }

  }
}