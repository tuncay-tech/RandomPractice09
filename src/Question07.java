public class Question07 {
    public static void main(String[] args) {
        // continue kalıbı

        int bilgiSayısı = 15;
        for (int i = 1; i <= bilgiSayısı; i++) {
            if (i == 5) {   // 5. kayıt atacak
                continue;
            }
            System.out.println(i + ". kayıt");
        }
    }
}
