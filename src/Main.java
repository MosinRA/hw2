import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        String[][] NormalArr = {
                {"222", "222", "2222"},
                {"222", "222", "2222", "32131"},
                {"222", "222", "2222", "32131"},
                {"222", "222", "2222", "32131"}
        };
try {
    SumArr(NormalArr);
} catch (MyArrayDataException e){
    e.printStackTrace();
    e.PrintInfo();
} catch (MyArraySizeException e){
    e.printStackTrace();
    e.PrintInfo();
}
    }
    static void SumArr (String [][] x) throws MyArraySizeException, MyArrayDataException {
        for (String[] strings : x){
            for (int i = 0; i < strings.length; i++) {
                if ((x.length !=4) || (strings.length !=4)){
                    throw new MyArraySizeException("Ошибка! массив выходит за границы!", x.length, strings.length);
                }
        }
       }
int Sum = 0;
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j < x[i].length; j++) {
                try {
                    int c = Integer.parseInt(x[i][j]);
                    Sum += c;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка! Не верный формат! ", i, j);
                }

            }

        }

    }

}