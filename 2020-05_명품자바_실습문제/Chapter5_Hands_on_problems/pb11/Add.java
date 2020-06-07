package pb11;

public class Add extends Calc{
	public Add(int n,int m) {
		// TODO Auto-generated constructor stub
		setValue(n, m);
	}
	
	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}
}
