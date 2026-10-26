import java.io.*;
public class esercizio2 {
 public static void main(String[] args) throws Exception {
BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
int età;
System.out.println ("dammi un' età");
età= Integer.parseInt(input.readLine());
if (età>=18){
System.out.println("maggiorenne e ha anni:"+età);
}
else{
    System.out.println("minorenne e ha anni:"+età);
}}}