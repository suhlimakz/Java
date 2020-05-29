import java.util.Scanner;


public class PostoDeGasolina {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    double descontoAlcool3 = 3.0 / 100.0; 
    double descontoAlcool5 = 5.0 / 100.0; 
    double descontoGasolina4 = 4.0 / 100.0; 
    double descontoGasolina6 = 6.0 / 100.0; 

    double precoAlcool = 1.90;
    double precoGasolina = 2.50;

    // System.out.println( descontoAlcool3 );
    
    System.out.println( "\nEscolha um tipo de combustível: " +
    "\nA - álcool ou G - gasolina" );
    String tipoCombustivel = scan.next();

    switch ( tipoCombustivel ) {
      case "A" : System.out.println( "\nQuantos litros deseja abastecer ?" );
        double litrosAlcool = scan.nextDouble();

        if( litrosAlcool <= 20 ) {
          double precoDesconto = precoAlcool - descontoAlcool3;
          double precoFinal = precoDesconto * litrosAlcool;
          
          System.out.println( "\nÁlcool: R$ " + precoFinal );

        } else if( litrosAlcool > 20 ) {
          double precoDesconto = precoAlcool - descontoAlcool5;
          double precoFinal = precoDesconto * litrosAlcool;

          System.out.println( "\nÁlcool: R$ " + precoFinal );
        }
        break;

      case "B" : System.out.println( "\nQuantos litros deseja abastecer ?" );
        double litrosGasolina = scan.nextDouble();

        if( litrosGasolina <= 20 ) {
          double precoDesconto = precoGasolina - descontoGasolina4;
          double precoFinal = precoDesconto * litrosGasolina;
          System.out.println( "\nGasolina: R$ " + precoFinal );
        } else if( litrosGasolina > 20 ) {
          double precoDesconto = precoGasolina - descontoGasolina6;
          double precoFinal = precoDesconto * litrosGasolina;
          System.out.println( "\nGasolina: R$ " + precoFinal );
        }
        break;
    
      default: System.out.println( "\nValor inválido." );
        break;
    }
  }  
}