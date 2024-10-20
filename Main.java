import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the k value :");
        int k = sc.nextInt();
        String res = "";
        for(int i=k;i<str.length();i++){
            res = res + str.charAt(i);
        }
        for(int i=0;i<k;i++){
            res = res + str.charAt(i);
        }
        System.out.println("Rotated String Left by K Positions: ");
        System.out.print(res);
    }
}