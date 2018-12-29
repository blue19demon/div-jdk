package com.lando.dp;

public class LinkedList<E> implements Collection<E>{

	private Node<E> head;
	private Node<E> tail;
	private int size;
	@Override
	public void add(E o) {
		Node<E> node=new Node<E>(o, null);
		if(head==null) {
			head=node;
			tail=node;
		}
		tail.setNext(node);
		tail=node;
		size++;
	}
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public Iterator iterator() {
		return new Iterator() {
			private Node<E> currentNode=head;
			@Override
			public Object next() {
				E object = currentNode.getValue();
				currentNode=currentNode.getNext();
				return object;
			}
			
			@Override
			public boolean hasNext() {
				return currentNode!=null;
			}
		};
	}
}
