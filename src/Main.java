import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String firstName = scn.nextLine();
        System.out.println("Please enter your last name : ");
        String lastName = scn.next();
        int not[]= new int[6];
        System.out.println("Enter your notes in order :");
        for(int i =0;i<not.length;i++){
            not[i]=scn.nextInt();
        }
        int average = averageCalculation(not);
        System.out.println(firstName +" "+ lastName +
                "\nyour grade point average : " + average  );

    }
    public static int averageCalculation(int[] a){
        int b =0;
        int c =0;
        for(int i = 0; i <a.length;i++){
            b+=a[i];
        }
        c = b/a.length;
        return c;
    }
}
