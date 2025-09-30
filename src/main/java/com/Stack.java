package com;

class Stack<E> {
  private int size = 0;
  private int maxSize = 5;
  E[] data;

  @SuppressWarnings("unchecked")
  public Stack() {
    this.data = (E[]) new Object[maxSize];
  }

  @SuppressWarnings("unchecked")
  public Stack(int customMaxSize) {
    this.size = 0;
    this.maxSize = customMaxSize;
    this.data = (E[]) new Object[customMaxSize];
  }

  public void push(E element) {
    if (size >= maxSize) {
      throw new IllegalStateException("Can not push. The stack is full");
    }

    data[size] = element;
    size++;
  }
  
  public E pop() {
    if (isEmpty()) {
      throw new IllegalStateException("The stack is empty");
    }

    E top = data[0];

    for(int i = size; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    
    data[size] = null;
    size--;

    return top;
  }

  public E pick() {
    return data[size - 1];
  }

  public int length() {
    return size;
  }

  public int getMaxSize() {
    return maxSize;
  }

  public boolean isFull() {
    return size == maxSize;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void showData() {
    for (int i = maxSize - 1; i >= 0 ; i--) {
      if (this.data[i] != null) {
        System.out.println(this.data[i]);
      }
    }
  }
}

