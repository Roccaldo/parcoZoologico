import java.util.Objects;

public class Animal {
    private String name;
    private SpeciesEnum speciesEnum;
    private Integer id = 0;
    private static Integer counter = 1;

    public Animal(String name, SpeciesEnum speciesEnum) {
        this.name = name;
        this.speciesEnum = speciesEnum;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeciesEnum getSpeciesEnum() {
        return speciesEnum;
    }

    public void setSpeciesEnum(SpeciesEnum speciesEnum) {
        this.speciesEnum = speciesEnum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
    public void dettagliAnimale() {
        System.out.println("id: " + id + " Nome: " + name + " Specie: " + speciesEnum);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", specie " + speciesEnum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && speciesEnum == animal.speciesEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciesEnum);
    }
}
