package basic_concepts;

public class CastingTypeOp {
    public static void main(String[] args) {
        // Calculate the percentage of the user's score in relation to the maximum available score.
        int maxScore = 500;
        int userScore = 463;

        // Casting the percentage user's score
        float percentage = (float) userScore / maxScore * 100.0f;

        // Printing the op's results
        System.out.println("User's score per is " + percentage + "%");

    }
}
