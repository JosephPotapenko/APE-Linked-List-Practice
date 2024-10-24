

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class LinkedListDummyAddLastTests {
	
	private static LinkedListDummy list;
	
	@Before
	public void setUp() throws Exception {
		list = new LinkedListDummy();
	}

	@Test
	public void testAddLastCollectionEmptyList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			
			list.addLast(aList);
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddLastCollectionEmptyList: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testAddLastThreeItemCollectionFiveItemList() {
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
			assertEquals("List size is: 8\r\n1\r\n2\r\n3\r\n4\r\n5\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddLastThreeItemCollectionFiveItemList: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testAddLastEmptyCollectionEmptyList() {
		try{
			List aList = new ArrayList();
						
			list.addLast(aList);
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddLastEmptyCollectionEmptyList: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testAddLastEmptyCollectionOneItemList() {
		try{
			List aList = new ArrayList();
			
			list.addFirst("first");
			list.addLast(aList);
			assertEquals("List size is: 1\r\nfirst\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddLastCollectionOneItemList: " + e.getMessage());
		}
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddLastNullCollectionOneItemList() {
		
			List aList = null;
			
			list.addFirst("first");
			list.addLast(aList);
			
				
	}


}

