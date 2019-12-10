package week3.day2.classroom;

public interface Browser {

	public void locateElement(String locator);
	
	public String getTitle();
	
	public void close();
}
