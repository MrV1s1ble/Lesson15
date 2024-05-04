import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkIfContainRusLetters(getLine());
    }

    private static void checkIfContainRusLetters(String test) {
        String CORRECT_CHARS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя-АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        boolean isValid = true;
        String myNewString = test.replaceAll(" ", "");
        for (int i = 0; i < myNewString.length(); i++) {
            if (!CORRECT_CHARS.contains(String.valueOf(myNewString.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            String[] arrayFromScanner = test.split(" ");
            System.out.println("Фамилия: " + arrayFromScanner[0]);
            System.out.println("Имя: " + arrayFromScanner[1]);
            System.out.println("Отчество: " + arrayFromScanner[2]);
        } else {
            System.out.println("Введенная строка не является ФИО.");
        }
    }

    private static String getLine() {
        return new Scanner(System.in).nextLine();
    }
}