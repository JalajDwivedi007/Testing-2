package collect;
@FunctionalInterface
interface inter1{ //This is a functional interface
	//Only one method inside this interface
//	void disp();
	int add(int a,int b);
//	void disp1();
}
public class lambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
//		inter1 in=new inter1() {
//			public void disp() {
//				System.out.println("Hello!");
//			}
//		};
//		in.disp();
		
		//Lambdas example
		inter1 in1=(a,b)->{
			System.out.println("Hello!!"+(a+b));
			return a+b;
		};
		System.out.println(in1.add(4,5));

	}

}
