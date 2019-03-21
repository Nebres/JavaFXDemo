package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        Button b1 = new Button();
        b1.setText("Close Window");

        b1.setOnAction( event -> {
            boolean answer = checkAnswer();
            System.out.println(answer);
            closeWindow(answer);
        });

        window.setOnCloseRequest(event -> {
            event.consume();
            boolean answer = checkAnswer();
            closeWindow(answer);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(b1);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();

    }

    private boolean checkAnswer() {
        return Controller.show("Exit Window", "Are Yoy sure?");
    }

    private void closeWindow(boolean answer) {
        if (answer) {
            window.close();
        }
    }

}
