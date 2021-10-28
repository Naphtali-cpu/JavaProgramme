import java.util.*;
public class SuperDigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next(),n = "";
        int t = scanner.nextInt();
        for(int i = 0 ; i < t; i++) {
            n += n1;
        }
        while(n.length()!=1){
            int t1=0;
            for(int i=0;i<n.length();i++) {
                t1 += Integer.parseInt(n.charAt(i) + "");
            }
            n=Integer.toString(t1);
        }
        System.out.println(n);
    }
}