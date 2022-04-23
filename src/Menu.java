import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Taulell taulell;
    private String torn; //"yellow" o "red"

    public Menu() {
        titol();
        this.taulell = new Taulell();
        this.torn = "red";
    }

    public Taulell getTaulell() {
        return taulell;
    }

    public void titol() {
        System.out.println("\n\n<<--CONNECTA 4-->>");
    }

    public void demanarAccio() {
        System.out.println("Trïa una columna:");
        int columna;

        try {
            Scanner sc = new Scanner(System.in);
            columna = sc.nextInt();

            if (!taulell.isColumnaPlena(columna)) {
                if (torn.equals("red")) {
                    Fitxa fitxa = new Fitxa("red");
                    taulell.posarFitxa(fitxa, columna);
                    torn = "yellow";
                } else if (torn.equals("yellow")) {
                    Fitxa fitxa = new Fitxa("yellow");
                    taulell.posarFitxa(fitxa, columna);
                    torn = "red";
                }

            } else {
                System.out.println("La columna està plena");
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Columna inexistent");
        } catch (InputMismatchException e) {
            System.out.println("Informació Invàlida");
        }
    }

    public void victoria(String guanyador) {
        if (guanyador.equals("red")) {
            System.out.println("El jugador vermell ha guanyat!!!");
        } else {
            System.out.println("El jugador groc ha guanyat!!!");
        }
        System.exit(0);
    }

    public void comprovarVictoria() {
        String guanyador = "";
        int seguidesVertical = 0;
        int seguidesHoritzontal = 0;
        int seguidesDiagonal = 0;

        if (torn.equals("yellow")) {
            guanyador = "red";
        } else if (torn.equals("red")) {
            guanyador = "yellow";
        }

        for (int i = 0; i < taulell.getCaselles().length; i++) { //HORITZONTAL
            for (int j = 0; j < taulell.getCaselles()[0].length; j++) {
                if (taulell.getCaselles()[i][j].isPlena() && (taulell.getCaselles()[i][j].getFitxa().getColor().equals(guanyador))) {
                    seguidesHoritzontal++;

                    if (seguidesHoritzontal >= 4) {
                        victoria(guanyador);
                    }
                }else {
                    seguidesHoritzontal = 0;
                }
            }
            seguidesHoritzontal = 0;
        }

        for (int j = 0; j < taulell.getCaselles()[0].length; j++) { //VERTICAL
            for (int i = 0; i < taulell.getCaselles().length; i++) {
                if (taulell.getCaselles()[i][j].isPlena() && (taulell.getCaselles()[i][j].getFitxa().getColor().equals(guanyador))) {
                    seguidesVertical++;
                    if (seguidesVertical >= 4) {
                        victoria(guanyador);
                    }
                }else {
                    seguidesVertical = 0;
                }

            }
            seguidesVertical = 0;
        }

        for (int j = 0; j < taulell.getCaselles()[0].length -3; j++){
            for (int i = 3; i < taulell.getCaselles().length; i++) {
                for(int a=0; a<4; a++){
                    if (taulell.getCaselles()[i-a][j+a].isPlena() && (taulell.getCaselles()[i-a][j+a].getFitxa().getColor().equals(guanyador))) {
                        seguidesDiagonal++;
                        if (seguidesDiagonal >= 4) {
                            victoria(guanyador);
                        }
                    }else {
                        seguidesDiagonal = 0;
                    }
                }
            }
            seguidesDiagonal = 0;
        }
        for (int j = taulell.getCaselles()[0].length-1; j >3; j--){
            for (int i = 3; i < taulell.getCaselles().length; i++) {
                for(int a=0; a<4; a++){
                    if (taulell.getCaselles()[i-a][j-a].isPlena() && (taulell.getCaselles()[i-a][j-a].getFitxa().getColor().equals(guanyador))) {
                        seguidesDiagonal++;
                        if (seguidesDiagonal >= 4) {
                            victoria(guanyador);
                        }
                    }else {
                        seguidesDiagonal = 0;
                    }
                }
            }
            seguidesDiagonal = 0;
        }

    }
}