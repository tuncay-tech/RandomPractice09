public class Question05 {
    public static void main(String[] args) {

        int veritabaniKayitSayisi = 35;
        for (int i = 1; i < veritabaniKayitSayisi; i++) {
            System.out.println(i + ". kayıt");
            if (i == 15){
                break;
            }
        }
    }
}
