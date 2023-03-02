public class Gourvi {
    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0 && j!=0 || j==0 && i!=0 && i!=n ||
                        j>0 && j<n/2 && i==n || j==n/2 && i>=(n-1)/2 ||
                        i==n/2 && j>=n/2 || j==n && i>=(n-1)/2){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("    ");
        System.out.println();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0 && j>0 && j<n || i==n && j>0 && j<n || j==0 && i>0 && i!=n || j==n && i>0 && i!=n){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("    ");
        System.out.println();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(j==0 || j==n || i==n && j!=0 && j<n){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("    ");
        System.out.println();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(j==0 && i!=0 || i==0 && j!=n && j!=0 || j==n && i!=0 && i<n/2 || i==n/2 && j<n || i==j && i>=n/2){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("    ");
        System.out.println();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==j && j<=n/2 || i+j==n && j>n/2){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println("");
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==0 || i==n || j==n/2){
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

    }
}
