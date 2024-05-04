public class Main {
    public static void main(String[] args) {
        for (char ch = 'Ё'; ch <= 'ё'; ch++) {
            if ((ch > 'Ё' && ch < 'А') || (ch > 'я' && ch < 'ё')) {
                continue;
            }
            System.out.println(ch + " (" + ((int) ch) + ")");
        }
    }
}