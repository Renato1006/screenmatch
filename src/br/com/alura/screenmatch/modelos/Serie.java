package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisodes;

    public Serie(String name, int year) {
        super(name, year);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisodes;
    }

    @Override
    public String toString() {
        return "Série: " + this.getName() + "(" + this.getYear() + ")";
    }
}
