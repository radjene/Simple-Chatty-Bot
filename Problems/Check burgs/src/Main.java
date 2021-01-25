import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String st1 = str1.replace(" " , "").trim();
        String st2 = str1.replace(" " , "").trim();
        System.out.print(st1.equals(st2));
    }
}