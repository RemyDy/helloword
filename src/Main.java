public class Main {

    private String naam;
    private int leeftijd = 37;
    private float schoenmaat = 41.5f;

    public String getNaam() {
        return naam;
    }
    public int getLeeftijd(){
        return leeftijd;
    }
    public float getSchoenmaat(){
        return schoenmaat;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    public void setSchoenmaat(float schoenmaat) {
        this.schoenmaat = schoenmaat;
    }

    public Main(String naam, int leeftijd, float schoenmaat ){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.schoenmaat = schoenmaat;
    }

    public Main(){

    }


    public static void main(String[] args) {
        Main persoon = new Main("Remco", 37, 41.5f);
        System.out.println("Naam is " + persoon.naam + ", mijn leeftijd is " + persoon.leeftijd);
        System.out.println("Mijn schoenmaat is " + persoon.schoenmaat);

        Main persoon2 = new Main();
        persoon2.setNaam("Schut");
        persoon2.setLeeftijd(25);
        persoon2.setSchoenmaat(40f);

        System.out.println("Persoon 2, naam: " + persoon2.getNaam() + " leeftijd " + persoon2.getLeeftijd() + " schoenmaat: " + persoon2.getSchoenmaat());

        System.out.println("Hello World!");
        System.out.println("Hello Remco");
        String name = "Remco";
        System.out.println("hello " + name);
        int age = 37;
        String area = "Leerdam";
        float shoeSize = 41.5f;
        System.out.println("Hallo, mijn naam is " + name
                + " en ik woon in " + area + ". Ik ben " + age + " jaar jong. " +
                        shoeSize + " is mijn schoenmaat, mocht je dat willen weten."
                );
    }
}
