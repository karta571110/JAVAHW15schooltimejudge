package com.example.java;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        while (true){
            int h,m;
            System.out.println("�п�J�{�b���ɶ�(24�p�ɨ�): �� ��");
            h=scanner.nextInt();
            m=scanner.nextInt();
            if(h>23 || h<0 || m<0 || m>59){
                System.out.println("�p�T�w���o�خɶ�?");

            }
            else if(h<7 || h==7 && m<30 || h>=17 ){
                System.out.println("�{�b�O��Ǯɶ�!");
            }
            else if(m>=30 && h>=7 && h<17 || h>7 && h<17){
                System.out.println("�{�b�O�W�Ǯɶ�!");
            }

        }
    }
}
