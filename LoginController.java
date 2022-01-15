import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    Stage dialogStage = new Stage();
Scene scene;

 
@FXML
private void handleLogin(ActionEvent event) throws Exception{
String usernameStr = username.getText().toString();
String passwordStr = password.getText().toString();
 
String sql = ("SELECT * FROM user_data WHERE username ='"+usernameStr+ "' and password ='"+passwordStr+"'");
PreparedStatement stmt = conDB.con().prepareStatement(sql);
 
try{
ResultSet rs = stmt.executeQuery(sql);
if(!rs.next()){
infoBox("Enter Correct Username and Password", "Failed", null);
}else{
Node source = (Node) event.getSource();
dialogStage = (Stage) source.getScene().getWindow();
dialogStage.close();
scene = new Scene(FXMLLoader.load(getClass().getResource("pesan.fxml")));
dialogStage.setScene(scene);
dialogStage.show();
}
 
}catch(Exception e){
e.printStackTrace();
}
}
 
public static void infoBox(String infoMessage, String titleBar, String headerMessage)
{
Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle(titleBar);
alert.setHeaderText(headerMessage);
alert.setContentText(infoMessage);
alert.showAndWait();
}

    public void initialize(URL url, ResourceBundle RB){
        
    }

}
