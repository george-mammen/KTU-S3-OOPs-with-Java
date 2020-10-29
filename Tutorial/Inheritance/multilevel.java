// Multilevel Inheritance

class multilevel {
	public static void main(String args[]) {
		testclass2 objectname= new testclass2();
		objectname.methodname();
		objectname.methodname1();
		objectname.methodname2();
     }
   }
 
class test {
	int a=5;
	void methodname() {
		System.out.println("hello1"+a);
    }
}

class test1 extends test {
	int b=10;
	void methodname1() {
		System.out.println("hello2"+b);
    }
}

class testclass2 extends test1 {
	int c=20;
	void methodname2() {
		System.out.println("hello3"+b);
    }
}

/* Output : hello15
            hello210
            hello310
  */
