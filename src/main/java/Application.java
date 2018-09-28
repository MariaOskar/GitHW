import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        String dirName = getRandomString();
        String fileName = getRandomString() + ".txt";
        String path = dirName + File.separator + fileName;
        File file = new File(path);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Cannot create new file");
        }

    }

    private static int randomNum(int min, int max) {
        Random rand = new Random();
        return min + rand.nextInt(max - min);
    }

    private static String getRandomString() {
        int max = randomNum(9, 20);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < max; i++) {
            builder.append((char) randomNum(97, 122));
        }
        return builder.toString();
    }
}