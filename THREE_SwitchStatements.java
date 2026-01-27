import java.util.Scanner;

public class THREE_SwitchStatements {
    public  static  void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num1 = input.nextInt();
         int num2 = input.nextInt();

        System.out.println("Press 1 for Add");
        System.out.println("Press 2 for Subtract");
        System.out.println("Press 3 for Multiply");
        System.out.println("Press 4 for Divide");
        int c = input.nextInt();
        switch(c){
            case 1:
                System.out.println("Answer is:" + (num1 + num2));
                break;
            case 2:
                System.out.println("Answer is:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Answer is:" + (num1 * num2));
                break;
            case 4:
                System.out.println("Answer is:" + (num1 / num2));
                break;
            default:
                System.out.println("Error");
                break;

        }



    }
}
