package overriding.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    //overriding.domain.Anime@58372a00 -> toString "raw" (Object)
    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
