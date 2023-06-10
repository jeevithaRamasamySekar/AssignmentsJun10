package org.system;

public class Desktop extends Computer {
public void desktopSize()
{
	System.out.println("My Desktop size is 1280×720");
}
public static void main(String[] args) 
{
	Desktop dt=new Desktop();
	dt.computerModel();
	dt.desktopSize();
}
}

