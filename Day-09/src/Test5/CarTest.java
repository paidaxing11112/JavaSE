package Test5;

import java.util.Scanner;

/**
 * @author gan
 *
 * CarTest类用于测试汽车的创建和属性设置。
 */
public class CarTest {
    /**
     * 主方法，程序入口。
     * 创建汽车数组，获取用户输入的汽车信息，并打印汽车的品牌、价格和颜色。
     */
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }
        for (Car car : arr) {
            System.out.println(car.getBrand() + " " + car.getPrice() + " " + car.getColor());
        }
    }
}
