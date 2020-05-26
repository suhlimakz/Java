import java.util.Scanner;

public class TurnoSaudacao {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "Informe o turno em que estuda:" + 
    "\nM - matutino" + "\nV - vespertino" + "\nN - noturno." );
    String turno = scan.next();

    switch( turno ) {
      case "M" : System.out.println( "Bom dia!" );
        break;
      case "V" : System.out.println( "Boa tarde!" );
        break;
      case "N" : System.out.println( "Boa Noite!" );
        break;
    
      default: System.out.println( "\n'" + turno + "'" + "\nNão é um turno válido!" + 
       "\nInforme M para matutino, V para vespertino e N para noturno."  );
        break;
    }
  }
}