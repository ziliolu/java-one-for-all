package staticmodifier.domain;

public class Anime {

    private String name;
    private static int[] episodes;

    // 0 - Static init block is executed when JVM loads the class and only onde
    // 1 - Memory is allocated for the object
    // 2 - Each class attribute is initialized
    // 3 - Initialization block is executed
    // 4 - Constructed is executed

    static {
        System.out.println("Inside static init block");
        episodes = new int[5];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside static init block 2");
    }

    static {
        System.out.println("Inside static init block 3");
    }

    {
        System.out.println("Inside non static init block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}
