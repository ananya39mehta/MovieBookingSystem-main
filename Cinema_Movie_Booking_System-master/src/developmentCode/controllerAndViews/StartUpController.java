package developmentCode.controllerAndViews;

import developmentCode.controllerAndViews.model.SharedVariables;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import developmentCode.controllerAndViews.MovieBookingException;
public class StartUpController implements Initializable, SharedVariables {

    public GridPane CUSTOMER_EMPLOYEE;

    public Button employeeSignIn;
    public Button signInButton_1;
    public Button exitButton;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void signInScreen(ActionEvent actionEvent) throws MovieBookingException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("views/Sign_In_Screen.fxml"));
            Scene currentScene = employeeSignIn.getScene();
            Stage stage = (Stage) currentScene.getWindow();
            stage.setScene(new Scene(root, -1, -1, true, SceneAntialiasing.BALANCED));
        } catch (IOException e) {
            // Handle the IOException by throwing a runtime exception or logging the error
            throw new RuntimeException("Error loading sign-in screen: " + e.getMessage(), e);
        }
    }


    public void exit(ActionEvent actionEvent) {

        System.exit(0);
    }
    public void backToSignIn(MouseEvent mouseEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("views/Sign_In_Screen.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Get the current scene's window (stage)
        Scene currentScene = employeeSignIn.getScene();
        Stage stage = (Stage) currentScene.getWindow();

        // Set the new scene to the sign-in screen
        Scene signInScene = new Scene(root, -1, -1, true, SceneAntialiasing.BALANCED);
        stage.setScene(signInScene);

    }
}
