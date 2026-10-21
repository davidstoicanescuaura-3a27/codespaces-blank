import java.io.*;
public class Esercizio2{
public static void main(String[] args) throws Exception {
BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
int x;
System.out.println("dammi un numero");
x=Integer.parseInt(input.readLine());
if (x>0) {
System.out.println("positivo"); }
else{
    System.out.println("negativo");
}
}
}