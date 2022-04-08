/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapLTHDTlopao;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class taxmanagement {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	Student a = new Student();
	Worker b = new Worker();
	BusinessPerson c = new BusinessPerson();
	a.nhap();
	b.nhap();
	c.nhap();
	System.out.print("Thue cua student "+ a.name+ " la: " + a.payTax(0, 1, 0) );
	System.out.print("Thue cua worker "+b.name+ " la: " + b.payTax(0, 1, 0) );
	System.out.print("Thue cua business person"+c.name+" la: " + c.payTax(0, 1, 0) );
	}
}


