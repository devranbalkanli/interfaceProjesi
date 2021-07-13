
public class Mudur implements Okul {
	
	   protected double maas;
	   protected String isim,departman;
	   
        public Mudur(String isim,String departman,double maas) {
			this.isim=isim;
			this.departman=departman;		
			this.maas=maas;
		}
		
		public double getMaas() {
			return maas;
		}
		
		public void print() {
			System.out.println("isim:"+isim+ "\tdepartman:"+departman);
			
		}

	}


