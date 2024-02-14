import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root);

        primaryStage.setWidth(450);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.setTitle("Calculator");
        

        Button[] b = new Button[16];
        b[0].setText("+");
        scene.
    }

    public static void main(String[] args) {
        launch(args);
    }
}
