import java.io.*;
public class esercizio1terraneo{
 public static void main(String[] args) throws Exception {
BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
int saldo, prelievo, totale;
saldo=500;
System.out.println("quanto vuoi prelevare?");
prelievo=Integer.parseInt(input.readLine());
if (prelievo<=0) {
    System.out.println("inporto non valido e il saldo è questo -->" + saldo);
}
    else {
totale = saldo- prelievo;
System.out.println("il saldo ora è " + totale);
    }
}
}