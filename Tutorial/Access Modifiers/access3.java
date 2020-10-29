//To show that private functions cannot be accessed outside

class access3 {
	public static void main(String args[]) {
		test objectname=new test();
		objectname.methodname();
}
}

class test {
	private int a=5;
	private void methodname() {
		System.out.println("hello"+a);
}
}

// Output - The method methodname() from the type test is not visible