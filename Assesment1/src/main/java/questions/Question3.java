package questions;

public class Question3 {
    public static void main(String[] args) {
        String[] top3MovieStars = new String[3];
        top3MovieStars[0] = "Robert Downy Jr.";
        top3MovieStars[1] = "Scarlett johannesen";
        top3MovieStars[2] = "Tom Holland";

        for(int i =0; i < top3MovieStars.length; i++){
            System.out.println(top3MovieStars[i]);
        }

        for (String stars: top3MovieStars) {
            System.out.println(top3MovieStars);
            
        }

    }
}
