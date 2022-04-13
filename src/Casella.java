public class Casella {

    private boolean isPlena = false;
    private String fitxa; // "red" "yellow"

    public boolean isPlena() {
        return isPlena;
    }

    public String getFitxa() {
        return fitxa;
    }

    private void setPlena(boolean plena) {
        isPlena = plena;
    }

    public void setFitxa(String fitxa) {
        if(fitxa.equals("red") || fitxa.equals("yellow")){
            this.fitxa = fitxa;
            setPlena(true);
        }
    }
}
