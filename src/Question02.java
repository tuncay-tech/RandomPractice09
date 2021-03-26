public class Question02 {
    public static void main(String[] args) {
        //standart kullanim
        System.out.print("i: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // 1 er azalarak
        System.out.print("\nj:");
        for (int j = 10; j >= 0; j--) {
            System.out.print(j + " ");
        }
        // 5 ten 10 kadar
        System.out.print("\nk:");
        for (int k = 5; k <= 10; k++) {
            System.out.print(k + " ");
        }
        // 0 dan 100 kadar 10 ar 10 ar
        System.out.print("\nl:");
        for (int l = 0; l <= 100; l += 10) {
            System.out.print(l + " ");
        }
        // 50 den 0 kadar 5 er er azalt
        System.out.print("\nm:");
        for (int m = 50; m >= 0; m -= 5) {
            System.out.print(m + " ");
        }

    }
}
