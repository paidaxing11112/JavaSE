package Text;

import java.util.Random;
import java.util.Scanner;

/**
 * Text11类用于模拟双色球彩票的中奖过程
 */
public class Text11 {
    /**
     * 主程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 生成中奖号码
        int[] arr = createNumber();
        // 打印中奖号码
        System.out.print("----------------------");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("----------------------");
        System.out.println();
        // 获取用户输入的号码
        int[] userInputarr = userInputNumber();
        // 初始化红球和蓝球中奖计数器
        int redCount = 0;
        int blueCount = 0;
        // 检查红球中奖情况
        for (int i = 0; i < userInputarr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (userInputarr[i] == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        // 检查蓝球中奖情况
        if (arr[arr.length - 1] == userInputarr[userInputarr.length - 1]) {
            blueCount++;
        }
        // 打印中奖结果
        System.out.println("红球中奖个数为" + redCount + "，蓝球中奖个数为" + blueCount);
        // 根据中奖情况打印奖金
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你，中奖3000");
        }else if((redCount == 5 && blueCount == 0) ||  (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中奖200");
        }else if((redCount == 4 && blueCount == 0) ||  (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中奖10");
        }else if((redCount == 2 && blueCount == 1) ||  (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }

    /**
     * 获取用户输入的彩票号码
     * @return 用户输入的彩票号码数组
     */
    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        // 输入红球号码
        for (int i = 0; i < arr.length - 1;) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <=33) {
                if (!repeat(arr,redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前号码已存在,请重新输入");
                }
            } else {
                System.out.println("号码超出范围,请重新输入");
            }
        }
        // 输入蓝球号码
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("号码超出范围,请重新输入");
            }
        }
        return arr;
    }

    /**
     * 生成中奖彩票号码
     * @return 生成的中奖彩票号码数组
     */
    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        // 生成红球号码
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;
            if (!repeat(arr,redNumber)) {
                arr[i] = redNumber;
                i++;
            }
        }
        // 生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    /**
     * 检查号码是否重复
     * @param arr 彩票号码数组
     * @param num 待检查的号码
     * @return 如果号码重复返回true，否则返回false
     */
    public static boolean repeat(int[] arr, int num) {
        for (int j : arr) {
            if (num == j) {
                return true;
            }
        }
        return false;
    }
}
