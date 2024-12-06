package Vehicle;

class Vehicle {
    int speed;
    String kind;
    String color;

    Vehicle() {
        speed = 30;
        kind = "freightTrans";
        color = "black";
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setKind(String kind) {
        this.kind = kind;
    }

    int getSpeed() {
        return speed;
    }

    String getColor() {
        return color;
    }

    String getKind() {
        return kind;
    }
}

class Bus extends Vehicle {

    int passengerNum;
    String driver;

    Bus() {
        passengerNum = 30;
        kind = "passTrans";
        color = "black";
    }

    void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    void setDriver(String driver) {
        this.driver = driver;
    }

    int getPassenger() {
        return passengerNum;
    }

    String getDriver() {
        return driver;
    }
}

public class Main {
    public static void main(String[] args) {
        //创建一个Bus对象
        Bus bus = new Bus();
        bus.setDriver("zhang");
        bus.setPassengerNum(50);
        bus.setSpeed(100);
        bus.setColor("yellow");
        //打印公交车的信息，包括类型、司机、乘客数、速度和颜色
        System.out.printf("%s %s %d %d %s", bus.kind, bus.getDriver(), bus.getPassenger(), bus.getSpeed(), bus.getColor());
    }
}
