public class MyArrayDataException extends Exception {
private int DataEr;

    public int  getDotaEr() {
        return DataEr;
    }

    public MyArrayDataException(int dataEr) {
        DataEr = dataEr;
    }

    public MyArrayDataException(String message, int dataEr) {
        super(message);
        DataEr = dataEr;
    }
}
