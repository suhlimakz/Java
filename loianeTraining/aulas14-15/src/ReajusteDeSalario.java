import java.util.Scanner;

public class ReajusteDeSalario {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "Informe o salário atual do colaborador" );
    double salarioAtual = scan.nextDouble();
    
    if( salarioAtual <= 280 ) {
      double percentAumento = 20.0 / 100.0;
      double aumento = salarioAtual * percentAumento;
      double salarioReajuste = salarioAtual + aumento;

      System.out.println( "\nSalário atual: R$ " + salarioAtual );
      System.out.println( "Percentual de aumento aplicado :" + ( percentAumento * 100 )  + "%" );
      System.out.println( "Valor aumento: R$ " + aumento );
      System.out.println( "Novo salário: R$ " + salarioReajuste );
    
    } else if( salarioAtual > 280 && salarioAtual <= 700 ) {
      double percentAumento = 15.0 / 100.0;
      double aumento = salarioAtual * percentAumento;
      double salarioReajuste = salarioAtual + aumento;      
      
      System.out.println( "\nSalário atual: R$ " + salarioAtual );
      System.out.println( "Percentual de aumento aplicado :" + 
        ( percentAumento * 100 ) + "%" );
      System.out.println( "Valor aumento: R$ " + aumento );
      System.out.println( "Novo salário: R$ " + salarioReajuste );
      
    } else if( salarioAtual > 700 && salarioAtual < 1500 ) {
      double percentAumento = 10.0 / 100.0;
      double aumento = salarioAtual * percentAumento;
      double salarioReajuste = salarioAtual + aumento;      
      
      System.out.println( "\nSalário atual: R$ " + salarioAtual );
      System.out.println( "Percentual de aumento aplicado :" + 
        ( percentAumento * 100 ) + "%" );
      System.out.println( "Valor aumento: R$ " + aumento );
      System.out.println( "Novo salário: R$ " + salarioReajuste );
      
    } else if( salarioAtual >= 1500 ) {
      double percentAumento = 5.0 / 100.0;
      double aumento = salarioAtual * percentAumento;
      double salarioReajuste = salarioAtual + aumento;      
      
      System.out.println( "\nSalário atual: R$ " + salarioAtual );
      System.out.println( "Percentual de aumento aplicado :" + 
        ( percentAumento * 100 ) + "%" );
      System.out.println( "Valor aumento: R$ " + aumento );
      System.out.println( "Novo salário: R$ " + salarioReajuste );
    }
  }
}