package task2012;


import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {

        Scanner in =new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberoftasks = in.nextInt();

        int difference = 12 - numberoftasks;

        int time = difference * 45;


        String result = time <=240 ? "YES" : "NO";

        out.println(result);
        out.flush();
            }
        }
