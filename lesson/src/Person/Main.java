package Person;

import java.util.Objects;
import java.util.Scanner;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        //该类含有姓名和年龄两个属性，定义该类的构造方法、getter与setter方法、toString方法
        this.name = name;
        this.age = age;
    }
    public void getter() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
    public void setter(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
}

class Student extends Person {
    //选修课数，定义该类的构造方法并调用父类Person的构造方法、getter与setter方法、toString方法
    int courseNum;

    public Student(String name, int age, int courseNum) {
        super(name, age);
        this.courseNum = courseNum;
    }
    @Override
    public String toString() {
        return name + "是学生," + age + "岁,这学期共选了" + courseNum + "门课";
    }
}

class Teacher extends Person {
    //教学科目，定义该类的构造方法并调用父类Person的构造方法、getter与setter方法、toString方法。
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public String toString() {
        return name + "是老师," + age + "岁,教" +subject;
    }
}

/**
 * @author gan
 */
public class Main {
    //从键盘输入人员类型（Teacher或Student），输入人员姓名、年龄和特有属性，最后输出其类型、年龄、选修课程数或者教什么课程
    public static void main(String[] args) {
        String type;
        Scanner sc = new Scanner(System.in);
        type = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        if (Objects.equals("Teacher", type)) {
            String subject = sc.next();
            Teacher teacher = new Teacher(name, age, subject);
            System.out.println(teacher);
        } else {
            int courseNum = sc.nextInt();
            Student student = new Student(name, age, courseNum);
            System.out.println(student);
        }
    }
}
