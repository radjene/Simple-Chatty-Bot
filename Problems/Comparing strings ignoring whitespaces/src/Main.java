import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String st1 = str1.replaceAll(" ", "").trim();
        String st2 = str2.replaceAll(" ", "").trim();
        if (st2.equals(st1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}