package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {
		double x = 180;
		double r = 60;
		
		double flaecheninhalt = (x/360)* r * r * Math.PI - 0.5 * r * r * Math.sin(x/(180/Math.PI));
		
		double hoehe = r - (r * Math.cos((x/2)/(180/Math.PI)));
		
		double bogenlaenge = r * Math.PI * x/180;
		
		double schnittlaenge = 2 * Math.sqrt(r*r-(r-hoehe)*(r-hoehe));
				
		System.out.println("Der Fl�cheninhalt = "+ flaecheninhalt);
		System.out.println("Die H�he = " + hoehe);
		System.out.println("Die Bogenl�nge = " + bogenlaenge);
		System.out.println("Die Schnittl�nge = " + schnittlaenge);
		
		
		// TODO Auto-generated method stub

	}

}
