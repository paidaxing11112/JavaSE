import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    static ArrayList<User> list =  new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请输入你的操作1登录2注册3忘记密码");
            Scanner sc = new Scanner(System.in);
            String number = sc.next();
            switch (number) {
                case "1" -> login(list);
                case "2" -> registered(list);
                case "3" -> forgotPassword(list);
            }
        }
    }

    private static void forgotPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        System.out.println("请输入用户名");
        id = sc.next();
        int index = idIndex(list,id);
        User user = list.get(index);
        if(!user.id.equals(id)){
            System.out.println("未注册");
            return;
        }
        System.out.println("请输入身份证号码");
        String identificationNumber = sc.next();
        System.out.println("请输入手机号码");
        String mobilePhoneNumber = sc.next();
        if(!Objects.equals(user.identificationNumber, identificationNumber) || !Objects.equals(user.mobilePhoneNumber, mobilePhoneNumber)) {
            System.out.println("帐号信息不一致,修改失败");
            return;
        }else{
            System.out.println("请输入修改后的密码");
            String number = sc.next();
            user.setPassword(number);
            System.out.println("修改成功");
        }

    }

    private static void registered(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        start:
        while (true) {
            System.out.println("请输入用户名");
            id = sc.next();
            int len = id.length();
            if(len < 3 || len > 15){
                System.out.println("用户名长度不符合规范,请重新输入");
                continue;
            }
            boolean flag = checkId(list, id);
            if (!flag) {
                System.out.println("用户名已存在,请重新输入");
                continue;
            }
            int count = 0;
            for (int i = 0; i < id.length(); i++) {

                char c = id.charAt(i);
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                    count++;
                }
                if(!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    System.out.println("用户名只能是字母和数字,请重新输入");
                    continue start;
                }

            }
            if(count == 0){
                System.out.println("用户名不能为纯数字,请重新输入");
                continue;
            }
            break;
        }

        String password,againPassword;
        while(true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            againPassword = sc.next();
            if(againPassword.equals(password)) {
                break;
            }
            System.out.println("密码不一致,请重新输入");
        }

        String identificationNumber;
        pool:
        while(true){
            System.out.println("请输入身份证号码");
            identificationNumber = sc.next();
            if (identificationNumber.length() != 18){
                System.out.println("长度不符合,请重新输入");
                continue;
            }
            boolean flag = identificationNumber.startsWith("0");
            if (flag) {
                System.out.println("开头不能为0,请重新输入");
                continue;
            }
            for (int i = 0; i < identificationNumber.length() - 1; i++) {
                char c = identificationNumber.charAt(i);
                if(!(c >= '0' && c <= '9')){
                    System.out.println("前17位必须是数字,请重新输入");
                    continue pool;
                }
            }
            char c = identificationNumber.charAt(identificationNumber.length() - 1);
            if(!((c >= '0' && c <= '9') || c == 'X' || c == 'x')){
                System.out.println("最后一位只能是数字或X,x");
                continue;
            }
            break;


        }
        String mobilePhoneNumber;
        abc:
        while(true) {
            System.out.println("请输入手机号码");
            mobilePhoneNumber = sc.next();
            if(mobilePhoneNumber.length() != 11){
                System.out.println("长度必须为11位,请重新输入");
                continue;
            }
            boolean flag1 = identificationNumber.startsWith("0");
            if (flag1) {
                System.out.println("开头不能为0,请重新输入");
                continue;
            }

            for (int i = 0; i < mobilePhoneNumber.length(); i++) {
                char c = mobilePhoneNumber.charAt(i);
                if(!(c >= '0' && c <= '9')){
                    System.out.println("必须都是数字,请重新输入");
                    continue abc;
                }
            }
            break;
        }
        User user = new User(id,password,identificationNumber,mobilePhoneNumber);
        list.add(user);
        System.out.println("注册成功");

    }

    private static boolean checkId(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if(u.id.equals(id)) {
                return false;
            }
        }
        return true;
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        while(true){
            System.out.println("请输入用户名");
            id = sc.next();
            boolean flag = checkId(list,id);
            if(flag){
                System.out.println("用户名未注册,请先注册");
                continue;
            }
            break;
        }
        String captcha;
        while (true) {
            String str = creatCaptcha();
            System.out.println("请输入验证码"+ str);
            captcha = sc.next();

            if (!str.equalsIgnoreCase(captcha)) {
                System.out.println("验证码错误,请重新输入");
                continue;
            }
            break;
        }

        String password;
        for(int i = 0 ;i < 4; i++){
            System.out.println("请输入密码");
            password = sc.next();
            int index = idIndex(list, id);
            User u = list.get(index);
            if(!u.password.equals(password)){
                System.out.println("密码不一致,请重新输入密码,你还有" + (3 - i) + "次机会");
            }else{
                System.out.println("登录成功");
               break;
            }
        }
    }

    private static int idIndex(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.id.equals(id)){
                return i;
            }
        }
        return -1;
    }

    private static String creatCaptcha() {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v'
                ,'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S'
                ,'T','U','V','W','X','Y','Z'};
        char[] arrnumber = {'0','1','2','3','4','5','6','7','8','9'};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int p = random.nextInt(52);
            sb.append(arr[p]);
        }
        int a = random.nextInt(5);
        int b = random.nextInt(10);
        sb.insert(a,arrnumber[b]);
        return sb.toString();
    }
}
