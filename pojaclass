package org.base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCpojo {
	private int cusId;
	
	private String password;
	
	private int accNo;
	
	private int balance;
	
	private String trHistory;
	
	Map<String,ArrayList<String>>m;
	public void setcusId(int a) {
		if(a==123098) {
			cusId=1;
		}
		else if(a==123099) {
			cusId=2;
		}
		else if(a==123100) {
			cusId=3;
		}
		else {
			cusId=0;
		}
	}
public void setPassword(String b) {
	if(b.equals("Ram@123")&& cusId==1) {
		password="Ram Account is Validated";
	}
	 else if(b.equals("Anand@123")&& cusId==2) {
		password="Anand Account is Validated";
	}
	 else if (b.equals("Babu@123")&& cusId==3){
		password="Babu Account is Validated";
	}
	else {
		password="Invalid Account";
	}
}
	public void setAccNo(int c) {
		if(c==0 && password.equals("Ram Account is Validated")) {
			ArrayList<String>arrayList=m.get("Ram Account is Validated");
			String string=arrayList.get(0);
			accNo=Integer.parseInt(string);
		
	}
		else if(c==0 && password.equals("Anand Account is Validated")) {
			ArrayList<String>arrayList=m.get("Anand Account is Validated");
			String string=arrayList.get(0);
			accNo=Integer.parseInt(string);
		
	}
		if(c==0 && password.equals("Babu Account is Validated")) {
			ArrayList<String>arrayList=m.get("Babu Account is Validated");
			String string=arrayList.get(0);
			accNo=Integer.parseInt(string);
	}
		else {
			accNo=0;
		}
		public void setBalance(int d) {
			if(d==1 && passsword.equals("Ram Account is Validated")) {
				ArrayList<String>arrayList=m.get("Ram Account is Validated");
				String string=arrayList.get(0);
				balance=Integer.parseInt(string);
			}
			else if(d==0 && password.equals("Anand Account is Validated")) {
				ArrayList<String>arrayList=m.get("Anand Account is Validated");
				String string=arrayList.get(0);
				balance=Integer.parseInt(string);
			
		}
			else if(d==0 && password.equals("Babu Account is Validated")) {
				ArrayList<String>arrayList=m.get("Babu Account is Validated");
				String string=arrayList.get(0);
				balance=Integer.parseInt(string);
		}
			else {
				balance=0;
			}
			
		
}
		public void setHistory(String e) {
			if(e.equals("2") && passsword.equals("Ram Account is Validated")) {
				ArrayList<String>arrayList=m.get("Ram Account is Validated");
				String string=arrayList.get(0);
				trHistory=string;
		}
			else if(e.equals("2") && password.equals("Anand Account is Validated")) {
				ArrayList<String>arrayList=m.get("Anand Account is Validated");
				String string=arrayList.get(0);
				trHistory=string;
			}
			else if(e.equals("2") && password.equals("Babu Account is Validated")) {
				ArrayList<String>arrayList=m.get("Babu Account is Validated");
				String string=arrayList.get(0);
				trHistory=string;
		}
			else {
				trHistory=null;
			}
		}
		public int getCusId() {
			return cusId;
		}
		public String getPassword() {
			return password;
		}
		public String getAccNo(){
			return AccNo;
		}
		public int getBalance() {
			return balance;
			
		}
		public String getTrHistory() {
			return trHistory;
		}
		public void readDataFormDataBase() throws IOException {
			File f=new File("C:\\java\\bin\\encaplactions\\extar\\data base.txt");
			List<String> readLine=FileUtils.readLine(f);
		m=new LinkedHashMap();
		for(int i=0;i<readLines.size();i++) {
			String individualLine=readLines.get(i);
			String[] split =individualLine.split(",");
			if(split[0].equals("123098")) && split[1].equals("Ram@123"){
				ArrayList<String> a1=new ArrayList();
				a1.add(split[2]);
				a1.add(split[3]);
				a1.add(split[4]);
				m.put("Ram Account is Validated", a1);
			}
			else if(split[0].equals("123099")) && split[1].equals("Ram@123"){
				ArrayList<String> a2=new ArrayList();
				a2.add(split[2]);
				a2.add(split[3]);
				a2.add(split[4]);
				m.put("Anand Account is Validated", a2);
			}
			else if(split[0].equals("123100")) && split[1].equals("Ram@123"){
				ArrayList<String> a3=new ArrayList();
				a3.add(split[2]);
				a3.add(split[3]);
				a3.add(split[4]);
				m.put("Babu Account is Validated", a3);
			}
			else{
				m.put("InValid Account", null);
			}
		}
	}
}
