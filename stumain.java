package com.student.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.studentdao;
import com.student.demo.student;

public class stumain {

	public static void main(String[] args) {
		ApplicationContext objac=new ClassPathXmlApplicationContext("newfile.xml");
		studentdao objed=(studentdao) objac.getBean("edao");
		student stu=new student();
		
		Scanner sc=new Scanner(System.in);
	while(true) {	
		int ch;
	
		System.out.print("press 1 for insert 2 for delete 3 for update");
		ch=sc.nextInt();
		sc.nextLine();
		
	
			
		
	switch(ch) {	
	case 1:	
		
		String a="";
		String b="";
		String c="";
		String d="";
		String e="";
		String f="";
		String g="";
		String h="";
		String i="";
		
		String k="";
		String l="";
		int cid;
	while(true) {
	
		System.out.print("enter first name");
		a=sc.nextLine();
		System.out.print("enter last name");
		b=sc.nextLine();
		System.out.print("enter father name");
		c=sc.nextLine();
		System.out.print("enter mother name");
		d=sc.nextLine();
		System.out.print("enter classname");
		e=sc.nextLine();
		System.out.print("enter dob");
		f=sc.nextLine();
		System.out.print("enter gender");
		g=sc.nextLine();
		System.out.print("enter add1");
		h=sc.nextLine();
		System.out.print("enter add2");
		i=sc.nextLine();
	
		
		System.out.print("enter parentcontact");
		k=sc.nextLine();
		System.out.print("enter city id");
		cid=sc.nextInt();

		
		stu.setFirstname(a);
		stu.setLastname(b);
		stu.setFathername(c);
		stu.setMothername(d);
		stu.setClassname(e);
		stu.setDob(f);
		stu.setGender(g);
		stu.setAdd1(h);
		stu.setAdd2(i);
	
	
		stu.setParentcontact(k);
		stu.setCid(cid);
		
		System.out.println("data inserted"+objed.save(stu));
	      if(ch==0) {
	break;
	      } break;}
	      case 2:
	    	int  id=sc.nextInt();
			System.out.println("deleted"+objed.delete(id));
		
		break;
	      case 3:
	    	int sid;
	  		System.out.print("enter first name");
	  		a=sc.nextLine();
	  		System.out.print("enter last name");
	  		b=sc.nextLine();
	  		System.out.print("enter father name");
	  		c=sc.nextLine();
	  		System.out.print("enter mother name");
	  		d=sc.nextLine();
	  		System.out.print("enter classname");
	  		e=sc.nextLine();
	  		System.out.print("enter dob");
	  		f=sc.nextLine();
	  		System.out.print("enter gender");
	  		g=sc.nextLine();
	  		System.out.print("enter add1");
	  		h=sc.nextLine();
	  		System.out.print("enter add2");
	  		i=sc.nextLine();
	  		System.out.print("enter parent contact");
	  		k=sc.nextLine();
			System.out.print("enter city id");
			cid=sc.nextInt();
			System.out.println("enter id");
			sid=sc.nextInt();
			
			
			stu.setFirstname(a);
			stu.setLastname(b);
			stu.setFathername(c);
			stu.setMothername(d);
			stu.setClassname(e);
			stu.setDob(f);
			stu.setGender(g);
			stu.setAdd1(h);
			stu.setAdd2(i);
	  		stu.setParentcontact(k);
			stu.setCid(cid);
			stu.setsid(sid);
			System.out.println("uodated"+objed.update(stu));
			
		
		}
		break;
	}
	}
}

