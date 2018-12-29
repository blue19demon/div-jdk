package com.lando.dp.iterator;

public class TestCase {

	public static void main(String[] args) {
		testLinkedList();
	}

	public static void testHashMap() {
		HashMap<String, String> map=new HashMap<>();
		map.put("aa", "asd");
		map.put("bb", "bnm");
		map.put("cc", "cvb");
		System.out.println(map.size());
		System.out.println(map.get("bb"));
	}

	public static void testLinkedList() {
		Collection<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 12; i++) {
			ll.add(i + 1);
		}
		System.out.println("ll.size()=" + ll.size());
		Iterator iterator=ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void testArrayList() {
		Collection<String> al = new ArrayList<String>();
		for (int i = 0; i < 22; i++) {
			al.add("aa"+i + 1);
		}
		System.out.println("al.size()=" + al.size());
		Iterator iterator=al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
