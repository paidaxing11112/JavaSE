package Test8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "大军", 18);
        Student stu2 = new Student(2, "大明", 25);
        Student stu3 = new Student(3, "大红", 76);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Student stu4 = new Student(4, "大pao", 44);
        boolean flag = contains(arr, stu4.id);
        if (flag) {
            System.out.println("id重复");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                arr = creatNewArr(arr);
                arr[count] = stu4;
                printArr(arr);
            } else {
                arr[count] = stu4;
                printArr(arr);
            }
        }
        System.out.println("请输入要删除的ID");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();

        if(index(arr,ID) >= 0) {
            arr[index(arr,ID)] = null;
            printArr(arr);
        } else {

            System.out.println("sinxibucunzai");
        }
        if(index(arr,2) >= 0) {
            arr[index(arr,2)].setAge(arr[index(arr,2)].age + 1); ;
        }
        else {
            System.out.println("无此ID");
        }
        printArr(arr);

    }
    public static int index(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].id == id) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].id + " " + arr[i].name + " " + arr[i].age);
            }
        }
    }
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }

        }
        return false;
    }

}
