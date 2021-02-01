import java.util.Scanner;

public class Recursion {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Letters");
        String letters = sc.nextLine();
        System.out.print(vowels(letters));

    }

    public static int vowels (String x){
        int count = 0;
        char v;

        if (x.length() < 1)
            return 0;
        else
            v = x.charAt(0);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u');
            count++;
            return  count + vowels(x.substring(1));
    }
}
