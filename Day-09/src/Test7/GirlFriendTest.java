package Test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend g1 = new GirlFriend("小明明1", 18, "女", "学习");
        GirlFriend g2 = new GirlFriend("小明明2", 19, "女", "弹琴");
        GirlFriend g3 = new GirlFriend("小明明3", 20, "女", "玩游戏");
        GirlFriend g4 = new GirlFriend("小明明4", 21, "女", "约会");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girl = new GirlFriend();
            girl = arr[i];
            sum += girl.getAge();
        }
        int averageAge = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age < averageAge) {
                count++;
                System.out.printf("%S %d %s %s%n", arr[i].name, arr[i].age, arr[i].gender, arr[i].hobby);
            }
        }
        System.out.println(averageAge + " " + count);
    }
}
