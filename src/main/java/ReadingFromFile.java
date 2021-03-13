import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public ReadingFromFile() throws FileNotFoundException {
        String separator = File.separator;
    String path = separator + "Users" + separator + "Ivan" + separator + "IdeaProjects";

    File file =new File(path);

    Scanner scanner = new Scanner(file);
    String line = scanner.nextLine();
    String[] numbersString = line.split("");//пока не могу решить, как это правильно считать.
    int[] numbers = new int[3];
    int counter = 0;

    for(String number : numbersString){
        numbers[counter++]=Integer.parseInt(number);
    }
        System.out.println(Arrays.toString(numbers));
    scanner.close();
    }
}
