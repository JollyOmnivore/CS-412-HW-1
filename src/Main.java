import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Random randI = new Random();
        int randNumber = randI.nextInt(100);
        randNumber = randNumber + 1;

        try {
            int inputLine = 0;
            while (inputLine != randNumber) {
                System.out.print("Guess an number ");

                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                inputLine = Integer.parseInt(bufferedReader.readLine());
                if (inputLine > randNumber) {
                    System.out.println(inputLine + " is to high");
                } else if (inputLine < randNumber) {
                    System.out.println(inputLine + " is to low");
                } else {
                    System.out.println(inputLine + " is correct");

                }
            }

        } catch (IOException e) {
            System.err.println(e);
        }

    }


}

