public class SurfaceArea
{
	public static void main(String[]args)
	{
		double sideOne, sideTwo, sideThree;
		double areaOne, areaTwo, areaThree;
		double sum, surfaceArea;
		
		sideOne =5;
		sideTwo = 8;
		sideThree = 9;
		
		areaOne = sideOne * sideTwo;
		areaTwo = sideOne * sideThree;
		areaThree = sideTwo * sideThree;
		
		sum = areaOne + areaTwo + areaThree;
		
		surfaceArea = sum * 2;
		
		System.out.println("The surface area of your rectangle is " + surfaceArea + ".");
	}
}