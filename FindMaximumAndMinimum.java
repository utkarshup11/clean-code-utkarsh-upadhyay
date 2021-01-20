public class FindMaximumAndMinimum
{

	

	//a static class to calculete minimum number 
	static class FindMinimum
	{
				int minimumElement;
	}



	// a class to calculate the maximum element 
	static class FindMaximum
	{
				int maximumElement;
	}




	//method to find minimum number from the list .
	static FindMinimum findMinimum(int listNumbers[] , int lengthOfList)
	{

		FindMinimum findMinimum = new FindMinimum();
		int indexOfList ;


		//when list has only one element 
		if(lengthOfList ==1)
		{
			findMinimum.minimumElement=listNumbers[0];
			return findMinimum;
		}


		//find the minimum from first two elements to compare in below loop 
		if(listNumbers[0]>listNumbers[1])
		{
			findMinimum.minimumElement = listNumbers[1];	
		}
		else
		{
			findMinimum.minimumElement= listNumbers[0];
		}


		//iterate the whole list to find minimum element 
		for( indexOfList=2 ; indexOfList < lengthOfList ; indexOfList++)
		{
			
			if(listNumbers[indexOfList] < findMinimum.minimumElement)
			{
					findMinimum.minimumElement = listNumbers[indexOfList];
			}
		}
		return findMinimum ;

	}




	//method to find maximum number from the list 
	static FindMaximum findMaximum(int listNumbers[] , int lengthOfList)
	{
		FindMaximum findMax = new FindMaximum();
		int indexOfList;

		//when list has only one element 
		if(lengthOfList ==1)
		{
			findMax.maximumElement=listNumbers[0];
			return findMax;
		}


		//find the maximum from first two elements to compare in below loop 
		if(listNumbers[0]>listNumbers[1])
		{
			 findMax.maximumElement = listNumbers[0];
		}
		else
		{
			findMax.maximumElement = listNumbers[1];
	
		}


		//iterate the whole list to find maximums element 
		for( indexOfList=2 ; indexOfList < lengthOfList ; indexOfList++)
		{
			if(listNumbers[indexOfList] > findMax.maximumElement)
			{
				findMax.maximumElement = listNumbers[indexOfList];
			}
			
		}
		return findMax ;

	}


	public static void main(String[] args) 
	{
		int listNumbers[] = {1000, 11, 445 , 1 ,330 ,3000};
		int lengthOfList = 6;
		FindMinimum findMin = findMinimum(listNumbers , lengthOfList);
		FindMaximum findMax = findMaximum(listNumbers , lengthOfList);
		System.out.printf(" Maximum element of the list is %d", findMax.maximumElement);
		System.out.printf(" \n Minimum element of the list is %d \n", findMin.minimumElement);
		
		
	}
}