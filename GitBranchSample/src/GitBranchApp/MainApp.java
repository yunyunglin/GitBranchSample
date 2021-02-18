package GitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Version");
		
		Math cMath = new Math();
		System.out.println(cMath.add(1, 2));
	}
	
}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}
