public class Menu {
    private Taulell taulell;

    public Menu() {
        titol();
        setDificultat();
        this.taulell = new Taulell(getDificultat());
    }
}
