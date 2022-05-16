package com.student.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.demo.student;

public class studentdao {
	JdbcTemplate objJDBC;

public JdbcTemplate getobjJDBC() {
	return objJDBC;
}

public void setobjJDBC(JdbcTemplate objJDBC) {
	this.objJDBC = objJDBC;
}
   
   public int save(student stu) {
	   String s="insert into student3(sfirstname,slastname,fathername,mothername,classname,dob,gender,add1,add2,parentcontact,cid) values ('"+stu.getFirstname()+"','"+stu.getLastname()+"','"+stu.getFathername()+"','"+stu.getMothername()+"','"+stu.getClassname()+"','"+stu.getDob()+"','"+stu.getGender()+"','"+stu.getAdd1()+"','"+stu.getAdd2()+"','"+stu.getParentcontact()+"','"+stu.getCid()+"')";
int x;
x=objJDBC.update(s);
	   
	return x;
	   
   }
   public int delete(int id) {
	   String s="delete from student3 where sid=?";
	   int y;
	   y=objJDBC.update(s,id);
	return y;
	   
   }
   public int update(student stu) {
	   String s="update student3 set sfirstname='"+stu.getFirstname()+"',slastname='"+stu.getLastname()+"',fathername='"+stu.getFathername()+"',mothername='"+stu.getMothername()+"',classname='"+stu.getClassname()+"',dob='"+stu.getDob()+"',gender='"+stu.getGender()+"',add1='"+stu.getAdd1()+"',add2='"+stu.getAdd2()+"',parentcontact='"+stu.getParentcontact()+"',cid="+stu.getCid()+" where sid="+stu.getsid();
	int z;
	z=objJDBC.update(s);
	   
	   
	   return z;
	   
   }

}




