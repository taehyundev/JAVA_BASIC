package pb10;

public class Dictionary extends PairMap{
	private int size;
	private int top;
	public Dictionary(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		top =0;
		super.keyArray =new String[size];
		super.valueArray =new String[size];
	}
	public int search(String key) {
		for(int i=0; i< size; i++) {
			if(key.equals(super.keyArray[i])) return i; 
		}
		return -1;
	}
	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		int index = search(key);
		if(index==-1) return null;
		
		super.keyArray[index] = null;
		String rtnValue = super.valueArray[index];
		super.valueArray[index] = null;
		//System.out.println(rtnValue);
		return rtnValue;
		
	}
	@Override
   String get(String key) {
		int index = search(key);
		if(index == -1)
			return null;
		
		return super.valueArray[index];
      
   }
	@Override
	int length() {
		// TODO Auto-generated method stub
		return top;
	}
	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		super.keyArray[top] = key;
		super.valueArray[top] = value;
		top++;
	}
}
