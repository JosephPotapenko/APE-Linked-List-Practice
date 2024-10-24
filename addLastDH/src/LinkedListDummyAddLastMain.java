

import java.util.List;
import java.util.ArrayList;

public class LinkedListDummyAddLastMain {
	
	private static LinkedListDummy list;
	
	
	public static void setUp()  {
		list = new LinkedListDummy();
	}

	
	public static void testAddLastCollectionEmptyList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			
			list.addLast(aList);
			System.out.println("testAddLastCollectionEmptyList - list looks like this: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testAddLastCollectionEmptyList: " + e.getMessage());
		}
		
	}
	
	
	public static void testAddLastThreeItemCollectionFiveItemList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			
			list.addLast(aList);
			System.out.println("testAddLastThreeItemCollectionFiveItemList - list looks like this: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testAddLastThreeItemCollectionFiveItemList: " + e.getMessage());
		}
		
	}
	
	
	public static void testAddLastEmptyCollectionEmptyList() {
		try{
			List aList = new ArrayList();
						
			list.addLast(aList);
			System.out.println("testAddLastEmptyCollectionEmptyList - list looks like this: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testAddLastEmptyCollectionEmptyList: " + e.getMessage());
		}
		
	}
	
	
	public static void testAddLastEmptyCollectionOneItemList() {
		try{
			List aList = new ArrayList();
			
			list.addFirst("first");
			list.addLast(aList);
			System.out.println("testAddLastEmptyCollectionOneItemList - list looks like this: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testAddLastCollectionOneItemList: " + e.getMessage());
		}
		
	}
	
	
	public static void testAddLastNullCollectionOneItemList() {
		try{
			List aList = null;
			
			list.addFirst("first");
			list.addLast(aList);
		}
		catch(Exception e){
			System.out.println("Expected exception " + e.getClass().getSimpleName() + ", " + e.getMessage());
		}
			
				
	}


	public static void main(String[] args) {
		setUp();
		testAddLastCollectionEmptyList();
		setUp();
		testAddLastThreeItemCollectionFiveItemList() ;
		setUp();
		testAddLastEmptyCollectionEmptyList();
		setUp();
		testAddLastEmptyCollectionOneItemList();
		setUp();
		testAddLastNullCollectionOneItemList();
				

	}

}
/*
testAddLastCollectionEmptyList - list looks like this: 
List size is: 3
first
second
third

testAddLastThreeItemCollectionFiveItemList - list looks like this: 
List size is: 8
1
2
3
4
5
first
second
third

testAddLastEmptyCollectionEmptyList - list looks like this: 
List size is: 0

testAddLastEmptyCollectionOneItemList - list looks like this: 
List size is: 1
first

Expected exception IllegalArgumentException, list parameter null on call to addLast
*/
