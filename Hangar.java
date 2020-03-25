public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Clio");
        Boat titanic = new Boat("Titanic");

        String affichage = clio.doStuff();
        System.out.println(affichage);

        String affichage2 = titanic.doStuff();
        System.out.println(affichage2);
    }
}