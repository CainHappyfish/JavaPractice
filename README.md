# JavaPractice

这里存放java的作业。

## Practice-1

编程作业一：

编写一个输出9×9乘法表的程序。

```
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
```

 ![image-20230903102312856](D:\Documents\Desktop\WOW\JavaPractice-main\README.assets\image-20230903102312856.png)

编程作业二：

需要设计一个统计多个班级平均成绩的程序。该程序要求如下：

1）显示自己的姓名学号作为程序信息。

2）用一个不规则的二维数组保存各个班级输入的成绩，每个成绩用double表示。

3）实现一个可抛出的自定义异常，它显示输入的成绩非法（成绩合法值在0到100间）

4）一个函数用于读取一个班级的成绩，每输入一项成绩就检查成绩是否合法，不合法抛出自定义异常。

5）让用户依次输入每个班级的成绩，输入完一个班级后即计算并打印该班级的平均成绩。这里需要捕获自定义的成绩不合法异常，且要求计算和打印在finally中完成。

6）最后计算所有班级一起的平均成绩，并打印出来。