import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Scene scene = new Scene(loader.load());

            stage.setTitle("Login TiketinAja");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e){
            System.out.println("Error in start : "+e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}