public enum SpeciesEnum {
    LABRADOR("Labrador"),
    BULLDOG("Bulldog"),
    HUSKY("Husky");

    private final String species;

    SpeciesEnum(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

}
