package device_detail;

import java.util.Scanner;

public class Device2 {
	public static void main(String[] args) {
		
		Device1 d = new Device1();
		
		Scanner sc = new Scanner(System.in);
		
		
		

	       

	        System.out.println("Enter Device ID:");
	        d.setDeviceid(sc.nextInt());

	        System.out.println("Enter Device Name:");
	        d.setDevicename(sc.next());

	        System.out.println("Enter Device OS:");
	        d.setDeviceos(sc.next());

	        System.out.println("Enter Device Version:");
	        d.setDeviceversion(sc.next());

	        System.out.println("Enter Device Manufacturing Date:");
	        d.setDevicemfgdate(sc.next());

	        System.out.println("Enter Device IMEI Code:");
	        d.setDeviceImeicode(sc.next());

	        System.out.println("Enter RAM:");
	        d.setRam_detail(sc.next());

	        System.out.println("Enter Device Type:");
	        d.setDevicetype(sc.next());

	        System.out.println("Enter Password:");
	        d.setPassword(sc.next());

	        System.out.println("Confirm Password:");
	        d.setConfirmpassword(sc.next());

	        if (d.getPassword().equals(d.getConfirmpassword())) {

	            System.out.println("\nPassword matched!");

	            System.out.println("Device ID: " + d.getDeviceid());
	            System.out.println("Device Name: " + d.getDevicename());
	            System.out.println("Device OS: " + d.getDeviceos());
	            System.out.println("Device Version: " + d.getDeviceversion());
	            System.out.println("Manufacturing Date: " + d.getDevicemfgdate());
	            System.out.println("IMEI Code: " + d.getDeviceImeicode());
	            System.out.println("RAM: " + d.getRam_detail());
	            System.out.println("Device Type: " + d.getDevicetype());

	        } else {

	            System.out.println("Password and Confirm Password do not match.");
	        }
	    }
	}

