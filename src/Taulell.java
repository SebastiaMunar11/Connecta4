public class Taulell {

    private Casella[][] caselles = new Casella[6][7];

    public Taulell(){
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
        int fila = 0;
        int columna = 0;

        System.out.print("     ");
        for (columna = 0; columna < caselles[0].length; columna++) {
            if (columna < 10) {
                System.out.print("  " + columna + "  ");
            } else {
                System.out.print("  " + columna + "  ");
            }
        }

        System.out.println();

        for (int i = 0; i < caselles.length; i++) {
            if (fila < 10) {
                System.out.print("  " + fila + "  ");
            } else {
                System.out.print("  " + fila + " ");
            }
            fila++;
            for (int j = 0; j < caselles[0].length; j++) {
                if (caselles[i][j].isPlena()) {
                    if(caselles[i][j].getFitxa().equals("red")){
                        System.out.print("[ R ]");
                    }
                    if(caselles[i][j].getFitxa().equals("yellow")){
                        System.out.print("[ Y ]");
                    }
                }else {
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }

        System.out.println();
    }



}
