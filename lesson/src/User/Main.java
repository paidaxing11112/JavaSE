package User;
import java.util.Scanner;

class User {
    public String toString;
    private String username;
    private String password;
    private static int userCount = 0;
    //初始化
    public User() {
        this.username = "无";
        this.password = "无";
        userCount++;
    }
    //给用户名赋值
    public User(String username) {
        this.username = username;
        this.password = "666666";
        userCount++;
    }
    //给用户名和口令赋值
    public User(String username,String password) {
        this.username = username;
        this.password = password;
        userCount++;
    }
    //获取口令
    public String getter() {
        return this.password;
    }
    //设置口令
    public void setter(String password) {
        this.password = password;
    }
    //返回成员数和口令
    public String toString() {
        return userCount + " " + this.username + " " + this.password;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建第一个对象
        User user1 = new User("Tom","123456");
        System.out.println(user1.toString());
        //创建第二个对象
        String username2 = sc.next();
        User user2 = new User(username2);
        System.out.println(user2.toString());
        String username3 = sc.next();
        String password3 = sc.next();
        //创建第三个对象
        User user3 = new User(username3,password3);
        System.out.println(user3.toString());
    }
}
