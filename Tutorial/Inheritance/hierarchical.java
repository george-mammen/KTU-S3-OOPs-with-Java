// Hierarchical Inheritance 

class hierarchical {
	public static void main(String args[]) {
		demo1 obj= new demo1();
		demo2 obj1= new demo2();
        obj.methodname();
        obj.methodname1();
        obj1.methodname2();
     }
   }
 class demo {
	 int a=5;
	 void methodname() {
		 System.out.println("hello1"+a);
    }
}

 class demo1 extends demo {
	 int b=10;
	 void methodname1() {
		 System.out.println("hello2"+b);
    }
}

 class demo2 extends demo {
	 int c=20;
	 void methodname2() {
		 System.out.println("hello3"+c);
    }
}

 /* Output : hello15
             hello210
             hello320
 */
