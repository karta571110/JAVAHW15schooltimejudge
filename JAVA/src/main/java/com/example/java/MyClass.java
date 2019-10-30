package com.example.java;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        while (true){
            int h,m;
            System.out.println("請輸入現在的時間(24小時制): 時 分");
            h=scanner.nextInt();
            m=scanner.nextInt();
            if(h>23 || h<0 || m<0 || m>59){
                System.out.println("妳確定有這種時間?");

            }
            else if(h<7 || h==7 && m<30 || h>=17 ){
                System.out.println("現在是放學時間!");
            }
            else if(m>=30 && h>=7 && h<17 || h>7 && h<17){
                System.out.println("現在是上學時間!");
            }

        }
    }
}
