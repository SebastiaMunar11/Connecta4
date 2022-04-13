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




}
