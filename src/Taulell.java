public class Taulell {

    private Casella[][] caselles = new Casella[6][7];

    public Taulell() {
        omplirCaselles();
    }

    public Casella[][] getCaselles() {
        return caselles;
    }

    private void omplirCaselles() {
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                caselles[i][j] = new Casella();
            }
        }
    }

    public void displayTaulell() {
        for (int i = 0; i < caselles[0].length; i++) {
            System.out.print("  " + i + "  ");
        }

        System.out.println();

        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[0].length; j++) {
                if (caselles[i][j].isPlena()) {
                    if (caselles[i][j].getFitxa().getColor().equals("red")) {
                        System.out.print("[ R ]");
                    }
                    if (caselles[i][j].getFitxa().getColor().equals("yellow")) {
                        System.out.print("[ Y ]");
                    }
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public boolean isColumnaPlena(int columna) {
        if (caselles[0][columna].isPlena()) {
            return true;
        }
        return false;
    }

    public void posarFitxa(Fitxa fitxa, int columna) {
        for (int i = caselles.length - 1; i >= 0; i--) {
            if (!caselles[i][columna].isPlena()) {
                caselles[i][columna].setFitxa(fitxa);
                break;
            }
        }
    }


}
