public class pangram {
    public static void main(String[] args) {
        boolean flag=false;
        String str = "The Quick Brown Fox Jumps Over The Lazy Dog";
        str=str.toUpperCase();
        str=str.replace(" ","");
         char[] arr=str.toCharArray();

         int[] arr2= new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]-65]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]==0){
                System.out.println("Its Not a pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Its pangram");
        }
    }

}
