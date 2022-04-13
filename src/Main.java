public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getTaulell().displayTaulell();
        while(true) {
            menu.demanarAccio();
            menu.getTaulell().displayTaulell();
        }
    }
}
