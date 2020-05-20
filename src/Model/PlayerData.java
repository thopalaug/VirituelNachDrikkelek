package Model;

import java.util.ArrayList;

public class PlayerData {

    private ArrayList<Person> listOfPlayers = new ArrayList<>();


    public ArrayList<Person> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(ArrayList<Person> listOfPlayers){
        this.listOfPlayers = listOfPlayers;
    }

    public void addPlayer(Person person){
        listOfPlayers.add(person);
        System.out.println(person.getName() + " added to the list");
    }


}
