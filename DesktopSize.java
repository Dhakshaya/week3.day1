package week3.day1;

public class DesktopSize extends Computer{
public void desktopSize()
{
	int inches = 24;
	System.out.println(inches);
	
}

public static void main(String[] args) {
	
	DesktopSize desktopSizeObj = new DesktopSize();
	desktopSizeObj.computerModel();
	desktopSizeObj.desktopSize();
	
}
}
