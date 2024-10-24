package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
import java.util.Scanner;  
  
public class ParityFeatureValueOptimized {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int binaryValue = 0; // 用于存储二进制表示的整数  
        int position = 1; // 数位从1开始  
        int tempNumber = number;  
  
        while (tempNumber > 0) {  
            int digit = tempNumber % 10; // 获取当前个位数字  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 == 1 && position % 2 == 1)) {  
                // 如果数字和数位的奇偶性相同，则将当前二进制位设置为1  
                binaryValue |= (1 << (position - 1)); // 使用位运算将对应位置为1  
            }  
            tempNumber /= 10; // 去掉当前个位数字，继续处理下一位  
            position++; // 数位递增  
        }  
  
        // 输出计算结果  
        System.out.println(binaryValue);  
    }  
}
        System.out.println(result);
    }
}
