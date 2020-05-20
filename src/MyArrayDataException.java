import java.util.zip.DataFormatException;

public class MyArrayDataException extends DataFormatException {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public MyArrayDataException(String messege, int x, int y) {
        super(messege);
        this.x = x;
        this.y = y;
    }
    public void PrintInfo(){
        System.out.println("Не верный формат массива " + getX() + " " + getY());
    }
}


