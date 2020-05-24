import java.util.Scanner;

public class MasculinoFeminino {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nSexo masculino ou feminino" );
    System.out.println( "\nDigite F para feminino ou M para masculino" );
    String sexo = scan.next();
    
    if( sexo.trim().equals("F") || sexo.trim().equals("f")) {
      System.out.println( "\nSexo feminino" );
    } else if( sexo.trim().equals("M") || sexo.trim().equals("m") ) {
      System.out.println( "\nSexo masculino" );
    } else {
      System.out.println( "\nSexo inválido" );
    }



    
  }
}