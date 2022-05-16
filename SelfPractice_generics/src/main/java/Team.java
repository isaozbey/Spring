import java.util.ArrayList;

public class Team<T extends Player> {

    String name;

    public Team(String name) {
        this.name = name;
    }
    ArrayList<T> list=new ArrayList<>();


    void  addPlayer(T player) {
        list.add(player);
    }

    void  numOfPlayers(){
        System.out.println(list.size());
    }

    void printPlayer(){
        list.forEach(p -> System.out.println(p.name));
    }




}
