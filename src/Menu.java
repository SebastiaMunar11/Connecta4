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

        try{
            Scanner sc = new Scanner(System.in);
            columna= sc.nextInt();

            if(!taulell.isColumnaPlena(columna)){
                if(torn.equals("red")){
                    Fitxa fitxa = new Fitxa("red");
                    taulell.posarFitxa(fitxa, columna);
                    torn= "yellow";
                }
                else if(torn.equals("yellow")){
                    Fitxa fitxa = new Fitxa("yellow");
                    taulell.posarFitxa(fitxa, columna);
                    torn= "red";
                }

            }
            else{
                System.out.println("La columna està plena");
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Columna inexistent");
        }
        catch (InputMismatchException e){
            System.out.println("Informació Invàlida");
        }
    }


}
