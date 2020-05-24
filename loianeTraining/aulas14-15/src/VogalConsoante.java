import java.util.Scanner;

public class VogalConsoante {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
  
    System.out.println( "\nVogal ou consoante" );
    System.out.println( "Informe uma letra" );
    
    
    String letra = scan.next();
    
    switch(letra) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
      case "A":
      case "E":
      case "I":
      case "O":
      case "U": System.out.println( "A letra é uma vogal." ); break;
      default: System.out.println( "A letra é uma consoante." );
    }

  }
}