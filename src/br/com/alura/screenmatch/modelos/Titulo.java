package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String name;
    private int year;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRating;
    private int durationInMinutes;

    public Titulo(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displaysDataSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: "+ year);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    public void toRating(double grade){
        sumOfRatings += grade;
        totalRating++;
    }

    public double averageRating(){
        return sumOfRatings/totalRating;
    }

    @Override
    public int compareTo(Titulo anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}
