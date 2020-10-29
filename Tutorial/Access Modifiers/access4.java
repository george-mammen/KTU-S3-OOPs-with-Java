//To show that protected variables can be accessed by subclasses

class access4 {
	public static void main(String args[]) {
		testclass1 objectname1=new testclass1();
		objectname1.methodname1();
}
}

class testclass {
	protected int a=5;
}

class testclass1 extends testclass {
	void methodname1() {
		System.out.println("hello"+a);
}
}

// Output - hello5