package com.lando.dp.iterator;

@SuppressWarnings("unchecked")
public class HashMap<K, V> {

	private Entity<K,V>[] table = null;

	private static final int INIT_SIZE = 8;

	private int size=0;
	public HashMap() {
		super();
		table = new Entity[INIT_SIZE];
	}

	public int size() {
		return size;
	}
	
	public V put(K k, V v) {
		int hash = k.hashCode();
		int index = hash % INIT_SIZE;
		addEntity(k, v, index);
		for (Entity<K, V> entity = table[index]; entity.next!= null; entity = entity.next) {
             if(entity.k.equals(k)) {
            	 V oldVlue=entity.v;
            	 entity.v=v;
            	 return oldVlue;
             }
		}
		return null;
	}

	public void addEntity(K k, V v, int index) {
		Entity<K, V> entity = new Entity<K, V>(k, v, table[index]);
		table[index] = entity;
		size++;
	}

	public V get(K k) {
		int hash = k.hashCode();
		int index = hash % INIT_SIZE;
		for (Entity<K, V> entity = table[index]; entity!= null; entity = entity.next) {
             if(entity.k.equals(k)) {
            	 return entity.v;
             }
		}
		return null;
	}

	@SuppressWarnings("hiding")
	class Entity<K, V> {
		public K k;
		public V v;
		public Entity<K, V> next;
		public Entity(K k, V v,Entity<K, V> next) {
			super();
			this.k = k;
			this.v = v;
			this.next = next;
		}

		public Entity() {
			super();
		}

	}
}
