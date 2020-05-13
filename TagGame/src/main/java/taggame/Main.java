package taggame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
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
    public static void main(String[] args) {
        launch();
    }
}
