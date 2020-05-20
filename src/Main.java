public class Main {
    public static void main(String[] args) {
        NormArr();
        ErArr();
    }

    static void ErArr() {
        String[][] ErArr = {
                {"122", "222"},
                {"222"},
                {"2212", "21321", "21321"}
        };
        int NumArrEr[][] = new int[ErArr.length][ErArr.length];
        for (int i = 0; i < ErArr.length; i++) {
            for (int j = 0; j < ErArr.length; j++) {
                NumArrEr[i][j] = Integer.parseInt(ErArr[i][j]);
                try {
                    throw new MyArrayDataException("Символ неверного формата находится в ячейках", NumArrEr[ErArr.length][ErArr.length]);
                } catch (MyArrayDataException e) {
                    e.printStackTrace();
                    System.out.println(e.);
                }
                System.out.println(NumArrEr[i][j]);
            }
        }

    }

    static void NormArr() {

        String[][] NormalArr = {
                {"222", "222", "2222", "32131"},
                {"222", "222", "2222", "32131"},
                {"222", "222", "2222", "32131"},
                {"222", "222", "2222", "32131"}

        };
        int NumArr[][] = new int[NormalArr.length][NormalArr.length];
        for (int i = 0; i < NormalArr.length; i++) {
            for (int j = 0; j < NormalArr.length; j++) {
                NumArr[i][j] = Integer.parseInt(NormalArr[i][j]);
                System.out.print(NumArr[i][j]);

            }

        }
    }
}
