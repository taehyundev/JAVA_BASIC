package pb3;

public class Won2Dollar extends Converter{
	public Won2Dollar(int dollar) {
		// TODO Auto-generated constructor stub
		this.ratio = dollar;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
			
		return "´Þ·¯";
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "¿ø";
	}
}
