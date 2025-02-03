package generics_ArrayList;

public class Customarraylist {
    private int[] array;
    private int defaultsize=10;
    private int size=0;
    Customarraylist(){
        array =new int[defaultsize];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        array[size++]=num;
    }
    public boolean isFull(){
        return size == array.length;
    }
    private void resize(){
        int[] temp =new int[array.length*2];

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
        Customarraylist list = new Customarraylist();
        list.display();
        list.add(5);
        for (int i=0;i<15;i++){
            list.add(2*i);
        }
        list.display();

    }
}
