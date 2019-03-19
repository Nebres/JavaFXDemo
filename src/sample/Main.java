package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {

    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("JavaFx BOX Demo");

        button = new Button();
        button.setText("Click Me!");

        button.setOnAction(event ->  Box.show("Alert Box", "This is Alert"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
