public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int Arr;

    public int getArr() {
        return Arr;
    }

    public MyArraySizeException(int arr) {
        Arr = arr;
    }

    public MyArraySizeException(String message, int arr) {
        super(message);
        Arr = arr;
    }
}
