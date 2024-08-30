package linkedlist;

import java.util.HashMap;

public class Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Not a pointer -----------------------------------------------------------------------------------------------------------------------
		int num1 = 11;
		int num2 = num1;
		
		System.out.println(num1); // 11
		System.out.println(num2); // 11

		
		num1 = 22;
		
		System.out.println(num1); // 22
		System.out.println(num2); // 11
		// This is how it works when you are not working with a pointer
		// num1 && num2 will not remain equal forever, its only at the time we're initializing num2
		// any changes later would show they are independent of each other.  
		// -------------------------------------------------------------------------------------------------------------------------------------
		// uses a pointer ----------------------------------------------------------------------------------------------------------------------
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		map1.put("value", 11);
		map2 = map1;
		
		System.out.println(map1); // {value=11}
		System.out.println(map2); // {value=11}
		
		map1.put("value", 22);
		
		System.out.println(map1); // {value=22}
		System.out.println(map2); // {value=22}
		// This is how it works when you are working with a pointer
		// map1 && map2 are pointing to the same hashmap
		// any changes will reflect on both
		// the variable is just pointing to the hashmap, but can be used to point order in a linked-list
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// When getting into linked lists, both head and tail will serve as pointers.  
		// Each of the items in the liked list will point to each other with pointers. 
		
		
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
//		Thinking piece / Learning 
//		= 
//		pionting to an identical *value  || 
//		pointing to the exact same *value in memory (when comparing) ||
//		pointing to a value, just pointing (head, next, tail)

//		With Linked-lists nodes: 
//		A node is both the value and the pointer.
//		In very simple ways, `next` = next node
		
	}

}
