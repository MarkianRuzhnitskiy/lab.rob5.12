public class Third {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double x1 = 0, x2 = 0, x3 = 0;

        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            x1 = x1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            x2 = x2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            x3 = x3 + array3[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println("x1: " + (x1 = x1 / 5));
        System.out.println("x2: " + (x2 = x2 / 5));
        System.out.println("x3: " + (x3 = x3 / 5));

        if (x1 < x2 && x2 < x3) {
            System.out.println("Найбільше значення: x3");
        }
        else if (x1 < x2 && x2 > x3) {
            System.out.println("Найбільше значення: x2");
        }
        else {
            System.out.println("Найбільше значення: x1");
        }
    }
}
