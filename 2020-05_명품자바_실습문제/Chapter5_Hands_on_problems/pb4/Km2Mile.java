package pb4;

public class Km2Mile extends Converter{
public Km2Mile(double km) {
	// TODO Auto-generated constructor stub
	ratio = km;
}
	@Override
protected double convert(double src) {
	// TODO Auto-generated method stub
	return src/ratio;
}
@Override
protected String getDestString() {
	// TODO Auto-generated method stub
	return "mile";
}
@Override
protected String getSrcString() {
	// TODO Auto-generated method stub
	return "Km";
}
}
