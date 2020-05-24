import java.util.Scanner;

public class SalarioMes {
 public static void main( String[] args ) {
  Scanner scan = new Scanner( System.in );

  System.out.println( "\nInforme seu salário por hora" );
  double salarioHora = scan.nextDouble();

  System.out.println( "\nInforme seu quantas horas você trabalhou no ultimo mês" );
  double horasTrabalhadas = scan.nextDouble();

  double salarioMes = salarioHora * horasTrabalhadas;

  System.out.println( "\nSeu salário será de R$ " + salarioMes +" .\n" );
 }
}
