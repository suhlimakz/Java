import java.util.Scanner;

public class MediaAluno {
 public static void main(String[] args) {
  Scanner scan = new Scanner( System.in );

  System.out.println( "\nMédia e situação do aluno" );
  System.out.println( "\nInforme as notas do aluno" );
  
  System.out.println( "\nPrimeira nota:" );
  int primeiraNota = scan.nextInt();

  System.out.println( "Segunda nota:" );
  int segundaNota = scan.nextInt();

  int mediaAluno = (primeiraNota + segundaNota) / 2;

  if( mediaAluno == 10 ) {
    System.out.println( "Aprovado com Distinção" );
  } else if( mediaAluno >= 7 ) {
    System.out.println( "Aprovado" );
  } else if( mediaAluno < 7 ) {
    System.out.println( "Reprovado" );
  }
 }
}