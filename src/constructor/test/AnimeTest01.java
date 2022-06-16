package c58_constructor.test;

import c58_constructor.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Finished");

        anime.print();
    }
}
