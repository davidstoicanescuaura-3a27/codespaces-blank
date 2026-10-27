import java.io.*;
public class  es11 {
public static void main(String[] args) throws Exception {
BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
int batteria;
System.out.println(" dammi la percentuale di batteria");
 batteria=Integer.parseInt(input.readLine());
if(batteria<0||batteria>100){
System.out.println("percentuale non valida");}
else{
    if(batteria<=10||batteria ==30){
        System.out.println("batteria bassa");}
else{
    if(batteria>30){
        System.out.println("batteria sufficente");}
    }
}
    }
}

