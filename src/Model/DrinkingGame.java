package Model;

import java.util.ArrayList;
import java.util.Random;

public class DrinkingGame {

    public String playGame(ArrayList<Person> players, ArrayList<Question> listOfQuestions){

        //Todo:
        // fikse random intervallet slik at det inkluderer 0.
        // Sjekke ut om at det verdt å fjerne spørsmålene fra lista etterhvert som de blir stilt.
        // ->   Da krever det en sjekk for å vurdere om det er flere spørsmål igjen eller ikke.

        Random random = new Random();

        int numberOfPlayers = players.size() -1;
        int numberOfQuestions = listOfQuestions.size() -1;

        int getIndexOfCurrentPlayer = random.nextInt(numberOfPlayers) +1;
        Person currentPlayer = players.get(getIndexOfCurrentPlayer);

        int getIndexOfCurrentQuestion = random.nextInt(numberOfQuestions) +1;
        Question question = listOfQuestions.get(getIndexOfCurrentQuestion);

        String questionToAsk = String.format(question.getQuestion(),currentPlayer.getName());
        System.out.println(questionToAsk);

        return questionToAsk;
    }
}
