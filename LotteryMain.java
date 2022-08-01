
package lotterymachine;


public class LotteryMain {
    public static void main(String[] args) {
        LotteryMachine lot = new LotteryMachine(); //call LotteryMachine class 
        lot.getNumbers();
        lot.sort();
        System.out.println("The 6 lucky numbers are: ");
        lot.display(); //call all methods in class
        
        
    }
    
}
