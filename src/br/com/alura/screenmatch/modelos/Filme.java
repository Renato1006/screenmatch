public class Filme {
    String name;
    int year;
    boolean includedInThePlan;
    private double sumOfRatings;
    private int totalRating;
    int durationInMinutes;

    int getTotalRating(){
        return totalRating;
    }

    void displaysDataSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: "+ year);
    }

    void toRating(double grade){
        sumOfRatings += grade;
        totalRating++;
    }

    double averageRating(){
        return sumOfRatings/totalRating;
    }
}
