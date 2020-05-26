import java.util.Scanner;

public class FolhaDePagamento {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme o valor da sua hora:" );
    float valorHora = scan.nextFloat();

    System.out.println( "\nInforme a quantidade de horas trabalhadas:" );
    int horasTrabalhadas = scan.nextInt();

    float salarioBruto = valorHora * horasTrabalhadas;
    double perctIR0 = 0; 
    double perctIR1 =  5.0 / 100.0; 
    double perctIR2 =  10.0 / 100.0; 
    double perctIR3 =  20.0 / 100.0; 
    double perctINSS = 10.0 / 100.0;
    double perctFGTS = 11.0 / 100.0;
    double perctSindicato = 3.0 / 100.0;

    if( salarioBruto <= 900 ) {
      double descontoIR = salarioBruto * perctIR0;
      double descontoINSS = salarioBruto * perctIR0;
      double descontoFGTS = salarioBruto * perctIR0;
      double descontoSindicato = salarioBruto * perctIR0;
      double totalDeDescontos = descontoIR + descontoINSS + descontoFGTS + descontoSindicato;
      double salarioLiquido = salarioBruto - totalDeDescontos;

      System.out.println( "\nSalário bruto: " + "( " + valorHora + " * " + horasTrabalhadas +
       " )" + "  : R$ " + salarioBruto);
      System.out.println( "(-) IR " + "(" + " isento " + ")" + "  : R$ " + descontoIR );
      System.out.println( "(-) INSS " + "( " + perctINSS + " % )" + "  : R$ " + descontoINSS );
      System.out.println( "(-) FGTS " + "( " + perctFGTS + " % )" + "  : R$ " + descontoFGTS );
      System.out.println( "(-) Sindicato " + "( " + perctSindicato + " % )" + "  : R$ " + descontoSindicato );
      System.out.println( "Total de descontos" + "  : R$ " + totalDeDescontos );
      System.out.println( "Salário líquido " + "  : R$ " + salarioLiquido + "\n");
      
     } else if( salarioBruto > 900 && salarioBruto <= 1500 ) {
        double descontoIR = salarioBruto * perctIR1;
        double descontoINSS = salarioBruto * perctINSS;
        double descontoFGTS = salarioBruto * perctFGTS;
        double descontoSindicato = salarioBruto * perctSindicato;
        double totalDeDescontos = descontoIR + descontoINSS + descontoFGTS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println( "\nSalário bruto: " + "( " + valorHora + " * " + horasTrabalhadas +
        " )" + "  : R$ " + salarioBruto);
        System.out.println( "(-) IR " + "( " + perctIR1 + " )" + "  : R$ " + descontoIR );
        System.out.println( "(-) INSS " + "( " + perctINSS + " % )" + "  : R$ " + descontoINSS );
        System.out.println( "(-) FGTS " + "( " + perctFGTS + " % )" + "  : R$ " + descontoFGTS );
        System.out.println( "(-) Sindicato " + "( " + perctSindicato + " % )" + "  : R$ " + descontoSindicato );
        System.out.println( "Total de descontos" + "  : R$ " + totalDeDescontos );
        System.out.println( "Salário líquido " + "  : R$ " + salarioLiquido + "\n");

    } else if( salarioBruto > 1500 && salarioBruto <= 2500 ) {
        double descontoIR = salarioBruto * perctIR2;
        double descontoINSS = salarioBruto * perctINSS;
        double descontoFGTS = salarioBruto * perctFGTS;
        double descontoSindicato = salarioBruto * perctSindicato;
        double totalDeDescontos = descontoIR + descontoINSS + descontoFGTS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println( "\nSalário bruto: " + "( " + valorHora + " * " + horasTrabalhadas +
        " )" + "  : R$ " + salarioBruto);
        System.out.println( "(-) IR " + "( " + perctIR2 + " )" + "  : R$ " + descontoIR );
        System.out.println( "(-) INSS " + "( " + perctINSS + " % )" + "  : R$ " + descontoINSS );
        System.out.println( "(-) FGTS " + "( " + perctFGTS + " % )" + "  : R$ " + descontoFGTS );
        System.out.println( "(-) Sindicato " + "( " + perctSindicato + " % )" + "  : R$ " + descontoSindicato );
        System.out.println( "Total de descontos" + "  : R$ " + totalDeDescontos ); 
        System.out.println( "Salário líquido " + "  : R$ " + salarioLiquido + "\n");

    } else if( salarioBruto < 2500 ) {
        double descontoIR = salarioBruto * perctIR3;
        double descontoINSS = salarioBruto * perctINSS;
        double descontoFGTS = salarioBruto * perctFGTS;
        double descontoSindicato = salarioBruto * perctSindicato;
        double totalDeDescontos = descontoIR + descontoINSS + descontoFGTS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println( "\nSalário bruto: " + "( " + valorHora + " * " + horasTrabalhadas +
        " )" + "  : R$ " + salarioBruto);
        System.out.println( "(-) IR " + "( " + perctIR3 + " )" + "  : R$ " + descontoIR );
        System.out.println( "(-) INSS " + "( " + perctINSS + " % )" + "  : R$ " + descontoINSS );
        System.out.println( "(-) FGTS " + "( " + perctFGTS + " % )" + "  : R$ " + descontoFGTS );
        System.out.println( "(-) Sindicato " + "( " + perctSindicato + " % )" + "  : R$ " + descontoSindicato );
        System.out.println( "Total de descontos" + "  : R$ " + totalDeDescontos ); 
        System.out.println( "Salário líquido " + "  : R$ " + salarioLiquido + "\n");
    }
  }
}