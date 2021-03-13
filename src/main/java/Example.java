import javafx.application.Application;
import javafx.scene.shape.Line;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Example extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Sphere sphere = new Sphere();
        double r, centerX, centerY, centerZ, x1, y1, z1, x2, y2, z2;

        sphere.setRadius(r);
        sphere.setTranslateX(centerX);
        sphere.setTranslateY(centerY);
        sphere.setTranslateZ(centerZ);

        Line line = new Line();
        line.setStartX(x1);
        line.setStartY(y1);
        line.setStartZ(z1);

        line.setEndX(x2);
        line.setEndX(y2);
        line.setEndZ(z2);

        if ((x1 - centerX) * (x1 - centerX) + (y1 - centerY) * (y1 - centerY) + (z1 - centerZ) * (z1 - centerZ) <= r * r
                || (x2 - centerX) * (x2 - centerX) + (y2 - centerY) * (y2 - centerY) + (z2 - centerZ) * (z2 - centerZ) <= r * r) {
            System.out.println("Есть точки пересечения");
        } else {
            System.out.println("Точек пересечения нет");
        }
    }
}
