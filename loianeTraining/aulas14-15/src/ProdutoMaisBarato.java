import java.util.Scanner;

public class ProdutoMaisBarato {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme o valor da banana:" );
    int precoBanana = scan.nextInt();
    
    System.out.println( "\nInforme o valor da laranja:" );
    int precoLaranja = scan.nextInt();
    
    System.out.println( "\nInforme o valor da morango:" );
    int precoMorango = scan.nextInt();
    
    if( precoBanana < precoLaranja && precoBanana < precoMorango ) {
      System.out.println( "\nCompre somente a banana!" );
    } else if( precoLaranja < precoMorango ) {
        System.out.println( "\nCompre somente a laranja!" );
      } else {
      System.out.println( "\nCompre somente o morango!" );
    }
  }
}