// Implementing Multiple Inherit returning Error

class multiple {
	public static void main(String args[]) {
		testclass2 objectname= new testclass2();
        testclass1 objectname1= new testclass1();
        objectname.methodname();
        objectname1.methodname1();
        objectname.methodname2();
     }
   }
 
class testclass {
	int a=5;
	void methodname() {
		System.out.println("hello1"+a);
    }
}

class testclass1 {
	int b=10;
	void methodname1() {
		System.out.println("hello2"+b);
    }
}

class testclass2 extends testclass testclass1 {
	int c=20;
    void methodname2() {
    	System.out.println("hello3"+c);
    }
}

/*Output : '{' expected 
 class testclass2 extends testclass   testclass1 {
                                    ^       */
