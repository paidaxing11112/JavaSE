package Text;

import java.util.Scanner;

/**
 * @author gan
 */
public class Text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        while (true) {
            String s = sc.next();
            boolean flag = checkStr(s);
            sb = new StringBuilder();
            if(flag) {
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    sb.append(charConversion(c));
                }
                break;
            } else {
                System.out.println("输入错误,请重新输入");

                continue;
            }

        }
        System.out.println(sb);



    }
    public static String charConversion(char c) {
        String s = switch (c) {
            case '1' -> "壹";
            case '2' -> "贰";
            case '3' -> "叁";
            case '4' -> "肆";
            case '5' -> "無";
            case '6' -> "陆";
            case '7' -> "柒";
            case '8' -> "捌";
            case '9' -> "玖";
            default -> "";
        };
        return s;
    }
    public static boolean checkStr(String str){
        if(str.length() > 9) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
