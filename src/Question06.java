public class Question06 {
    public static void main(String[] args) {
        int veritabaniKayitSayisi = 35;
        int count = 1;
        while(veritabaniKayitSayisi >= 0) {  // bir önceki örenek ile aynı olur
            System.out.println(count + ". kayit");
            if(count == 15) {
                break;
            }
            count++;
            veritabaniKayitSayisi--;
        }
    }
}
