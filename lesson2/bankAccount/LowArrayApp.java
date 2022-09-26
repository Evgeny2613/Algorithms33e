package lesson2.bankAccount;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        arr.setElem(0, 77);
        arr.setElem(1, 33);
        arr.setElem(2, 88);
        arr.setElem(3, 99);
        arr.setElem(4, 21);
        arr.setElem(5, 34);
        arr.setElem(6, 32);
        arr.setElem(7, 12);


    }
}

class LowArray {
    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }



}