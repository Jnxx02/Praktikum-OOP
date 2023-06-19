import java.util.Scanner;

public class Anime {
    private String title;
    private String genre;
    private String synopsis;
    private String studio;
    private int episodeCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Anime() {

    }

    public Anime (String title, String genre, String sysnopsis, String studio, int episodeCount) {
        this.title = title;
        this.genre = genre;
        this.synopsis = sysnopsis;
        this.studio = studio;
        this.episodeCount = episodeCount;
    }

    public void displayInfo() {
        System.out.println("Judul Anime: " + getTitle());
        System.out.println("Genre Anime: " + getGenre());
        System.out.println("Studio Anime: " + getStudio());
        System.out.println("Synopsis Anime: " + getSynopsis());
        System.out.println("Jumlah Episode: " + getEpisodeCount());
    }

}

class MainAnime{
    public static void main(String[] args) {
        Anime anime = new Anime();
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String genre = input.nextLine();
        String studio = input.nextLine();
        String synopsis = input.nextLine();
        int episodeCount = input.nextInt();
        input.close();
        anime.setTitle(title);
        anime.setGenre(genre);
        anime.setStudio(studio);
        anime.setSynopsis(synopsis);
        anime.setEpisodeCount(episodeCount);
        anime.displayInfo();
        anime.getTitle();
        
    }
}