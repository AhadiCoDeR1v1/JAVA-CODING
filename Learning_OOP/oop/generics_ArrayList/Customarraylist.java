package generics_ArrayList;

public class Customarraylist<T> {

//    so just this is a generic arraylist so that I can control what to add is it to add A integer or AN string  so it help in this way
    private Object[] array;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    Customarraylist(){
        array =new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        array[size++]=num;
    }
    public boolean isFull(){
        return size == array.length;
    }
    private void resize(){
        Object[] temp =new Object[array.length*2];

        for (int i=0;i<array.length;i++){
            temp[i] = array[i];


        }
        array=temp;
    }
    public void display(){
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
//        Customarraylist list = new Customarraylist();
//        list.display();
//        list.add(5);
//        for (int i=0;i<15;i++){
//            list.add(2*i);
//        }
//        list.display();
        Customarraylist<String>  list = new Customarraylist<>();
        for (int i=0;i<15;i++){
            list.add("abfd");
        }
        list.display();

    }
}
