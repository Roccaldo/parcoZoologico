public class Main {
    public static void main(String[] args) {
        //crea animali
        Animal dolly = new Animal("Dolly", SpeciesEnum.LABRADOR);
        Animal chucky = new Animal("Chucky", SpeciesEnum.BULLDOG);
        Animal rocki = new Animal("Rocki", SpeciesEnum.HUSKY);
        Animal jack = new Animal("Jack", SpeciesEnum.HUSKY);

        //crea zoo
        ParcoZoologico parcoZoologico = new ParcoZoologico();
        System.out.println("ARRAYLIST ANIMALI");
        //arraylist animali
        parcoZoologico.aggiungiAnimale(dolly);
        parcoZoologico.aggiungiAnimale(chucky);
        parcoZoologico.aggiungiAnimale(rocki);
        //stampa arraylist animali
        parcoZoologico.mostraAnimali();

        System.out.println("HASHMAP ANIMALI");
        //hashmap animali
        parcoZoologico.addAnimaleMappa(jack);
        parcoZoologico.addAnimaleMappa(dolly);
        //stampa hashmap animali
        parcoZoologico.mostraMappaAnimali();

        System.out.println("HASHSET ANIMALI");
        //hashset animali
        parcoZoologico.addAnimaleHashSet(dolly);
        parcoZoologico.addAnimaleHashSet(rocki);
        //stampa hashset animali
        parcoZoologico.stampaHashSetAnimali();
    }
}