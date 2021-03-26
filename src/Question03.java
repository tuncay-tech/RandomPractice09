public class Question03 {
    public static void main(String[] args) {
        //nested loop
        for (int i = 0; i < 10; i++) {
            System.out.print("i: " + i);
            for (int j = 10; j >=0 ; j--) {
                System.out.print("i : " + i + "j : " + j);
            }
        }
    }
}
