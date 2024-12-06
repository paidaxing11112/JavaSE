package Test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr= new Goods[3];
        Goods g1 = new Goods("001","mate70",5000,120);
        Goods g2 = new Goods("002","xiaomi13",4000,50);
        Goods g3 = new Goods("003","iqoo",3000,520);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < 3; i++) {
            Goods goods = arr[i];
            System.out.printf("%s %s %.2f %.2f%n", goods.getId(), goods.getName(), goods.getPrize(), goods.getPrize());
        }
    }
}
