import java.util.Arrays;

class driver{
	public static void main(String[] args) {
		
		TDTree tree = new TDTree();
		
		// tree.insert(.5,.5);
		// tree.insert(.2,.5);
		// tree.insert(.1,.2);
		// tree.insert(.3,.15);
		// tree.insert(.3,.3);
		// tree.insert(.4,.28);

		// tree.testFindmin();
		// tree.preOrderPrint(tree.root);
		// System.out.println("maxX = " + tree.maxX + "; maxY = " + tree.maxY + "; minX, minY = " + tree.minX + " " + tree.minY);
		// StdDraw.show(0);
		// StdDraw.line(.5,-2,.5,2);
		// StdDraw.line(2,.1,0.5,0.1);
		// StdDraw.show(0);
		
		Point [] balanced = new Point[11];
		balanced[0] = new Point(.5,.5);
		balanced[1] = new Point(.4,.7);
		balanced[2] = new Point(.6,.2);
		balanced[3] = new Point(.1,.1);
		balanced[4] = new Point(.2,.8);
		balanced[5] = new Point(.9,.1);
		balanced[6] = new Point(.8,.3);
		balanced[7] = new Point(.1,.2);
		balanced[8] = new Point(.1,.8);
		balanced[9] = new Point(.5,.8);
		balanced[10] = new Point(.2,.3);
		
		tree = new TDTree(balanced);
		
		tree.preOrderPrint(tree.root);
		tree.delete(new Point(.5,.8));

		
		tree.insert(new Point(.01,.0));
		tree.insert(new Point(.023,.0));
		tree.insert(new Point(.0231,.0));
		tree.insert(new Point(.031,.0));
		tree.insert(new Point(.045,.0));
		tree.insert(new Point(.0465,.0));
		tree.insert(new Point(.07,.0));
		tree.insert(new Point(.533450,.0));
		tree.insert(new Point(.450,.0));
		
		
		tree.preOrderPrint(tree.root);
//		tree.draw();
//		StdDraw.show(1000);
//		tree.reBalance(tree.root);
//		StdDraw.clear();
//		tree.draw();
//		StdDraw.show(0);
//		tree.preOrderPrint(tree.root);
//		System.out.println(tree.size());
//		Arrays.sort(balanced, new PointComparator("x"));
//		 for(int i = 0 ; i < balanced.length; i++){
//		  	  System.out.println(balanced[i]);
//		  	  }
//		 System.out.println("DSF:LSKDJF:LSKDJF:LSKDJ");
//		int size = balanced.length;
//		int mid = size/2;
//		Point[] left = Arrays.copyOfRange(balanced, 0, mid);
//		Point[] right = Arrays.copyOfRange(balanced, mid, size);
//		
//			  for(int i = 0 ; i < left.length; i++){
//			  	  System.out.println(left[i]);
//			  	  }
//			  System.out.println("HOLEYSDLKFJ:LKJE:L");
//			  for(int i = 0 ; i < right.length; i++){
//				  System.out.println(right[i]);
//			  }
//			
		
		
		
		
		
		
		
		
		
		
		
		
		
//		tree.draw();
//		StdDraw.show(1000);
//		StdDraw.circle(.1, .6, .007);
//		System.out.println(tree.nearest(.1,.6));
//		StdDraw.show(1000);
		
//		System.out.println(tree.nearest(.6,.4));
//		StdDraw.circle(.6, .4, .005);StdDraw.text(.65, .4, "1");
//		StdDraw.show(1000);
//		System.out.println(tree.nearest(.7,.8));
//		
//		StdDraw.circle(.7, .25, .005);StdDraw.text(.75, .25, "2");
//		StdDraw.show(1000);
//		System.out.println(tree.nearest(.75,.25));
//		
//		StdDraw.circle(.75, .25, .005);StdDraw.text(.85, .25, "3");
//		StdDraw.show(1000);
//		System.out.println(tree.nearest(.1,.8));
//		StdDraw.circle(.1, .8, .005);StdDraw.text(.15, .8, "4");
//		StdDraw.show(1000);
		
		
//		System.out.println("deleting");
//		tree.delete(.5,.5);
//		StdDraw.clear();
//		tree.draw();
//		tree.preOrderPrint(tree.root);
//		StdDraw.show(1110);
//		tree.delete(.4,.7);
//		StdDraw.clear();
//		tree.draw();
//		tree.preOrderPrint(tree.root);
//		StdDraw.show(1110);
//		tree.delete(.6,.2);
//		StdDraw.clear();
//		tree.draw();
//		tree.preOrderPrint(tree.root);
//		StdDraw.show(1110);
//		tree.delete(.5,.8);
//		StdDraw.clear();
//		tree.draw();
//		tree.preOrderPrint(tree.root);
//		StdDraw.show(1110);
//		if( tree.contains(.8,.3)){
//			System.out.println("teps");
//		}
		// tree.testFindMax();
		// tree.testFindmin();
		// tree.testFindmax();
		
	}
}