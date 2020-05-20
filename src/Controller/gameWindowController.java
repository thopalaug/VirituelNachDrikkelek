package Controller;

import Model.DrinkingGame;
import Model.Person;
import Model.PlayerData;
import Model.QuestionData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gameWindowController implements Initializable {

    @FXML
    public Label question;

    @FXML
    public Button nextQuestionButton;

    @FXML
    private Button quitGameButton;

    @FXML
    private QuestionData QD;
    @FXML
    private PlayerData PD;
    @FXML
    private DrinkingGame DG;

    @Override
    public void initialize(URL rul, ResourceBundle resourceBundle){

        QD = new QuestionData();
        DG = new DrinkingGame();
        PD = new PlayerData();

        //playGame();

    }

    @FXML
    public void nextQuestion() throws IOException {
        playGame();
    }


    public void playGame() throws IOException {
        getListOfPlayers();
        System.out.println("getListOfPlayers is called");
        question.setText((DG.playGame(PD.getListOfPlayers(),QD.getListOfQuestions())));
    }



    /*Denne fungerer ikke. Gir en null pointer exception*/

    public void getListOfPlayers() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/setupWindow.fxml"));
        Parent root = loader.load();
        System.out.println("Line 68 is executed");


        //Linjen under gir null pointer exception.
        setupWindowController controller = loader.getController();
        PD.setListOfPlayers(controller.getPlayerData());

        System.out.println("Line 75 is executed");

        for(Person person : PD.getListOfPlayers()){
            System.out.println(person.getName());
        }
        System.out.println("Line 83 is executed");
        System.out.println(controller.leverJeg() + 4);

    }


}
