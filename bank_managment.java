import java.util.Scanner;

class bank {
    String name;
    double balance;
    long acc_no;
}


public class bank_managment {
       static bank[] bank = new bank[100];
       static int count = 0;
    public static void main(String[] args){
        int choice;
            Scanner s = new Scanner(System.in);
            do{
                System.out.println("choice 1 : addnew bak coustumer");
System.out.println("choice 2 : see the bank coustume");
System.out.println("choice 3 : view detail");
System.out.println("choice 4 delete detail");
System.out.println("choice 5 exit;");

System.out.println("enter youe choice");
 choice = s.nextInt();


switch(choice){
   
    case 1:
        addnewcoustumer();
        break;
       
        case 2:
            seebankcoustumer();
            break;
            case 3:
                viewdetail();
                break;

                case 4:
                    deletecoustumer();
                    break;
                    
                    case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");

}
 }while(choice != 5);
    }
  static void addnewcoustumer(){
    Scanner s = new Scanner(System.in);
    if(count >= bank.length){
        System.out.println("storage is full");

    }
    bank b = new bank();

    System.out.println("add coustumer name");
     b.name = s.nextLine();

    System.out.println("enetr amount");
     b.balance = s.nextInt();

    System.out.println("enter bank acc no");
     b.acc_no = s.nextLong();

    bank[count] = b;
    count++;
                System.out.println("new bank coustumer added");
    }
   static void seebankcoustumer(){
if(count == 0){
    System.out.println("no data available");
    return;
}
for(int i = 0; i < count; i++){
    System.out.println("name"+(bank[i].name)+
"balance"+(bank[i].balance)+
"acc no"+(bank[i].acc_no));

}
    }
    static void viewdetail(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enetr acc no");
        long acc = scan.nextLong();

        for(int i = 0; i < count ; i++){
            if(bank[i].acc_no == acc){
                System.out.println("name"+(bank[i].name)+
                "balance"+(bank[i].balance));
            }else {
                 System.out.println("no record found");
            }
           
        }
        
    }
    static void deletecoustumer(){
            Scanner s = new Scanner(System.in);
            System.out.println("enter acc no");
            long acc = s.nextLong();

            for(int i = 0; i < count; i++){
                if(bank[i].acc_no == acc){
                    for(int j = i;j < count - 1; j++){
                       bank[j] = bank[j + 1];     
                    }
                    bank[count - 1] = null;
                    count--;
                }
            }
            System.out.println("coustumer deleted");
    }
    
}
