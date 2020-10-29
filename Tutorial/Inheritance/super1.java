//To show  working of super keyword

class super1 {
	public static void main(String args[]) {
		testclass1 obj= new testclass1();
		obj.methodname();
     }
   }
 
class testclass {
	int a=5;
	void methodname() {
		System.out.println("hello1"+a);
    }
}

class testclass1 extends testclass {
	int b=15;
	void methodname() {
		super.methodname();
		System.out.println("hello2"+b);
    }
}