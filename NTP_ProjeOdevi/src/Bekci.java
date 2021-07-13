
public class Bekci implements Okul {
	
	protected String isim,departman;
	protected int saat;
	protected double birimUcret;
	
	public Bekci(String isim,String departman,int saat,double birimUcret){
		this.isim=isim;
		this.departman=departman;
		this.saat=saat;
		this.birimUcret=birimUcret;
	}
	
	public double getMaas() {
		return 5*saat*birimUcret;
	}
	
    public void print() {
		System.out.println("isim:"+isim+ "\tdepartman:"+departman+ "\tsaat:"+saat+ "\tbirimUcret:"+birimUcret);
	}

}
