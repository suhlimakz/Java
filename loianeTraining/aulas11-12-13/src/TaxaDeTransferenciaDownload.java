import java.util.Scanner;

public class TaxaDeTransferenciaDownload {
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );

    System.out.println( "\nQual o tamanho do arquivo pra download(em MB) ?" );
    double arquivoMb = scan.nextDouble();

    System.out.println( "\nQual a velocidade do link de internet(em Mbps) ?" );
    double conexaoMb= scan.nextDouble();

    double tempoDownloadSeg = arquivoMb / ( conexaoMb / 8);
    double tempoDownloadMin = tempoDownloadSeg / 60;

    System.out.println( "\nSeu arquivo será baixado em aproximandamente "
       + tempoDownloadMin + " minutos."  );
  }
}
