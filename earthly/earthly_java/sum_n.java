import java.util.Scanner; 
class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), res=0;
        while (n-->0){
            res+=n;
        }
        System.out.println("Resultant sum: " + res);
    }
}   