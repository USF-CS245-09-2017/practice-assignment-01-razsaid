public class Fibonacci {

	//function to determine the type of method execution
		public int fibonacci (int n,String t){
			if (t.equals("iterative")){
				return fibonacci_iterative(n);
			} else if (t.equals("recursive")){
				return fibonacci_recursive(n);
			}
			return -1;
		}

		//iterative fibonacci function
		public int fibonacci_iterative (int n){
			if (n<=1){
				return n;
			} else {
				int prev=0, current = 1, temp=1;
				for (int nth_location=2; nth_location<=n;nth_location++){
					temp=current;
					current+=prev;
					prev=temp;

				} 
				return current;
			}
		}


		//recursive fibonacci function
		public int fibonacci_recursive (int n){
			if (n<=1){
				return n;
			} else{
				return fibonacci_recursive(n-2)+fibonacci_recursive(n-1);
			}
		}

	
}