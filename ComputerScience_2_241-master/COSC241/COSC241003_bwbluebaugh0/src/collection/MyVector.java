/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author bwbluebaugh0
 */
public class MyVector implements Cloneable {
    private Object[] data;
    private static final int INITIAL_CAPACITY = 100;
    protected int size;
    
    
    public MyVector()
    {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }
    
    public void append(Object element)
    {
        if(size == data.length)
        {
            expand();
        }
        data[size++] = element;
    }
    
    
    public void clear()
    {
        for (int i = 0; i < size; ++i)
        {
            removeAt(i);
        }
    }
        
    protected void expand()
    {
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < size; ++i)
        {
            temp[i] = data[i];
        }
        data = temp;
    }
    

    
    public boolean contains (Object element)
    {
        for(int i = 0; i < size; ++i)
        {
            if(element.equals(data[i]))
                return true;
        }
        return false;
    }
    
    public Object elementAt(int index)
    {
        if(index < 0 || index >= size)
        {
            return null;
        }
        else
            return data[index];
    }
    
    public int indexOf(Object element)
    {
        for(int i = 0; i < size; ++i)
        {
            if(element.equals(data[i]))
            {
                return i;
            }
        }
         return -1;
    }
    
    public boolean insertAt(int index, Object element)
    {
        if (index < 0 || index >= size)
        {
            return false;
        }
        if (size == data.length)
        {
            expand();
        }
        for(int i = size; i > index; --i)
        {
            data[i] = data[i-1];
        }
        data[index] = element;
        ++size;
        return true;
    }
    
    public boolean isEmpty()
    {
    for (int i = 0; i < data.length; ++i)
    {
        if(data[i] != null)
        {
            return false;
        }
    }
    return true;
    }
   
    public Object removeAt(int index)
    {
        if(index < 0 || index >= size)
        {
            return null;
        }
        Object temp = data[index];
        while(index < size - 1)
        {
            data[index] = data[index + 1];
            ++index;
        }
        data[--size] = null;
        return temp;
    }
    
    public boolean remove(Object element)
    {
        return removeAt(indexOf(element)) != null;
    }
    
    public boolean replace(int index, Object element)
    {
        if(index < 0 || index >= size)
        {
            return false;
        }
        data[index] = element;
        return true;
    }
    
    public int size()
    {
        return size;
    }
    
    public void ensureCapacity(int minCapacity)
    {
        if(minCapacity <= data.length)
        {
            return;
        }
        else
        {
            Object[] newData = new Object[minCapacity];
            for(int i = 0; i < size; ++i)
            {
                data[i] = newData[i];
            }
        }
    }
    
    @Override
    public MyVector clone()
    {
        MyVector vecCopy = new MyVector();
        vecCopy.ensureCapacity(this.size);
        for(int i = 0; i < size; ++i)
        {
            vecCopy.data[i] = this.data[i];
        }
        vecCopy.size = this.size;
        return vecCopy;
    }
    
    public boolean removeRange(int fromIndex, int toIndex)
    {
        if (fromIndex >= toIndex)
        {
            return false;
        }
        if (fromIndex < 0)
            fromIndex = 0;
        if (toIndex >= size)
            toIndex = size;
        int num = toIndex - fromIndex;
        for(int i = fromIndex; i< size - num; ++i)
        {
            data[i] = data[i+num];
        }
        for(int j = size- num; j < size; ++j)
        {
            data[j] = null;
        }
            size = size - num;
            return true;
    }
    
    public String toString()
    {
        String str = "+++++++++++\n" +
                "the current vector contains the following: \n";
        str += "size = " + size + "\n";
        str += "Capacity = " + data.length + "\n";
        for(int i = 0; i < size; ++i)
        {
            str += i + ":" + data[i] + "\t ";
            if ((i+1) % 5 == 0)
            {
               str += "\n";
            }
        }
        str += "+++++++++++++ \n";
        return str;
    }
    public void reverse()
    {
        Object temp;
        for (int i = 0; i < size/2; ++i) 
        {
            temp = data[i];
            data[i] = data[size - i - 1];
            data[size - 1 - i] = temp;
        }
    }
    
    public void merge(MyVector vector2)
    {
        for (int i = 0; i < vector2.size(); ++i) 
        {
            append(vector2.elementAt(i));
        }
    }
    
    
}
