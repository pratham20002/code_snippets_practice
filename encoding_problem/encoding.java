package encoding_problem;

public class encoding {
	private int x;
	private int data, key;
	
	encoding(int data, int key)
	{
		System.out.println("Data fetched...!: "+ data  + " "+ key);
		
		
		this.data = data;
		this.key = key;
//		System.out.println(data % 10);
	
	}
	
	public int logic()
	{
		if(Integer.toString(data).length() < key)
		{
			while(true)
			{
				if(Integer.toString(data).length() > key)
					break;
				this.key = key - Integer.toString(data).length();
			}
		}
		int x = Integer.toString(data).length() - key;
		System.out.println(x);
		return Integer.parseInt(Integer.toString(data % (int)Math.pow(10, x)).concat(Integer.toString(data / (int)Math.pow(10, x))));
	}

}
