public class teamTest {

    public static void main(String[] args) {

        SoccerPlayer sergen=new SoccerPlayer("Sergen Yalcin");
        SoccerPlayer burak=new SoccerPlayer("Burak Yilmaz");
        SoccerPlayer senol=new SoccerPlayer("Senol Gunes");

        BasketballPlayer lebron=new BasketballPlayer("Lebron James");
        BasketballPlayer Kevin=new BasketballPlayer("Kevin Durant");
        BasketballPlayer Kyrie=new BasketballPlayer("Kyrie Irving");

        Team <BasketballPlayer >Lakers=new Team("Lakers");
        Team <SoccerPlayer>Besiktas=new Team("Besiktas");


        Lakers.addPlayer(lebron);
        Lakers.addPlayer(Kevin);

        Besiktas.printPlayer();



        Besiktas.addPlayer(burak);
        Besiktas.addPlayer(sergen);

        Lakers.numOfPlayers();

      Lakers.printPlayer();




    }
}
