package average;
import java.util.Scanner;
class jisuan {
    //计算求和的方法
    public static int sum(int[] he) {
        int sum = 0;
        for (int j : he) {
            sum += j;
        }
        return sum;
    }
    //求出数组内的最大值并返回
    public static int max(int[] he) {
        int max = 0;
        for (int j : he) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    //求出数组内的最小值并返回
    public static int min(int[] he) {
        int min = he[0];
        for (int j : he) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    //求出数组内去掉最大最小值后的平均值
    public static double aver(int[] he) {
        double  aver = 0;
        int sum = 0;
        for (int j : he) {
            sum += j;
        }
        //去掉最大最小值
        sum -= max(he);
        sum -= min(he);
        return (double)sum / (he.length - 2);
    }


}
public class Main {
    public static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] he = new int[num];
        double sum = 0;
        for (int i = 0; i < num; i++) {
            he[i] = sc.nextInt();
        }
        System.out.println("sum=" + jisuan.sum(he));
        System.out.println("max=" + jisuan.max(he));
        System.out.println("min=" + jisuan.min(he));
        System.out.println("aver=" + String.format("%.2f", jisuan.aver(he)));
    }
}



