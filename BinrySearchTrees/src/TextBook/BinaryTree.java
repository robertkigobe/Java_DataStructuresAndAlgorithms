package TextBook;

import java.util.Optional;

public interface BinaryTree<K,V> {
    void put(K key,V value);

    Optional<V> get(K key);
}
