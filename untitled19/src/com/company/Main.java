package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double total;
	Scanner input=new Scanner(System.in);
	System.out.print("how many KMs : ");
	double km= input.nextDouble();
	System.out.print( "Age: ");
	int age = input.nextInt();
	System.out.print("Type of Travel: 1- round trip 2-one way");
   int choose= input.nextInt();
   total= km*0.1 ;

if ((km>0) && (age>0)&& (choose==1 || choose==2)){
    System.out.println("Normal price: "+total);
if(age<12){
    total=(total/2);
 System.out.print("discounted price:"+total); }
 if(age>12&& age<24) {
    total-=(total*0.1);
    System.out.print("discounted price:"+total); }
 if(age>65){
    total-=(total*0.3);
    System.out.print("discounted price:"+total);
    }
    if(choose==1){
        total-=(total*0.2);
        System.out.print("discounted price:"+total);
    } }
else {
    System.out.print("Try Again ");

}

    }





}
