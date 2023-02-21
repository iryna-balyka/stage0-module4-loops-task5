package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height/2; i++){
            for (int j = 0; j < height; j++){
                if ((i > j) || (i >= height - j)) {
                    System.out.print(" ");
                } else System.out.print(8);
            }
            System.out.println("");
        }
        for (int i = height/2; i < height; i++){
            for (int j = 0; j < height; j++){
                if ((i > (height - j - 2)) && (j <= i)) {
                    System.out.print(8);
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
