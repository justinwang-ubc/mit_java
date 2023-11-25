package javatutorial;

public class FooCorporation {
   public static void calculateTotalPay(double basePay, int hour ) {
       double salary;
       if (basePay >= 8 ) {
           if(hour <= 60) {
               
               if (hour > 40) {
                   salary =(hour - 40)*1.5*basePay + 40*basePay ;
               }else {
                   salary = hour *basePay; 
               }
               String m1 = "get money " +salary;
               System.out.print(m1);
           }else {
               System.out.print("Error");
           }
       }else {
           System.out.print("Error");
       }
   }
   
   public static void main(String[] arguments) {
       calculateTotalPay(7.5,35);
       calculateTotalPay(8.2,47);
       calculateTotalPay(10.0,73);
   }
}
