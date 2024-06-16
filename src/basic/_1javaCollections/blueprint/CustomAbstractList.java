package basic._1javaCollections.blueprint;

import java.util.Arrays;

//AbstractList<E>
//        implements List<E>,
public abstract class CustomAbstractList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected Object[] elements;

    // default constructor
    public CustomAbstractList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    // 크기 지정 생성자
    public CustomAbstractList(int initSize){
        if(initSize < 0){
            throw new IllegalArgumentException("init Size must bigger than zero..!");
        }
        elements = new Object[initSize];
    }


    // 크기 반환
    abstract public int size();
    // 요소가 비어있는지 확인
    abstract public boolean isEmpty();

    // 배열 확장 메서드
    protected void ensureCapacity(int minCapacity){
        if(minCapacity > elements.length){
            int newCapacity = elements.length * 2;
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }

    }

    // 범위 체크 메서드
    protected void rangeCheck(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index : " + index + "Size : " + size);
        }
    }

    @SuppressWarnings("unchecked")
    protected E elementData(int index){
        return (E) elements[index];
    }

}
