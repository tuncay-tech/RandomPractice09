public class Question04 {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i = i * i) { // katlarını yazdırı 2 yi sonra 2 * 2 yazdırırı sonra
                                                // 4*4 yazdırı ama o olmadığından onu yazmaz
            System.out.print(i + " - ");
        }
        System.out.println("\n");
        for (int i = 2; i < 100; i = i * i) {
            System.out.print(i + " - ");
        }

    }
}