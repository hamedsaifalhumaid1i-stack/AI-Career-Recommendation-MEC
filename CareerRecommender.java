import java.util.*;

public class CareerRecommender {

    static class CareerScore {
        String career;
        double score;

        CareerScore(String career, double score) {
            this.career = career;
            this.score = score;
        }
    }

    public static void main(String[] args) {

        // Sample student data
        double gpa = 2.5;
        double math = 90;
        double control = 85;
        double programming = 80;
        String interest = "Automation";

        String[] careers = {"Automation Engineer", "Maintenance Engineer", "Data Analyst"};

        // weights: [math, control, programming]
        Map<String, double[]> weights = new HashMap<>();
        weights.put("Automation Engineer", new double[]{0.3, 0.5, 0.2});
        weights.put("Maintenance Engineer", new double[]{0.3, 0.2, 0.5});
        weights.put("Data Analyst", new double[]{0.4, 0.1, 0.5});

        List<CareerScore> scores = new ArrayList<>();

        if (gpa < 2.0) {
            System.out.println("GPA is below threshold. Recommendations are limited.");
            return;
        } else {
            for (String career : careers) {  // LOOP
                double[] w = weights.get(career);
                double score = (math * w[0]) + (control * w[1]) + (programming * w[2]);

               if (career.toLowerCase().contains(interest.toLowerCase())) {
    score = score + 10;
} else {
    score = score - 2;
}


               if (score >= 70) {
    scores.add(new CareerScore(career, score));
}


            // Sort descending
            scores.sort((a, b) -> Double.compare(b.score, a.score));

            System.out.println("Top career recommendations:");
            for (int i = 0; i < Math.min(3, scores.size()); i++) {
                System.out.println((i + 1) + ") " + scores.get(i).career + " -> " + scores.get(i).score);
            }
        }
    }
}
