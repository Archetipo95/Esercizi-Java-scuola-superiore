public class Trapezio 
{
	private double basemaggiore, baseminore,altezza,area;
	public void area()
		{
			area=(basemaggiore+baseminore)*altezza/2;
		}
	public Trapezio (double BM, double bm, double A)
		{
			basemaggiore= BM;
			baseminore=bm;
			altezza=A;
		}
	public void set_basemaggiore (double BM)
			{
				basemaggiore=BM;
			}
	public void set_baseminore (double bm)
			{
				baseminore=bm;
			}
	public void set_altezza (double A)
			{
				altezza=A;
			}
	public double get_area()
			{
			area();	
			return area;
			}


}
