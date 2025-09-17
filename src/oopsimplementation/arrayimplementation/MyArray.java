package oopsimplementation.arrayimplementation;

public class MyArray<T> {

    T[] Array = null;
    int size;

    public MyArray() {
        this.size = 0;
        Array = (T[]) new Object[16];
    }

    public void add(T element)
    {
        if(size == Array.length)
            resize();

        Array[size++] = element;
    }

    public void resize() {
         T[] reSizedArray = (T[]) new Object[Array.length * 2];
         int index = 0;
         for (T element : Array)
         {
             reSizedArray[index++] = element;
         }

         Array = reSizedArray;
    }

    public int size()
    {
        int count = 0;
        for ( T element : Array){
            count++;
        }
        return count;
    }


    public T get(int index)
    {
        if(index > Array.length)
            System.out.println("Index is not in range...");


        return Array[index];
    }

    public void display()
    {
        for(T element : Array)
        {
            if(element != null)
            System.out.print(element +" ");
        }
        System.out.println();
    }



}
