public class Main {
    public static void main(String[] args) {
        int number = 10;

        // Vòng lặp
        for (int i = 0; i < number; i++) {
            // Lệnh rẽ nhánh
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
            } else {
                System.out.println(i + " là số lẻ");
            }
        }
    }
}