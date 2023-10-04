public class Calculate {

    public static String gpa(double score) {
        if (score >= 0.0 && score <= 10.0) {
            if (score >= 9.0) {
                return "A+";
            } else if (score >= 8.5) {
                return "A";
            } else if (score >= 8.0) {
                return "B+";
            } else if (score >= 7.0) {
                return "B";
            } else if (score >= 6.5) {
                return "C+";
            } else if (score >= 6.0) {
                return "C";
            } else if (score >= 5.0) {
                return "D+";
            } else if (score >= 4.0) {
                return "D";
            } else {
                return "F";
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
