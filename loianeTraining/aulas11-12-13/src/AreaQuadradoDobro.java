import java.util.Scanner;

public class AreaQuadradoDobro {
  public static void main( String[] args ) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nCálculo da área de um quadrado \n " );
    System.out.println( "Informe o valor dos lados do quadrado (cm): " );
    double lado = scan.nextDouble();

    double area = lado * lado;
    double areaDobro = area * 2;

    System.out.println( "\nA área do quadrado é: " + area + " cm2. \n" );
    System.out.println( "O dobro da área desse quadrado é: " + areaDobro + " cm2. \n" );
  }
}
