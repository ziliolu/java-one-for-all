package inicialization_block.domain;

public class Anime {

    private String name;
    private int[] episodes;

    // 1 - Memory is allocated for the object
    // 2 - Each class attribute is initialized
    // 3 - Initialization block is executed
    // 4 - Constructed is executed


    {
        System.out.println("Inside init block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int episode : episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
