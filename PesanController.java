import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PesanController implements Initializable{
    @FXML
    private ComboBox stasiunAwal;
    @FXML
    private ComboBox stasiunTujuan;
    @FXML
    private Label tampilkanStasiunAwal;
    @FXML
    private ComboBox tipePenumpang;
    @FXML
    private ComboBox kelasKereta;
    @FXML
    private void handleStasiunAwal(ActionEvent event){
        String pilihanStasiunAwal = stasiunAwal.getSelectionModel().getSelectedItem().toString();
        tampilkanStasiunAwal.setText(pilihanStasiunAwal);
    }

    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> listStasiunAwal = FXCollections.observableArrayList("JOGJA", "SURABAYA", "MALANG");
        stasiunAwal.setItems(listStasiunAwal);
        ObservableList<String> listStasiunTujuan = FXCollections.observableArrayList("BANDUNG", "JAKARTA", "CILEGON");
        stasiunTujuan.setItems(listStasiunTujuan);
        ObservableList<String> listTipePenumpang = FXCollections.observableArrayList("DEWASA", "ANAK-ANAK");
        tipePenumpang.setItems(listTipePenumpang);
        ObservableList<String> listKelasKereta = FXCollections.observableArrayList("EKSEKUTIF", "EKONOMI");
        kelasKereta.setItems(listKelasKereta);
        
    }
}
