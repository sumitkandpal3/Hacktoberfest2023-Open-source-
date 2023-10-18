import java.util.Scanner;
class swap_two_nums {

    public static void main(String[] args) {
        // variable declaration
        int num1, num2, sum;

        // taking number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number--> ");
        num1 = sc.nextInt();
        System.out.println("Enter second number--> ");
        num2 = sc.nextInt();

        //Swapping logic
        sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num2;

        // checking whether number is really swapped or not
        System.out.println("First number after swapping: "+num1);
        System.out.println("Second number after swapping: "+num2);

    }
}