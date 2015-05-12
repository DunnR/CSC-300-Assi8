import java.util.Scanner;


public class Tower 
{
	private Disc top;
	private Tower[] tower = new Tower[3];
	
	public Tower()
	{
		top = null;
	}
	
	public Disc peek()
	{
		return top;
	}
	
	public Disc removeDisc() //pop
	{
		Disc nodeToReturn = top;
		if(this.top != null)
		{
			top = top.getNextDisc();
		}
		return nodeToReturn;
	}
	
	public boolean addDisc(Disc d) //push
	{
		if(this.top == null)
		{
			top = d;
			return true;
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top);
			top = d;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		if(this.top == null)
		{
			System.out.println("Empty Tower");
		}
		else
		{
			Disc curr = this.top;
			do
			{
				System.out.println(curr.getSize());
				curr = curr.getNextDisc();
			}
			while(curr != null);
		}
		
	}
	
	
	public void index0Init()
	{
		
		for(int i = 3; i > 0; i--)
		{
			while(this.tower[0] != null)
			{
			Disc curr = this.top;
			this.tower[0].addDisc(curr.getNextDisc());
			}
		}
		System.out.println(this.tower[0]);
		
	}
	
	public void on()
	{

		
	}
	
}
