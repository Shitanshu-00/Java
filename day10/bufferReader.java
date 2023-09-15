package day10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter your name");
        String sc= br.readLine();
        System.out.println("Welcome Mr. "+sc);
    }
}


