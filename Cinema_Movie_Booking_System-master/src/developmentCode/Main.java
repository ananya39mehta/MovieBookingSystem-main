package developmentCode;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("controllerAndViews/views/Start_Up_Screen.fxml"));

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("controllerAndViews/views/Start_Up_Screen.css").toExternalForm());

        primaryStage.setTitle("Nueplex Cinema");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

}
