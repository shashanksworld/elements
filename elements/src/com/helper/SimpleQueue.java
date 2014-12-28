/*
 * @author:shashanksworld
 * @version: 1.1 
 */
package com.helper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue<E> extends LinkedList<E>  {
	
	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		
		return this.addAll(arg0);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while(!this.isEmpty())
		{
			this.remove();
		}
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterator<E> getIterator()
	{
		// TODO Auto-generated method stub
		return this.listIterator();
	}


	public E remove() {
		// TODO Auto-generated method stub
		
		return this.removeLast();
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		this.addFirst(e);
		return true;
	
	}
	public E pop()
	{
		return this.removeLast();
	}

	
	

}
