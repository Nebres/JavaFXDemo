package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene, scene2;

        Button button = new Button("Go to scene 2");
        Button button2  = new Button("Back to scene 1");

        Label label = new Label("This is scene 1");
        Label label2 = new Label("This is scene 2");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, button);
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);

        scene = new Scene(layout, 400, 200);
        scene2 = new Scene(layout2, 400, 200);

        button2.setOnAction(event -> primaryStage.setScene(scene));
        button.setOnAction(event -> primaryStage.setScene(scene2));

        primaryStage.setScene(scene);
        primaryStage.setTitle("Switch Scene");
        primaryStage.show();
    }

}
