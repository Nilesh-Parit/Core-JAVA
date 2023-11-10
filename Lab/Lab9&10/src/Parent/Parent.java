package Parent;

import GrandParent.GrandParent;

public class Parent extends GrandParent
{
	
	public Parent(String name, int noOfAssets, int parentAssets) {
		super(name, noOfAssets);
		this.parentAssets = parentAssets;
	}

	public int getParentAssets() {
		return parentAssets;
	}

	public void setParentAssets(int parentAssets) {
		this.parentAssets = parentAssets;
	}

	private int parentAssets;
	
	void parentAssets() {
		  System.out.println("In parents Specific Assets");
		  GrandParent.Assets();
	  }

	@Override
	public String toString() {
		return super.toString()+"Parent [parentAssets=" + parentAssets + "]\n";
	}
	
}
