package basic._1javaCollections;

import basic._1javaCollections.blueprint.CustomList;
import basic._1javaCollections.embodiment.CustomListImpl;

public class CollectionTest {

    public static void main(String[] args) {

        CustomList<Integer> array = new CustomListImpl<>();
        for(int i = 0 ; i < 10 ; i++){
            array.add(i);
        }
        for(int i = 0 ; i < 10 ; i ++){
            System.out.println("number is => "+i+" : "+array.get(i));
        }

    }
}
