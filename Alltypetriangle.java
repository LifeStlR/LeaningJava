import java.util.*;
public class Alltypetriangle
{
    public static void leftTriangle()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++)
        {
            for (int i = rows; i > x; i--)
                System.out.print(" ");
            for (int j = 1; j <= x; j++)
                System.out.print("*");
            System.out.println();
            
        }
    }
    public static void centerTriangle()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
    public static void allShape()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();

        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    System.out.println(" ");

        for (int x = 1; x <= rows; x++)
        {
            for (int i = rows; i > x; i--)
                System.out.print(" ");
            for (int j = 1; j <= x; j++)
                System.out.print("*");
            System.out.println();
        }
    System.out.println(" ");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    System.out.println(" ");
    }
    public static void main (String args [])
    {
        boolean exit = false;
        while(!exit){
            Scanner input = new Scanner (System.in);
            System.out.println("Types of Triangles");
            System.out.println("\t1. Left");
            System.out.println("\t2. Right");
            System.out.println("\t3. Center");
            System.out.println("\t4. All Shape");
            System.out.println("\t5. Exit");
            System.out.print("Enter a number: ");
            int menu = input.nextInt();
            if (menu == 1)
                leftTriangle();
            if (menu == 2)
                rightTriangle();
            if (menu == 3)
                centerTriangle();
            if (menu == 4)
                allShape();
            if (menu == 5){
                System.out.println("\tHave a good Day :D");
                exit = true;
            }
        }
    }    
}