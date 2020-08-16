package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Button button1 = new Button("Button One");
      button1.setMaxHeight(Double.MAX_VALUE);
      button1.setMaxWidth(Double.MAX_VALUE);
      
      Button button2 = new Button("Button Two");
      Button button3 = new Button("Button Tree");
      
      Insets margin = new Insets(20, 10, 20, 10);
      VBox.setMargin(button1, margin);
      
      VBox hBox = new VBox(10, button1, button2, button3);
      
      VBox.setVgrow(button1, Priority.ALWAYS);
      
      hBox.setAlignment(Pos.BOTTOM_RIGHT);
      hBox.setFillWidth(true);
      
      Scene scene = new Scene(hBox);
      
      
      primaryStage.setScene(scene);
      primaryStage.show();
      
    }

}
