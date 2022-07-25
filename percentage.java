import java.util.Scanner;

public class percentage {

    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1");
        int a = sc.nextInt();
        System.out.println("Enter Subject 2");
        int b = sc.nextInt();
        System.out.println("Enter Subject 3");
        int c = sc.nextInt();
        System.out.println("Enter Subject 4");
        int d = sc.nextInt();
        System.out.println("Enter Subject 5");
        int e = sc.nextInt();
        float percentage = ((a+b+c+d+e)/500.0f)*100;
        System.out.println("The percentage is ");
        System.out.println(percentage);

    }
        
    }
        

    