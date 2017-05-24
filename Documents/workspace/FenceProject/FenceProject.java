
public class FenceProject {
public static void main(String[] args) {
	int len = 10;
	int wid = 10;
	int woodFencePerimeter = (2*len)+(2*wid);
	int woodAmount = 25;
	int sumWood = woodFencePerimeter*woodAmount;
	int cLen = 0;
	int cWid = 0;
	int chainFencePerimeter = (2*cLen)+(2*cWid);
	int chainAmount = 0;
	int sumChain = chainFencePerimeter*chainAmount;
	int gatePrice = 150;
	int numGates = 1;
	if (numGates<1)
	{
		numGates = 1;
	}
	int sumGates = gatePrice*numGates;
	double permit = 50.00;
	double taxRate = .06;
	double SumWithTax = sumWood+sumChain+sumGates+(sumWood+sumChain+sumGates)*taxRate;
	double cost = SumWithTax+permit;
	System.out.println("The total cost is $"+cost);
	
}
}
