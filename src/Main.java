import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of available blocks: ");

        int availBlocks = input.nextInt();
        int startingNumBlocks = availBlocks;
        int totalBlocksUsed = 0;
        int pCount = 0;
        int n = 1;

        while (availBlocks >= n*n) {
            totalBlocksUsed += n * n;
            availBlocks -= n * n;
            n+=2;
            pCount++;
        }

        int blockLeft = startingNumBlocks - totalBlocksUsed;
        System.out.println("We can build a pyramid with " +pCount+ "layer(s) with " +blockLeft+ " block(s) remaining.");

    }
}
