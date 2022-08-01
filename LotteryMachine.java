package lotterymachine;
import java.util.Arrays;
import java.util.Random;
public class LotteryMachine {

    Random rand = new Random();
    int min = 1;
    int max = 60;
    int slots = 6;  //declaring size of int
    int[] lotteryArr = new int[slots];
    boolean repeat;
    int randomNumber = 0;

    public int[] getNumbers() {     //populate the array
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                repeat = false;
                randomNumber = rand.nextInt(max + 1 - min) + min;
                for (int k = 0; k <= indexDrawn; k++) {
                    if (lotteryArr[k] == randomNumber) {
                        repeat = true;
                        break;
                    }
                }
            } //make sure the random number does not repeat itself
            while (repeat);
            lotteryArr[indexDrawn] = randomNumber; //populate the array if number does not repeat
        }
        return lotteryArr;
    }

    public int[] sort() {
        Arrays.sort(lotteryArr);  //sort the array from small to large
        return lotteryArr;
    }

    public int[] display() {
        for (int i = 0; i < slots; i++) {
            System.out.print(lotteryArr[i] + " ");  //display the numbers until arr size is too big
        }
        return lotteryArr;

    }

}
