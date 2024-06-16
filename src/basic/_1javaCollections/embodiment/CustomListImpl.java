package basic._1javaCollections.embodiment;

import basic._1javaCollections.blueprint.CustomAbstractList;
import basic._1javaCollections.blueprint.CustomList;

public class CustomListImpl<E> extends CustomAbstractList<E> implements CustomList<E> {
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean add(E e) {
        super.ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    @Override
    public E remove(int index) {
        super.rangeCheck(index);
        E oldValue = super.elementData(index);
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(elements, index+1, elements, index, numMoved);
        }
        elements[--size] = null; // GC가 요소를 정리할 수 있게 함.
        return oldValue;
    }

    @Override
    public E get(int index) {
        super.rangeCheck(index);
        return super.elementData(index);
    }

    @Override
    public E set(int index, E element) {
        super.rangeCheck(index);
        E oldValue = super.elementData(index);
        elements[index] = element;
        return oldValue;
    }
}
