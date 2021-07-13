
public class Ogretmen implements Okul{
	    
	    protected String isim,departman;
	    protected int saat;
		protected double birimUcret;
		protected String brans;
		
		public Ogretmen(String isim,String departman,String brans,int saat,double birimUcret){
			this.isim=isim;
			this.departman=departman;
			this.brans=brans;
			this.saat=saat;
			this.birimUcret=birimUcret;
			}
		
		public double getMaas() {
			return 5*saat*birimUcret;
		}
		
	    public void print() {
			
			System.out.println("isim:"+isim+  "\t departman:"+departman+ "\tbrans:"+brans+ "\tsaat:"+saat+ "\tbirimUcret:"+birimUcret);
		}

}
