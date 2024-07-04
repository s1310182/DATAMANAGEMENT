import java.util.Random;

class Task1 {
    public static void main(String[] args) {

        int tails = 0, heads = 0;
        Random rand = new Random();

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Rountd " + i + " ");

            int a = rand.nextInt(2);

            if (a == 1) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                tails++;
            }
        }
        System.out.println("Heads: " + heads + ", Tails: " + tails);

        if(heads > tails) System.out.println("You won");
        else System.out.println("You lost");
    }

}
