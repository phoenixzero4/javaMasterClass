package section8;


public class ReverseArray{
	private static void reverse(int[] x) {
		int[] y = new int[x.length];
		System.out.print("Array = [");
		for(int i = 0, j = x.length-1; i < x.length; i++, j--) {
			if(i < (x.length -1)) {
				System.out.print(x[i] + ", ");
			}else {
				System.out.println(x[i] + "]");
			}
			y[j] = x[i];
		}
		x=y;
	       System.out.print("Reversed array = [");
	       for(int i = 0; i < x.length; i++){
	           if(i < (x.length-1)){
	               System.out.print(x[i] + ", ");
	           }else{
	               System.out.println(x[i] + "]");
	           }
	       }
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		reverse(a);
	}
}
