public class power2ornot {
    public static boolean ispower(int n) {
        return (n & (n-1))==0;
        
    }
    public static void main(String[] args) {
        System.out.println(ispower(5));
    }
}
