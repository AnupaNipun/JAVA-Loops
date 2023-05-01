public class Halfpyramid {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for(int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
