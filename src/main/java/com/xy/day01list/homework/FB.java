package com.xy.day01list.homework;

import java.util.Scanner;

/**
 * @author: JackXiao
 * Date:  2022/3/13  19:25
 */
public class FB {
	public static int fb(int n){


		if (n == 0){
			return 0;
		}


		if (n == 1){
			return 1;
		}


		return (fb(n-1) + fb(n-2));
	}



	public static void main(String[] args) {

		System.out.println("请输入您要查找的斐波拉契数列的第几项：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = fb(n);
		System.out.println("您要查找的斐波拉契数列的第"+n+"项，"+"值为："+value);

	}
}
