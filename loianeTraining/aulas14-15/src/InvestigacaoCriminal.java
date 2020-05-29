import java.util.Scanner;

public class InvestigacaoCriminal {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    int respostasSim = 0;
    int respostasNao = 0;

    System.out.println( "\nDigite 1 para sim e 2 para não" );
    
    System.out.println( "\na. Telefonou para vítima? " );
    int respostaA = scan.nextInt();
    switch( respostaA ) {
      case 1: respostasSim++;
        break;
      case 2: respostasNao++;
        break;
      default: System.out.println( "Opção inválida." );
        break;
    }

    System.out.println( "\nb. Esteve no local do crime? " );
    int respostaB = scan.nextInt();
    switch( respostaB ) {
      case 1: respostasSim++;
        break;
      case 2: respostasNao++;
        break;
      default: System.out.println( "Opção inválida." );
        break;
    }

    System.out.println( "\nc. Mora perto da vítima? " );
    int respostaC = scan.nextInt();
    switch( respostaC ) {
      case 1: respostasSim++;
        break;
      case 2: respostasNao++;
        break;
      default: System.out.println( "Opção inválida." );
        break;
    
      }
    System.out.println( "\nd. Devia para vítima? " );
    int respostaD = scan.nextInt();
    switch( respostaD ) {
      case 1: respostasSim++;
        break;
      case 2: respostasNao++;
        break;
      default: System.out.println( "Opção inválida." );
        break;
    }

    System.out.println( "\ne. Já trablhou com a vítima? " );
    int respostaE = scan.nextInt();
    switch( respostaE ) {
      case 1: respostasSim++;
        break;
      case 2: respostasNao++;
        break;
      default: System.out.println( "Opção inválida." );
        break;
    }

    if( respostasSim == 2 ) {
      System.out.println( "\nSuspeito" );
    } else if( ( respostasSim >=  3 ) && ( respostasSim <= 4 ) ) {
      System.out.println( "\nCúmplice" );
    } else if( respostasSim == 5 ) {
      System.out.println( "\nAssassino" );
    } else {
      System.out.println( "\nInocente" );
    }
  }
}