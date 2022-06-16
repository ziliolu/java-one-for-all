package methodoverloading.test;

import methodoverloading.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();

        //parameter info -> ctrl + p
        anime.init("Akudama Drive", "TV", 12);

        anime.print();
    }
}
