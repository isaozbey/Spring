public abstract class Player {

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;

    public Player(String name) {
        this.name = name;
    }
}
