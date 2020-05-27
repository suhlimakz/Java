import java.util.Scanner;

public class NotasConceito {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nInforme as notas do aluno:" );
    float primeiraNota = scan.nextFloat();
    float segundaNota = scan.nextFloat();

    float mediaNotas = ( primeiraNota + segundaNota ) / 2;

    if( mediaNotas >= 9.0 ) {
      System.out.println( "\n1º nota: " + primeiraNota + "\n" +
        "2º nota: " + segundaNota );
      System.out.println( "Média: " + mediaNotas );
      System.out.println( "Conceito: A" );
      System.out.println( "Situação: Aprovado" );

    } else if( mediaNotas >= 7.5 && mediaNotas < 9.0 ) {
      System.out.println( "\n1º nota: " + primeiraNota + "\n" +
      "2º nota: " + segundaNota );
      System.out.println( "Média: " + mediaNotas );
      System.out.println( "Conceito: B" );
      System.out.println( "Situação: Aprovado" );

    } else if( mediaNotas >= 6.0 && mediaNotas < 7.5 ) {
      System.out.println( "\n1º nota: " + primeiraNota + "\n" +
        "2º nota: " + segundaNota );
      System.out.println( "Média: " + mediaNotas );
      System.out.println( "Conceito: C" );
      System.out.println( "Situação: Aprovado" );

    } else if( mediaNotas >= 4.0 && mediaNotas < 6.0 ) {
      System.out.println( "\n1º nota: " + primeiraNota + "\n" +
      "2º nota: " + segundaNota );
      System.out.println( "Média: " + mediaNotas );
      System.out.println( "Conceito: D" );
      System.out.println( "Situação: Reprovado" );

    } else if( mediaNotas < 4.0 || mediaNotas == 0 ) {
      System.out.println( "\n1º nota: " + primeiraNota + "\n" +
        "2º nota: " + segundaNota );
      System.out.println( "Média: " + mediaNotas );
      System.out.println( "Conceito: E" );
      System.out.println( "Situação: Reprovado" );
    } 
  }
}