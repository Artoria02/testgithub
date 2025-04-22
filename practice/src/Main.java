import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String d;
            int i = 0;
            String n;
            System.out.println("Please input the keyword to search:");
            Scanner input = new Scanner(System.in);
            n = input.nextLine();
            chMatch match = new chMatch();
            while((d = br.readLine())!=null){
                if(match.bfMatchword(d,n)){
                    System.out.println("d"+(i+1)+".txt");
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}