package generics.generic_class;

public class CustomMap<K, V> {

    private K key;

    private V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }

    public V get(K key){
        if(key.equals(this.key)){
            return value;
        }
        return null;
    }

}
