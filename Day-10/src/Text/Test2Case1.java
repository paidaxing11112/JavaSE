package Text;

/**
 * @author gan
 */
public class Test2Case1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cde";
        boolean flag =  whetherItIsEqualTo(strA,strB);
        System.out.println(flag);

    }
    public static String isRotation(String str) {
       char A = str.charAt(0);
       String B = str.substring(1);
       return B + A;

    }

    public static boolean whetherItIsEqualTo(String strA, String strB){
        for(int i = 0; i < strA.length(); i++) {
            strA =  isRotation(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
