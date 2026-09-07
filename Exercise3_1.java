import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the cooresponding marks");
        int maths;
        int digitalInno;
        int computerLiteracy;
        while (true){
            System.out.print("Maths : ");
            maths = input.nextInt();
            if(maths >= 00 && maths<=100){
            break;}
            System.out.println("Invalid mark. Try again");
        }

        while (true){
            System.out.print("Digital Innovation : ");
            digitalInno = input.nextInt();
            if(digitalInno >= 00 && digitalInno <=100){
            break;}
            System.out.println("Invalid mark. Try again");
        }

        while (true){
            System.out.print("Computer Literacy : ");
            computerLiteracy = input.nextInt();
            if(computerLiteracy >= 00 && computerLiteracy<=100){
            break;}
            System.out.println("Invalid mark. Try again");
        }

        input.close();
        

    }
}
