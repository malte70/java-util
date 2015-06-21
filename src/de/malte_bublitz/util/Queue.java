/*
 * Queue
 *
 * Copyright (c) 2014 Malte Bublitz, http://malte-bublitz.de
 * All rights reserved.
 *
 * Usage:
 * <code>
 * Queue q = new Queue();
 * q.enqueue(42);
 * q.enqueue("Hello world");
 * q.enqueue(3.141592);
 * q.getLength() => 3
 * q.dequeue()   => 42
 * q.dequeue()   => "Hello world"
 * </code>
 */

package de.malte_bublitz.util;


public class Queue {
	private int currentLength;
	private Element firstElement;
	
	class Element {
		public Object data = null;
		public Element nextElement = null;
	}
	
	public void enqueue(Object newData) {
		Element newElement = new Element();
		newElement.data = newData;
		if (this.currentLength == 0) {
			this.firstElement = newElement;
		} else {
			this.getLastElement(this.firstElement).nextElement = newElement;
		}
		this.currentLength++;
	}
	
	public Object dequeue() throws IllegalArgumentException {
		if (this.currentLength == 0) {
			throw new IllegalArgumentException("Y u do dis?");
		}
		Element newFirstElement = this.firstElement.nextElement;
		Element deQueuedElement = this.firstElement;
		this.firstElement = newFirstElement;
		this.currentLength--;
		return deQueuedElement.data;
	}
	
	private Element getLastElement(Element startElement) {
		return startElement.nextElement == null ? startElement : this.getLastElement(startElement.nextElement);
	}
	
	public boolean isEmpty() {
		return this.currentLength == 0;
	}
	
	public int getLength() {
		return this.currentLength;
	}
	
	public Queue() {
		this.currentLength = 0;
		this.firstElement = null;
	}
}

