package construct;

public class Const {
	
	public String ename;
	public int eid;
	
	

	public Const(String ename, int eid) {
		super();
		this.ename= ename;
		this.eid = eid;
	}



	public static void main(String[] args) {
		
		Const e1=new Const("Lokesh",101);

		Const e2=new Const("Sivasai",102);

		Const e3=new Const("Baveesh",103);
		System.out.println(e1.ename+""+e1.eid);
		System.out.println(e2.ename+""+e2.eid);
		System.out.println(e3.ename+""+e3.eid);
		
		
		

	}

}
