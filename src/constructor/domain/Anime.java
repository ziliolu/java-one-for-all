package constructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    //the method has to have the same name and parameters need to be different in overloading
    public void init(String name, String type, int episodes, String status){
        this.init(name, type, episodes);
        this.status = status;
    }
    public void print(){
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.name);
        System.out.println(this.status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public String getType(){
        return this.type;
    }

    public int getEpisodes(){
        return this.episodes;
    }

    public String getName(){
        return this.name;
    }

    public String getStatus() {
        return status;
    }


}
