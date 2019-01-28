public class Factorial{

	//function to determine the type of method execution
	public int factorial (int n, String t){
		if (t.equals("iterative")){
			return factorial_iterative(n);
		} else if (t.equals("recursive")){
			return factorial_recursive(n);
		}
		return -1;
	}

	//iterative factorial function
	public int factorial_iterative(int n){
		if (n<=1){
			return 1;
		} else{
			int output = n;
			for (int count=1; count<n;count++ ){
				output*=(n-count);
			}
			return output;
		}
	}

	//recursive factorial function
	public int factorial_recursive(int n){
		if (n<=1){
			return 1;
		} else{
			return n*factorial_recursive(n-1);
		}
	}
}