package collectionsUsage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Game {
    private ArrayList<String> players;
    private static final int WINNERS_COUNT = 3;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void initPlayers() {
        players.add("Дмитрий Васильев");
        players.add("Анна Сергеева");
        players.add("Евгений Викторов");
        players.add("Мария Петрова");
        players.add("Алексей Воронцов");
        players.add("Иван Павлов");
        Collections.sort(players);
    }

    public ArrayList<String> getWinners() {
//        shuffle - перемешивает список
        Collections.shuffle(players);
        ArrayList<String> winners = new ArrayList<>();
        for (int i = 0; i < WINNERS_COUNT; i++) {
            winners.add(players.get(i));
        }
        return winners;
    }

    public boolean add(String player) {
        int index = Collections.binarySearch(players, player);
        if (index >= 0) {
            return false;
        }
        players.add(-index - 1, player);
        for (String item :
                players) {
            System.out.println(item);
        }
        System.out.println(index);
        return true;
    }

    public void printList(){
        for (String player : players) {
            System.out.println(player);
        }
    }
}
