public class D {
    public static void main(String[] args) {
        int n=11;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n ; j++) {
                if(j==0 && i>0 && i!=n || i==0 && j<n-1 || i==n && j<n-1 || j==n && i!=0 && i!=n){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
