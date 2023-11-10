package Child;

import GrandParent.GrandParent;
import Parent.Parent;

	public class Child extends Parent
	{
		private int childAssets;
		
		public Child(String name, int noOfAssets, int parentAssets, int childAssets) {
			super(name, noOfAssets, parentAssets);
			this.childAssets = childAssets;
		}

		void childAssets()
		{
			  System.out.println("In child Specific Assets");
			  GrandParent.Assets();
			  Parent.Assets();
		  }

		public int getChildAssets() {
			return childAssets;
		}

		public void setChildAssets(int childAssets) {
			this.childAssets = childAssets;
		}

		@Override
		public String toString() {
			return super.toString()+"Child [childAssets=" + childAssets + "]\n";
		}  

	}
