package overriding.test;

import overriding.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");
        System.out.println(anime.toString());
    }
}

//overriding.domain.Anime@58372a00 -> toString (Object)
