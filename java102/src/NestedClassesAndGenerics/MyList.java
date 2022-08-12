package NestedClassesAndGenerics;

import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;


    public MyList(int capacity) {
        this.capacity = capacity;
        size = 0;
        this.array = (T[]) new Object[capacity];
    }

    public MyList(){
        this.capacity = 10;
        size = 0;
        this.array = (T[]) new Object[this.capacity];
    }

    public int size(){
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data){
        this.array[this.size] = data;
        this.size++;

        if (this.size > this.capacity/2){
            enhanceCapacity();
        }
    }

    public T get(int index){
        if (isOutIndex(index)){
            return null;
        }
        return this.array[index];
    }

    public T remove(int index){
        if (isOutIndex(index)){
            return null;
        }
        T temp = this.array[index];
        for (int i = index; i < size(); i++){
            this.array[i] = this.array[i+1];
        }
        this.size--;
        return temp;
    }

    public T set(int index, T data){
        if (isOutIndex(index)){
            return null;
        }
        return this.array[index] = data;
    }

    public int indexOf(T data){
        for (int i = 0; i < this.size; i++){
            if (this.array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = size() - 1; i >= 0; i--) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public T[] toArray(){
        return this.array;
    }

    public void clear(){
        this.capacity = 10;
        this.size = 0;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start, int finish){
        if (isOutIndex(start) || isOutIndex(finish)){
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++){
            subList.add(this.array[i]);
        }
        return subList;
    }

    public boolean contains(T data){
        for (int i = 0; i < this.size; i++){
            if (this.array[i] == data){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++){
            sb.append(this.array[i]);
            sb.append(",");
        }
        if (this.size > 0){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");

        return sb.toString();
    }

    private boolean isOutIndex(int index){
        if (index < 0 || index >= this.size){
            return true;
        }
        return false;
    }

    private void enhanceCapacity(){
        T[] temp = (T[]) new Object[this.capacity * 2];
        for (int i = 0; i < this.array.length; i++){
            temp[i] = this.array[i];
        }
        this.array = temp;
        this.capacity *= 2;
    }
}
