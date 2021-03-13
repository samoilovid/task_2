import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Drawing extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Sphere sphere = new Sphere();

        sphere.setRadius(70.0);
        sphere.setTranslateX(200);
        sphere.setTranslateY(150);
        sphere.setTranslateZ(150);

        Line line = new Line();

        line.setStartX(150.0f);
        line.setStartY(150.0f);
        line.setEndX(300.0f);
        line.setEndX(300.0f);

        Group root = new Group(sphere, line);
        Scene scene = new Scene(root, 600, 300);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);
        scene.setCamera(camera);

        stage.setTitle("Drawing a Sphere and Line");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
