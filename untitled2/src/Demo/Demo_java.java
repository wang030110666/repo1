package Demo;

import java.util.Scanner;

public class Demo_java {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int index=3;
        String[] name=new String[index];
        int[] age=new int[index];
        int[] score=new int[index];

        for (int i = 0; i < 3; i++) {
            System.out.printf("请输入第%d个学生的姓名：",i+1);
            name[i]=scanner.next();
            System.out.printf("请输入第%d个学生的年龄：",i+1);
            age[i]=scanner.nextInt();
            System.out.printf("请输入第%d个学生的成绩：",i+1);
            score[i]=scanner.nextInt();
        }

        for (int j = 0; j < 3; j++) {

            System.out.printf("第%d位学生的姓名是：%s\n",j+1,name[j]);
            System.out.printf("第%d位学生的姓名是：%d\n",j+1,age[j]);
            System.out.printf("第%d位学生的姓名是：%d\n",j+1,score[j]);

        }

    }

}
