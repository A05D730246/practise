package daoEx;

public class memberDaoImpl implements memberDao{

	public static void main(String[] args) {
		memberDaoImpl md=new memberDaoImpl();
		
		md.add("teacher","ccc");//.add(String name);
		
		//md.add(new member("tt","sss"));
		//.add(member(m));
		/*member m=new member("ee");
		md.add(m);*/
		
		

	}

	@Override
	public void add(String name,String address) {
		System.out.println("name="+name+"\taddress:"+address);
		
	}

	@Override
	public void add(member m) {
		System.out.println("name="+m.getName()+"\taddress:"+m.getAddress());
		
	}

}