package constructor.test;

import constructor.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Finished");

        anime.print();
    }
}
