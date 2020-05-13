package taggame;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        BorderPane root = new BorderPane();
//        root.setStyle("-fx-font-size: 30");
//        root.setCenter(createVBox());
//        root.setLeft(createVBox2());

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Game.fxml"));
        Parent root = loader.load();
        GameController controller = loader.getController();


        Scene scene = new Scene(root, 800, 480);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Tag Game");
        stage.show();
    }

//    private static Button [] buttons = new Button[16];
//    private static HBox [] hBoxes = new HBox[4];
//
//    private VBox createVBox2() {
//        VBox box = new VBox(20);
//        box.setMinSize(300, 420);
//
//        Label label = new Label("Menushka");
//        box.getChildren().add(label);
//        box.setAlignment(Pos.CENTER);
//
//        return box;
//    }
//
//    private VBox createVBox() {
//
//        VBox boxButtons = new VBox(10);
//        int k = 0;
//        for (int i = 0; i < 4; i++) {
//            hBoxes[i] = new HBox(10);
//            for (int j = 0; j < 4; j++) {
//                buttons[k] = new Button(Integer.toString(k + 1));
//                buttons[k].setMinSize(90, 90);
//                hBoxes[i].getChildren().add(buttons[k]);
//                k++;
//            }
//            hBoxes[i].setAlignment(Pos.CENTER);
//            boxButtons.getChildren().add(hBoxes[i]);
//
//        }
//
//        boxButtons.setStyle("-fx-background-color: Black");
//        boxButtons.setMinSize(430, 430);
//        //boxButtons.getChildren().addAll(box1, box2, box3, box4);
//        boxButtons.setAlignment(Pos.CENTER);
//        return boxButtons;
//    }

    public static void main(String[] args) {
        launch();
    }
}
