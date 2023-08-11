import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(11);
        int attempts = 3;
        int[] guesses = new int[attempts];
        for (int i = 0; i < attempts ; i++) {
            guesses[i] = random.nextInt(11);
            if (guesses[i] == secretNum){
                System.out.println("Вітаю! Ви вгадали число " + secretNum + "!");
                break;
            }else {
                System.out.println("Вибачте, це неправильна спроба");
            }

        }
        System.out.println("Гра закінчена! Загадане число було: " + secretNum);
    }
}
