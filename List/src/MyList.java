public class MyList <T>{

    private T[] list;
    private int size;
    private int capacity;

    public MyList(){
        this(10);
    }


    public MyList(int capacity) {
        this.list=(T[]) new Object[capacity];
        this.size =0;
        this.capacity=capacity;
    }

    public int size(){
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add (T data){
        if (size == capacity){
            kapasiteyiArttir();
        }
        list[size]=data;
        size++;
    }

    public void kapasiteyiArttir(){
        int yeniKapasite=capacity*2;
        T[] yeniListe = (T[]) new Object[yeniKapasite];
        System.arraycopy(list, 0, yeniListe, 0, size);
        list = yeniListe;
        capacity=yeniKapasite;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            return null;
        }
        T deger = list[index];
        System.out.println(index + ". indisteki değer: " + deger);
        return deger;

    }

    public T remove(int index){
        if (index < 0 || index >= size){
            return null;
        }
        T deger = list[index];
        for (int i = index; i < list.length -1; i++){
            this.list[i] = this.list[i+1];
        }

        System.out.println("Silinen Değer: " + deger);
        size--;
        return deger;

    }

    public T set(int index, T data){
        if (index < 0 || index >= size){
            return null;
        }

        System.out.println(list[index] + " yerine " + data + " geldi.") ;
        list[index] = data;
        return data;
    }


    public int indexOf(T data){
        for (int i = 0; i < size; i++){
            if (data == list[i]){

                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int i = size; i< list.length; i--){
            if (data == list[i]){
                return i;
            }

        }
        return -1;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }
    public T[] toArray(){
        T[] Object = (T[]) new Object[size];
        for (int i =0; i<size; i++){

            Object[i] =list[i];
        }
        return  Object;

    }
    public void clear(){
        for (int i = 0; i<size; i++){

           list[i] = null;
        }
        size = 0;

    }

        public MyList<T> subList(int start, int finish) {
            MyList<T> newList = new MyList<>();
            if (!(start==0 || finish >= size || start>finish)){

                for (int i = start-1; i <= finish; i++) {
                    newList.add(list[i]);
                }

            }
            return newList;

        }

        public boolean contains(T data) {
            for (int i = 0; i < size; i++){
                if (data == list[i]){
                    return true;
                }

            }
            return false;
        }

    public String toString(){

        String result = "[" ;
        for (int i = 0; i < size; i++){
            result += list[i] +" " ;


        }
        result +="]";
        return result;

    }


}







