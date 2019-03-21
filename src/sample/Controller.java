package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;


public class Controller {

   static boolean result;

   public static boolean show(String title, String text) {

       Stage stage = new Stage();
       stage.setTitle(title);
       stage.setMinHeight(200);
       stage.setMinWidth(200);
       stage.initModality(Modality.APPLICATION_MODAL);

       Label label = new Label(text);

       Button b1 = new Button("yes");
       Button b2 = new Button("no");

       b1.setOnAction(event -> {
           result = true;
           stage.close();
       });

       b2.setOnAction(event -> {
           result = false;
           stage.close();
       });

       VBox layout = new VBox(20);
       layout.setAlignment(CENTER);
       layout.getChildren().addAll(label, b1, b2);

       Scene scene = new Scene(layout, 350, 350);
       stage.setScene(scene);
       stage.showAndWait();

       System.out.println(result);
       return result;
   }

}
