package pb9;

public class StringStack implements Stack{
	private String[] s;
	private int size;
	private int top;
	public StringStack(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		s = new String[size];
		top = 0;
	}
	
	@Override
	public int capacity() {
		//저장가능한 갯수
		return size-top;
	}
	@Override
	public int length() {
		return top;
	}
	@Override
	public String pop() {
		return s[--top];
	}
	@Override
	public boolean push(String val) {
		if(capacity() == 0)return false;
		s[top] = val;
		top++;
		return true;
	}

}
