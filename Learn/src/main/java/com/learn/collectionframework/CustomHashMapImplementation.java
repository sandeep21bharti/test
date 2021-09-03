package com.learn.collectionframework;

class CustomHashMap<k, v> {

	private final int HASH_MAP_SIZE = 16;

	private Entry table[] = null;

	public CustomHashMap() {
		table = new Entry[HASH_MAP_SIZE];
	}

	
	
	
	public v put(k key, v value) {
		
		//Find the bucket of new Entry by hashcode().
		int buketIndex=key.hashCode();
		//Initialize reference variable of type Entry<k,v> for comparing  the all entry of the linked list in the index ,if past entries stored..
		Entry<k,v>existingEntry=table[buketIndex]; // May be table[buketIndex] is null if no entry added yet or may be not null if any entry added.
		
		for(;existingEntry!=null;existingEntry =existingEntry.next) {
			
			if(existingEntry.getKey().equals(key)) {
				
				//means key already exit, we will replace with new value and return old value.
				System.out
				.println("duplicate key found, replacing existing key "
						+ key + ",  value with new  value " + value);
				v oldValueofNode=existingEntry.getValue();
				existingEntry.setValue(value);//replace by  new value.
				return oldValueofNode;
			}else {
				System.out.println("Collision detected.. ");
				
			}
			
		}
		
		 //Add new node in the Linked list.(its either a new_pair/collision, add it to the map)
		 System.out.println("PUT adding key:" + key + ", value:" + value+ " to the list");
		 Entry<k,v>newEntry=new Entry<k,v>(key, value);
		 newEntry.next=table[buketIndex]; // table[buketIndex] may be null if no element  added yet at this index  or may be not null ,added any entry.
		 table[buketIndex]=newEntry;// attaching new entry at the begining of table and assign the new entry to the last node of linkedlist.
         		
		return null;

	}
	
	public Entry get(k key) {
		//Find the bucket of this key  by hashcode().
		int buketIndex=key.hashCode();
		
		Entry<k,v>existing=table[buketIndex];
		
		while(existing!=null) {
			if(existing.getKey().equals(key)) {
				return existing;
				
			}else {
				existing=existing.next;
			}
		}
		return null; // if no key exist .
	}
		
		
	
}

class Entry<k, v> {
	k key;
	v value;
	Entry<k,v> next;
	
	public Entry(k key ,v value) {
		this.key=key;
		this.value=value;
		next=null;
	}

	public k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	public v getValue() {
		return value;
	}

	public void setValue(v value) {
		this.value = value;
	}

	public Entry getNext() {
		return next;
	}

	public void setNext(Entry next) {
		this.next = next;
	}

}

class Scholar {
	private String name;
	private int id;

	public Scholar( int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id % 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Scholar scholar = (Scholar) obj;

		return scholar.name.equals(this.name) && scholar.id == this.id;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Scholar [name=" + name + ", id=" + id + "]";
	}

}

public class CustomHashMapImplementation {

	public static void main(String[] args) {
		CustomHashMap<Scholar,String> map=new CustomHashMap<>();


		System.out.println("============== Adding Element ===================");
		Scholar e1 = new Scholar(100, "Niranjan");
		map.put(e1, "dept1");

		// duplicate
		System.out.println("============== Adding Duplicate ===================");
		Scholar e1_dup = new Scholar(100, "Niranjan");
		map.put(e1_dup, "dept12");
		
		// the above value "dept12" should replace the old value "dept1"
		Entry e = map.get(e1_dup);
		System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

		
		
		  System.out .println("============== Adding Elements ===================");
		  Scholar e2 = new Scholar(102, "Sravan"); map.put(e2, "dept3");
		  
		  // collision with e2
		  System.out.println("============== Adding Collisions ===================");
		  Scholar e2_collision = new Scholar(112, "Chandu"); map.put(e2_collision,
		  "dept16");
		  
		  e = map.get(e2_collision);
			System.out.println("GET element - " + e.getKey() + "::" + e.getValue());
		 
		/*
		 * // the above value "dept12" should replace the old value "dept1" Entry e =
		 * map.get(e1_dup); System.out.println("GET element - " + e.getKey() + "::" +
		 * e.getValue());
		 * 
		 * System.out .println("============== Adding Elements ===================");
		 * Scholar e2 = new Scholar(102, "Sravan"); map.put(e2, "dept3");
		 * 
		 * Scholar e3 = new Scholar(104, "Ananth"); map.put(e3, "dept2");
		 * 
		 * Scholar e4 = new Scholar(106, "Rakesh"); map.put(e4, "dept5");
		 * 
		 * Scholar e5 = new Scholar(108, "Shashi"); map.put(e5, "dept2");
		 * 
		 * // collision with e2 System.out
		 * .println("============== Adding Collisions ==================="); Scholar
		 * e2_collision = new Scholar(112, "Chandu"); map.put(e2_collision, "dept16"); e
		 * = map.get(e2_collision); System.out.println("GET element - " + e.getKey() +
		 * "::" + e.getValue());
		 * 
		 * // collision with e3 Scholar e3_collision = new Scholar(114, "Santhosh");
		 * map.put(e3_collision, "dept9"); e = map.get(e3_collision);
		 * System.out.println("GET element - " + e.getKey() + "::" + e.getValue());
		 * 
		 * System.out
		 * .println("============== Adding Duplicate in Collision ===================");
		 * Scholar e3_collision_dupe = new Scholar(124, "Santhosh");
		 * map.put(e3_collision_dupe, "dept91"); e = map.get(e3_collision_dupe);
		 * System.out.println("GET element - " + e.getKey() + "::" + e.getValue());
		 */
		
		

	}

}
