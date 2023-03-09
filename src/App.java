import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class App extends Application {

  @Override
  public void start(Stage primaryStage) {
    try {
      VBox  root  = FXMLLoader.load(getClass().getResource("/View.fxml"));
      Scene scene = new Scene(root);

      primaryStage.setTitle("Space Invaders");
      primaryStage.setResizable(false);
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }

}