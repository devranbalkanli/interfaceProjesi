import java.util.Scanner;

public class TestProje {

	public static void main( String[]args ) {
		
		Okul o[]=new Okul[3];
		
		Mudur m=new Mudur("Ali Kaya","Y�netim",10000);
		Ogretmen ogr=new Ogretmen("Filiz G�n�lta�","E�itim","Matematik",130,12);
		Bekci b=new Bekci("�brahim Toz,","Hizmet",150,7);
		
		o[0]=m;
		o[1]=ogr;
		o[2]=b;
		
		for(int i=0; i<o.length;i++) {
			o[i].print();
			System.out.println("Maas:"+o[i].getMaas());
		}
		
		System.out.println("***************");
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Mudur icin 0,Ogretmen icin 1,Bekci icin 2'ye basiniz");
		int a=input.nextInt();
		System.out.println("Maas:"+o[a].getMaas());
		}
}
