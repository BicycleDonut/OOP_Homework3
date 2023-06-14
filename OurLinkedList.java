package OOPhw03LinkedList;

import java.util.Iterator;

public class OurLinkedList<T> implements Iterable<T> {
    private Element<T> head;
    private Element<T> tail;
    int listSize;

    public OurLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T data){
        Element<T> ourElement = new Element<>(data);
        if ( listSize == 0){
            head = ourElement;
        }
        else {
            tail.next = ourElement;
            ourElement.previous = tail;
        }
        tail = ourElement;
        listSize++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Element<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }


    public class Element<T>{ //создаем встроенный класс Element с объявленным типом данных

        private T value;            // у него будет значение обявленного типа (то, что мы будем класть)
        private Element<T> next;        // ссылка на следующий эл-т
        private Element<T> previous;    // ссылка на предыдущий эл-т

        public Element(T value) {
            this.value = value;
            next = null;
            previous = null;
        }

    }

}

