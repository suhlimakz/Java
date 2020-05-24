import java.util.Scanner;

public class MetroCentimetros {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println( "\nConversão de metros para centímetros \n" );
    System.out.println( "Insira um número para ser convertido de cm para m" );
    double centimetros = scan.nextDouble();

    double conversao = centimetros / 100;

    System.out.println( "\n"+ centimetros + " centímetro(s) " + "é(são) " 
       + conversao + " metro(s). \n");
  }
}