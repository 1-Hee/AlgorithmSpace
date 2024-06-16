package basic._1javaCollections.blueprint;

public interface CustomList<E> {

    // 요소 추가
    boolean add(E e);
    // 요소 삭제
    E remove(int index);
    // 인덱스로 요소 가져오기
    E get(int index);
    // 요소 설정 (덮어쓰기)
    E set(int index, E element);
    // 배열 확장 메서드

}
