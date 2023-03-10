public class Reversing_String {
    public static void main(String[] args) {
        String str1 = "Gourvi Gupta";
        String str2 = "";

//        for (int i = str1.length()-1; i>=0 ; i--) {
//            str2 = str2 + str1.charAt(i);
//        }
//        System.out.println(str2);
//        String sarr[]=str1.split(" ");
//        for (int i = sarr.length-1; i >=0 ; i--) {
//            str2 = str2 + sarr[i] + " ";
//        }
//        System.out.println(str2);

          String sarr[] = str1.split(" ");
        for (String elem:sarr) {
            for (int i = elem.length()-1; i >=0 ; i--) {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";
        }
        System.out.println(str2);


    }
}
