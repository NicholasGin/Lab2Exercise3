package BeautifulFlowers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // load BeautifulFlowers.fxml
        Parent root = FXMLLoader.load(getClass().getResource("BeautifulFlowers.fxml"));

        // Sets the title
        primaryStage.setTitle("Beautiful Flowers");

        // creates the scene of size 650, 400
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
