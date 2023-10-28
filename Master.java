import java.io.*;
public class Master{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Geben Sie die Zahl 3 ein:");
        String eingabe = br.readLine();
        int zahl = Integer.parseInt (eingabe);

        if (zahl == 3){
            System.out.println("Die Eingabe ist richtig!");
        }
        

        

        
        
        /*boolean bedingung = true;

        if (bedingung){
            System.out.println("Bedigung 1 erfüllt.");
        }

        bedingung = false;
        if(bedingung){
            System.out.println("Bedingung 2 erfüllt.");
        }
        */
    }
}