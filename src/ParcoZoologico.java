import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ParcoZoologico {
    private ArrayList<Animal> listaAnimali;
    private HashMap<Integer, Animal> mappaAnimali;
    private HashSet<Animal> hashSetAnimali;

    public ParcoZoologico() {
        this.listaAnimali = new ArrayList<>();
        this.mappaAnimali = new HashMap();
        this.hashSetAnimali = new HashSet<>();
    }

    public ArrayList<Animal> getListaAnimali() {
        return listaAnimali;
    }

    public void setListaAnimali(ArrayList<Animal> listaAnimali) {
        this.listaAnimali = listaAnimali;
    }

    public HashMap<Integer, Animal> getMappaAnimali() {
        return mappaAnimali;
    }

    public void setMappaAnimali(HashMap<Integer, Animal> mappaAnimali) {
        this.mappaAnimali = mappaAnimali;
    }

    public HashSet<Animal> getHashSetAnimali() {
        return hashSetAnimali;
    }

    public void setHashSetAnimali(HashSet<Animal> hashSetAnimali) {
        this.hashSetAnimali = hashSetAnimali;
    }

    public void aggiungiAnimale(Animal animale) {
        if (listaAnimali.isEmpty()) {
            listaAnimali.add((animale));
        } else if (!listaAnimali.contains(animale)) {
            listaAnimali.add((animale));
        } else {
            throw new RuntimeException("animale già in lista");
        }
    }

    public void mostraAnimali() {
        System.out.println(listaAnimali);
    }

    public void addAnimaleMappa(Animal animale) {
        if (mappaAnimali.isEmpty()) {
            mappaAnimali.put(animale.getId(), animale);
        } else if (!mappaAnimali.containsKey(animale.getId())) {
            mappaAnimali.put(animale.getId(), animale);
        } else {
            throw new RuntimeException("animale già in lista");
        }
    }

    public void mostraMappaAnimali() {
        for (Animal animal : mappaAnimali.values()) {
            System.out.println("id: " + animal.getId() + " Name: " + animal.getName() + " specie: " + animal.getSpeciesEnum());
        }
    }

    //aggiungi animale all'hashset
    public void addAnimaleHashSet(Animal animale) {
        //controllo se l'hashset è vuoto mi aggiunge l'animale
        if (hashSetAnimali.isEmpty()) {
            hashSetAnimali.add(animale);
        } else {
            boolean isSameSpecie = false;
            //ciclo all'interno dell'hashSet
            for (Animal animaleVar : hashSetAnimali) {
                //controllo se l'animale è gia al suo interno
                if (animaleVar.getSpeciesEnum().equals(animale.getSpeciesEnum())) {
                    isSameSpecie = true;
                }
            }
            //se non è già all'interno me lo aggiungi
            if (!isSameSpecie) {
                hashSetAnimali.add(animale);
                //oppure mi lanci un eccezione
            } else {
                throw new RuntimeException("stessa specie di animale!");
            }
        }
    }

    //mostra gli animali all'interno dell'hashset
    public void stampaHashSetAnimali() {
        for (Animal animale : hashSetAnimali) {
            System.out.println(animale);
        }
    }
}

