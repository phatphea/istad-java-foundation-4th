package generics.generic_class;

public class Box<T> {

    private T t;

    public T getT(){
        return this.t;
    }

    public void setT(T t){
        this.t = t;
    }

}
