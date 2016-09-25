import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Rimbalzi extends Applet implements ActionListener {
		
	private Canvas canvas;
		private Button b1, b2;
		public static Panel p;
		
		public void init(){
			canvas=new Canvas();
			setLayout(new BorderLayout());
			add("Center", canvas);
			p= new Panel();
			b1= new Button("Start");
			b1.addActionListener(this);
			b2= new Button("Close");
			b2.addActionListener(this);
			p.add(b1);
			p.add(b2);
			add("South",p);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
				Ball b= new Ball(canvas);
				b.bounce();
			}
			else if(e.getSource()==b2){
				System.exit(0);
			}
		}
}
		
		class Ball{
			private Canvas box;
			private static final int XSIZE = 10;
			private static final int YSIZE = 10;
			private int x = 0; private int y = 0;
			private int dx = 2; private int dy = 2;
			
			public Ball(Canvas c){
				box = c;
		}
			
			public void draw(){
				Graphics g = box.getGraphics();
				g.fillOval(x, y, XSIZE, YSIZE);
				g.dispose();
				
			}
			public void bounce(){
				draw();
				for(int i=1;i>-1;i++){
					move();
					try{
						Thread.sleep(1);
					}
					catch(InterruptedException e){}
				}
			}
			
			public void move(){
				Graphics g= box.getGraphics();
				g.setColor(Color.red);
				//g.setXORMode(box.getBackground());
				//g.
				g.fillOval(x, y, XSIZE, YSIZE);
				x+= dx; y+=dy;
				Dimension d= box.getSize();
				if(x<0){
					x=0; dx=-dx;
				}
				if(x+XSIZE >= d.width){
					x= d.width-XSIZE;
					dx=-dx;
				}
				if(y<0){
					y=0; dy=-dy;
				}
				if(y+YSIZE >= d.height){
					y= d.height-YSIZE;
					dy=-dy;
				
			}
}
		}

