import java.util.Scanner;

public class CalculoInteirosReal {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nDigite dois números inteiros, separando-os com espaço: " );
    int primeiroInteiro = scan.nextInt();
    int segundoInteiro = scan.nextInt();

    System.out.println( "\nDigite um numero real: " );
    double numeroReal = scan.nextDouble();

    int dobroPrimeiroInt = primeiroInteiro * 2;
    int metadeSegundoInt = segundoInteiro / 2;
    int produtoInteiros = dobroPrimeiroInt * metadeSegundoInt;

    int triploPrimeiroInt = primeiroInteiro * 3;
    Double intToDouble = Double.valueOf( triploPrimeiroInt );
    double somaPrimeiroTerceiro = intToDouble + numeroReal;

    double cuboNumeroReal = Math.pow( numeroReal, 3 ) ;

    System.out.println( "\na. Produto do dobro do primeiro com metade do segundo: "
      + produtoInteiros );

    System.out.println( "b. Soma do triplo do primeiro com o terceiro: "
      + somaPrimeiroTerceiro );

    System.out.println( "c. Terceiro elevado ao cubo: " + cuboNumeroReal );
  }
}
