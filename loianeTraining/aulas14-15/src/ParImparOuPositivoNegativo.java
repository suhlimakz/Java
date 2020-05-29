import java.util.Scanner;

public class ParImparOuPositivoNegativo {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme dois números:" );
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    System.out.println( "\nQual operação deseja realizar? \n" + 
    "Digite 1: para verificar se os números são par ou impar" +
    "\nDigite 2: para verificar se os números são positivo ou negativo"  );
    int opcao = scan.nextInt();

    switch ( opcao ) {
      case 1: System.out.println( "\n Opção 1. par ou impar:" );
        if( ( num1 % 2 ) == 0 && ( num2 % 2 ) == 0  ) {
          System.out.println( num1 + " e " + num2 + " são pares " );
        } else if( ( num1 % 2 ) != 0 && ( num2 % 2 ) != 0 ) {
          System.out.println( num1 + " e " + num2 + " são impares " );
        } else if( ( num1 % 2 ) == 0 && ( num2 % 2 ) != 0 ) {
          System.out.println( num1 + " é par " + " e " + num2 + " é impar " );
        } else if( ( num1 % 2 ) != 0 && ( num2 % 2 ) == 0 ) {
          System.out.println( num1 + " é impar " + " e " + num2 + " é par " );
        }
        break;
      
      case 2: System.out.println( "\nOpção 2. positivo ou negativo:" );
        if( ( num1 < 0 ) && ( num2 < 0 ) ) {
          System.out.println( num1 + " e " + num2 + " são negativos " );
        } else if( ( num1 > 0 ) && ( num2 > 0 ) ) {
          System.out.println( num1 + " e " + num2 + " são positivos " );
        } else if( ( num1 < 0 ) && ( num2 > 0 ) ) {
          System.out.println( num1 + " é negativo " + " e " + num2 + " é positivo " );
        } else if( ( num1 > 0 ) && ( num2 < 0 ) ) {
          System.out.println( num1 + " é positivo " + " e " + num2 + " é negativo " );
        } 
        break;
    
      default: System.out.println( "\nOpção inválida." );
        break;
    }
        
  }
   
}