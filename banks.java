package org.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HDFCpojo h=new HDFCpojo();
      h.readDataFormDataBase();
      h.setcusId(123098);
      h.setPassword("Ram@123");
      h.setAccNo(0);
      h.setBalance(1);
      h.setTrHistory("2");
      
      HDFCpojo h1=new HDFCpojo();
      h1.readDataFormDataBase();
      h1.setcusId(123099);
      h1.setPassword("Anand@123");
      h1.setAccNo(0);
      h1.setBalance(1);
      h1.setTrHistory("2");
	}
	HDFCpojo h2=new HDFCpojo();
    h2.readDataFormDataBase();
    h2.setcusId(123100);
    h2.setPassword("Babu@123");
    h2.setAccNo(0);
    h2.setBalance(1);
    h2.setTrHistory("2");
    
  List<HDFCpojo> li =new ArrayList();
  li.add(h);
  li.add(h1);
  li.add(h2);
}
  System.out.println("=======User defined List =======");
  for(int i=0; i<li.size();i++) {
	  HDFCpojo hdfcpojo=li.get(i);
	  System.out.println(s.getAccNo()+" "+hdfcpojo.getBalance()+" "+hdfcpojo.getTrHistory());
	}
     set<HDFCpojo> si=new LinkedHashSet();
     si.add(h);
     si.add(h1);
     si.add(h2);
}
     System.out.println("======User defined set==========");
     for(HDFCpojo s:si) {
   	  HDFCpojo hdfcpojo=li.get(i);
   	  System.out.println(s.getAccNo()+" "+hdfcpojo.getBalance()+" "+hdfcpojo.getTrHistory());
   	}
       Map<Integer,HDFCpojo> m=LinkedHashMap();
       m.put(10,h);
       m.put(20,h1);
       m.put(30,h2);
       
       System.out.outln("======user derined map========");
       Collection<HDFCpojo> values=m.values();
       for(HDFCpojo s:values) {
    	   System.out.println(s.getAccNo()+" "+hdfcpojo.getBalance()+" "+hdfcpojo.getTrHistory());
       }
       }
       }
