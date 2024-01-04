package sample;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		user u = new user();

		Scanner sc = new Scanner(System.in);

		System.out.println("輸入名");

		String name = sc.next();

		System.out.println("輸入地址");

		String address = sc.next();

		u.setName(name);

		u.setAddress(address);

		System.out.println("名:" + u.getName() + "\t地址:" + u.getAddress());

	}
}
