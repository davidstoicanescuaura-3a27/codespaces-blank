import java.io.*;
public class  es12 {
public static void main(String[] args) throws Exception {
BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
int x;
System.out.println(" dammi il valore di x");
 x=Integer.parseInt(input.readLine());
 if(x<0){
    System.out.println("numero negativo");}
    else{
        if(x==0){
            System.out.println("numero zero");}
            else{
                if(x%2==0){
                       System.out.println("numero pari");}
                       else{
                          System.out.println("numero dispari");}
                }
                  
            }
    }
 }
