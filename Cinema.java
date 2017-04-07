
import java.util.Scanner;


public class Cinema {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = input.next();
        System.out.println("Enter number of customers: ");
        int n = input.nextInt();
        String type="";
        int price=0;
        while(n>0){
            
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Enter age: ");
            String age = input.next();
            System.out.println("Select type of the customer");
            System.out.println("1 - Student");
            System.out.println("2 - OAP");
            System.out.println("3 - Standard");
            System.out.println("4 - Child");
            int v = input.nextInt();
            switch(v){
                case 1:
                    type="student";
                    break;
                case 2:
                    type="oap";
                    break;
                case 3:
                    type="standard";
                    break;
                case 4:
                    type="child";
                    break;
                default:
                    System.out.println("Invalid Choice Enter 1 2 3 or 4");
            }
            int p=0;
            if(day.equals("wednesday")){
                p = DiscRates(type); 
            }else{
                p = Rates(type);
            }
            
            Customer c = new Customer(name,age,type);
            
            price = price + p;
            
            
            n--;
            
        }
        System.out.println("Total cost for this movies is "+price);
    }
    
    public static int Rates(String type){
        Rates r = new Rates();
        if(type.equals("student"))
            return r.getSTUDENT_RATE();
        else if(type.equals("oap"))
            return r.getOAP_RATE();
        else if(type.equals("standard"))
            return r.getSTANDARD_RATE();
        else
            return r.getCHILD_RATE();
    
    }
    
    public static int DiscRates(String type){
        DiscountedRates r = new DiscountedRates();
        if(type.equals("student"))
            return r.getDISC_STUDENT_RATE();
        else if(type.equals("oap"))
            return r.getDISC_OAP_RATE();
        else if(type.equals("standard"))
            return r.getDISC_STANDARD_RATE();
        else
            return r.getDISC_CHILD_RATE();
    
    }
    
}
