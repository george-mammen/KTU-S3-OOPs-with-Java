//To show that private variables cannot be accessed outside

class access1 {
	public static void main(String args[]) {
		testclass objectname=new testclass(2,3);
		System.out.println("hello"+objectname.a);
}
}

class testclass {
	private int a=5;
}

// Output : Error - The field testclass.a is not visible.
