package MidOOP;

import java.io.File;
import java.util.Scanner;

public class Victor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tugas2();
        tugas4A();
        tugas4B();
    }
    
    public static void tugas2(){
        System.out.println("--------Welcome to echo program--------");
        System.out.println("---Type 'exit' without quote to exit---");
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(!exit){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Exit")) exit = true;
            else System.out.println(input);
        }
    }
    
    public static void tugas4A(){
        System.out.println("\n\n\n--------Welcome to split program--------");
        System.out.println("Please input the characters you want to split");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //String string = "!H1e2l3l4o@5w6o7r8l9d^";
        String strings[] = input.split("[a-zA-Z0-9]");
        String result = "";
        for(int i=0; i<strings.length; i++) result+=strings[i];
        System.out.println(result);
    }
    
    public static void tugas4B(){
        System.out.println("\n\n\n--------Welcome to count program--------");
        System.out.println("Please input file location you want to split with example format");
        System.out.println("Example : D:\\users\\File.java");
        Scanner scSys = new Scanner(System.in);
        String fileLocation = scSys.nextLine();
        
        int countLines = 0;
        int countWords = 0;

        try {
            File file = new File(fileLocation);
            
            Scanner sc1 = new Scanner(file);
            while(sc1.hasNextLine()) {
                sc1.nextLine();
                countLines++;
            }
            
            Scanner sc2 = new Scanner(file);
            while(sc2.hasNext()) {
                sc2.next();
                countWords++;
            }
            
            System.out.println("Total Number of Words: " + countWords);
            System.out.println("Total Number of Lines: " + countLines);
            
        } catch (Exception e) {
            System.out.println("File is not found");
        }
    }
}
