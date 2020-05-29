import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme um número inteiro: " );
    int numero = scan.nextInt();
    
    if( (numero % 2) == 0 ) {
      System.out.println( numero + " é par " );
    } else {
      System.out.println( numero + " é impar "  );
    }
  }
}