package GrandParent;

public class GrandParent {
	private String name;
	private int noOfAssets;

	
	public GrandParent(String name, int noOfAssets)
	{
		this.name = name;
		this.noOfAssets = noOfAssets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfAssets() {
		return noOfAssets;
	}
	public void setNoOfAssets(int noOfAssets) {
		this.noOfAssets = noOfAssets;
	}
	protected static void Assets() {
		System.out.println("In Grandparent Assets");
	}
	@Override
	public String toString() {
		return "GrandParent [name=" + name + ", noOfAssets=" + noOfAssets + "]\n";
	}  

}
