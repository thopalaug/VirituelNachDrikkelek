package Controller;

import Model.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class setupWindowController implements Initializable{

    @FXML
    public PlayerData PD;

    @FXML
    private ListView<Person> playerListView;

    @FXML
    private Button Play;
    @FXML
    private Button addPlayerButton;
    @FXML
    private TextField playerNameField;



    @Override
    public void initialize(URL rul, ResourceBundle resourceBundle){
        PD = new PlayerData();
        updateListOfPlayersView();
    }

    @FXML
    public void play(ActionEvent event) throws IOException{

        /*
            Her må det sendes en ArrayList med personer over til gameWindow controlleren.
        */

        Parent playWindow = FXMLLoader.load(getClass().getResource("/View/gameWindow.fxml"));
        Scene playWindowScene = new Scene(playWindow, 700, 700);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(playWindowScene);
        window.show();

    }

    public void updateListOfPlayersView(){
        ObservableList<Person> observableList = FXCollections.observableArrayList(PD.getListOfPlayers());
        playerListView.setItems(observableList);
    }

    @FXML
    public void addPlayer(){
        String name = playerNameField.getText().trim();
        Person person = new Person(name);
        PD.addPlayer(person);
        updateListOfPlayersView();
    }


    public int leverJeg(){
        System.out.println("Jeg lever fortsatt");
        return 5;
    }

    public ArrayList<Person> getPlayerData(){
        return PD.getListOfPlayers();
    }

    @FXML
    public void handleExit(){
        Platform.exit();
    }

}
