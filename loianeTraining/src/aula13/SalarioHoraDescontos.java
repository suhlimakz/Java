package loianeTraining.src.aula13;

import java.util.Scanner;

public class SalarioHoraDescontos {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme o valor da sua hora de trabalho" +
    " quantas horas você trabalhou no ultimo mês (separe os valores com espaço)" );

    double valorHora = scan.nextDouble();
    double horasTrabalhadas = scan.nextDouble();

    double salarioBruto = valorHora * horasTrabalhadas;

    double inss = ( salarioBruto / 100) * 8;
    double sindicato = ( ( salarioBruto * 5 ) / 100 );
    double impostoDeRenda = salarioBruto * 0.11;
    double totalDescontos = inss + sindicato + impostoDeRenda;

    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println( "\nSeu salário bruto será de R$ " + salarioBruto );
    System.out.println( "Desconto INSS(8%): R$ " + inss );
    System.out.println( "Desconto Sindicato(5%): R$ " + sindicato );
    System.out.println( "Desconto Imposto de Renda(11%): R$ " + impostoDeRenda );
    System.out.println( "Total de descontos: R$ " + totalDescontos );
    System.out.println( "Seu salário  liquido é de R$ " + salarioLiquido );

  }
}
