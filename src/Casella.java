public class Casella {

    private boolean isPlena = false;
    private Fitxa fitxa; // "red" "yellow"

    public boolean isPlena() {
        return isPlena;
    }

    public Fitxa getFitxa() {
        return fitxa;
    }

    private void setPlena(boolean plena) {
        isPlena = plena;
    }

    public void setFitxa(Fitxa fitxa) {
        if(fitxa.getColor().equals("red") || fitxa.getColor().equals("yellow")){
            this.fitxa = fitxa;
            setPlena(true);
        }
    }
}
