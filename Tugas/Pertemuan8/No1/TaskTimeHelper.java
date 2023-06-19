package No1;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random.nextInt(100) + 1;
    }
}
