package javaSEProgramCourse;

public class IfStatement {
	public static void main(String[] args) {

		int x = 1, y = 1, z = 0;
		if (x == y | x < ++y) {
			z = x + y;
		} else {
			z = 1;
		}
		System.out.println(z);
	}
}
