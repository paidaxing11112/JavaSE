import com.google.code.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // 创建一个简单的Java对象，比如一个Person类对象
        Person person = new Person("John", 30, "New York");
        Gson gson = new Gson();
        // 使用toJson方法将Person对象转换为JSON字符串
        String jsonString = gson.toJson(person);
        System.out.println(jsonString);
    }
}

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // 省略getter和setter方法
}