public class Main {
    public static void main(String[] args) {
        Taulell taulell = new Taulell();
        taulell.getCaselles()[5][0].setFitxa("red");
        taulell.getCaselles()[5][1].setFitxa("red");
        taulell.getCaselles()[5][2].setFitxa("red");
        taulell.getCaselles()[5][3].setFitxa("yellow");
        taulell.displayTaulell();
    }
}
