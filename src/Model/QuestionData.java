package Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class QuestionData {

    private ArrayList<Question> listOfQuestions = new ArrayList<>();

    public ArrayList<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public QuestionData(){
        ArrayList<String> lines = null;
        try{
            lines = new ArrayList<>(Files.readAllLines(Paths.get("src/Model/drikkelek.txt")));
        }catch (IOException e){

        }

        assert lines != null;
        for(String string : lines){
            Question question = new Question(string);
            listOfQuestions.add(question);
        }

    }

}
