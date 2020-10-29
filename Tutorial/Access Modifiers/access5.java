//To show that protected variables cannot  be accessed classes other than subclasses

class access5 {
	public static void main(String args[]) {
		demo1 objectname1=new demo1();
		objectname1.methodname1();
}
}

class demo {
	protected int a=5;
}

class demo1 extends demo { //subclass 
	void methodname1() {
		System.out.println("hello"+a);
}
}

class demo2{ //not a subclass
	void methodname1() {
		System.out.println("hello"+a);
}
}

/* Output - a cannot be resolved to a variable (demo 2) 
   hello5 returned from class demo1*/
