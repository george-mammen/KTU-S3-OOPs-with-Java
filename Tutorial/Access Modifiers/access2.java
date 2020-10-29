class access2 {
	public static void main(String args[]) {
		testclass obj = new testclass();
		obj.method();
}
}

class testclass {
	private int a=5;
	void method() {
		System.out.println("hello"+a);
}
}

// Output - hello5