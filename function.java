import java.util.Scanner;

public class function {
    
    public static void main(String[] args){
              
        starpramid();
        calculator();
    }
    public static void starpramid(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
            int rows = input.nextInt();

            for(int i =0; i < rows;i++){
                for(int j = 0; j < i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    public static void calculator(){
        Scanner cal = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("enetr you choice 1 = +, 2 = -, 3 = *, 4 = / 5 = %");
        int choice = cal.nextInt(); 

        switch(choice){
            case 1:
                    System.out.println("enter two number");
                    float num1 = cal.nextFloat();
                    float num2 = cal.nextFloat();

                    System.out.println("sum of to num is"+(num1 + num2));
                    break;
             case 2:
                    System.out.println("enetr two number");
                    num1 = cal.nextFloat();
                    num2 = cal.nextFloat();

                    System.out.println("minus of two num is"+ (num1 - num2));
                    break;
            case 3:
                          System.out.println("enetr two number");
                    num1 = cal.nextFloat();
                    num2 = cal.nextFloat();

                    System.out.println("multiply of two num is"+ (num1 * num2));
                        break;

            case 4:
                  System.out.println("enetr two number");
                    num1 = cal.nextFloat();
                    num2 = cal.nextFloat();

                    if(num1 != 0){
                        System.out.println("division is "+ (num1 / num2));
                    }
                    else {
                            System.out.println("division is not possible");
                    }
                        break;
            case 5:
                  System.out.println("enetr two number");
                    num1 = cal.nextFloat();
                    num2 = cal.nextFloat();

                    if(num1 != 0){ 
                                System.out.println("modulud is" + (num1 % num2));
                    }
                    else{
                        System.out.println("division is not possible");
                    }
                        break;
        }
    }
    
}
