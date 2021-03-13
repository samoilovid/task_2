import javafx.application.Application;
import javafx.scene.shape.Line;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public ReadingFromFile() throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Ivan" + separator + "IdeaProjects";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        // затруднения в выборке координат, при прочтении файла
    }
}

