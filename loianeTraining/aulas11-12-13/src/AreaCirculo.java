import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println( "\nCálculo da área de um círculo \n " );
    System.out.println( "Informe o raio do círculo (cm): " );
    double raio = scan.nextDouble();
    
    double pi = 3.14;
    double area = pi * (raio * raio);
    
    System.out.println( "\nA área do círculo é: " + area + " cm2. \n" );


  }
}