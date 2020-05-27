import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme três números:" );
    int ladoA = scan.nextInt();
    int ladoB = scan.nextInt();
    int ladoC = scan.nextInt();
  
    int somaAB = ladoA + ladoB;
    int somaAC = ladoA + ladoC;
    int somaBC = ladoB + ladoC;
  
    if( somaAB > ladoC || somaAC > ladoB || somaBC > ladoA  ) {
      System.out.println( "\nPode ser um triângulo." );
      if( ladoA == ladoB && ladoA == ladoC && ladoB == ladoC ) {
        System.out.println( "Triângulo equilátero" );
      } else if( ladoA == ladoB || ladoA == ladoC || ladoB == ladoC ) {
        System.out.println( "Triângulo isósceles" );
      } else if( ladoA != ladoB && ladoA != ladoC && ladoB != ladoC ) {
        System.out.println( "Triângulo escaleno" );
      }
    }
  }
}