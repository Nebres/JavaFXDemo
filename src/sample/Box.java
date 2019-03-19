package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Box {

    public static void show(String title, String msg) {

        Stage window = new Stage();
        window.setTitle(title);
        window.setMinWidth(200);
        window.setMinHeight(300);

        window.initModality(Modality.APPLICATION_MODAL);

        Label msgLable =  new Label(msg);
        Button closeB = new Button("Close Me");
        closeB.setOnAction(event -> window.close());

        VBox layout = new VBox(15);
        layout.getChildren().addAll(msgLable, closeB);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
