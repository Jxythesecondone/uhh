package fact;

public class F {

	public static int fact(int n) {
		int f=1;
		for(int i=1; i<=n; i++) {
			f=f*i;
		}
		return f;
	}
}