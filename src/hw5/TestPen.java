package hw5;

public class TestPen {
	public static void main(String[] args) {
		Pen [] p = new Pen[2];
		p[0] = new Pencil("木筆",60, 60);
		p[1] = new InkBrush("墨黑",120,120);
		for(int i=0;i<p.length;i++) {					
			p[i].showInfo();
			p[i].write();	
		}
		
	}

}
