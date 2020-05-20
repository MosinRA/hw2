public class MyArraySizeException extends Exception {
    private int lenght;
    private int hight;

    public int getLenght() {
        return lenght;
    }

    public int getHight() {
        return hight;
    }

    public MyArraySizeException(int lenght, int hight) {
        this.lenght = lenght;
        this.hight = hight;
    }

    public MyArraySizeException(String messege, int lenght, int hight) {
        super(messege);
        this.lenght = lenght;
        this.hight = hight;
    }

    public void PrintInfo() {
        System.out.println("Не верный размер массива " + "первый индекс " + getLenght() + " второй индекс " + getHight() + " должно быит 4х4");
    }

}
