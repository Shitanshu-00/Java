package day10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Salary_Buffer {
    public static void main(String[] args) throws IOException{
        double bs, da, ta, hra, gs;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter Base Salary ");
        bs= Double.parseDouble(br.readLine());
        da=(bs*5)/100;
        ta=(bs*10)/100;
        hra=(bs*15)/100;
        gs= bs+ta+da+hra;
        System.out.println("Gross Salary is  "+gs);


    }
}

