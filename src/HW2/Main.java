package HW2;


public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for(int i=0; i< array.length; i++){
            for(int j=0;j < array[i].length; j++){
                array[i][j]="Str "+j;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        try {
            try {
                int sum = MyArraySize.getArray(array);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static class MyArraySize {
        static int getArray(String[][] _myArray) throws MyArraySizeException, MyArrayDataException {
            if(_myArray.length == 4 && _myArray[0].length == 4) {
                System.out.println("Верный размер массива");
            } else {
                throw new MyArraySizeException("Неверный размер массива");
            }

            int sum = 0;
            if(_myArray.length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }

            for (int i=0;i<_myArray.length;i++) {
                if(_myArray[i].length != 4) {
                    throw new MyArraySizeException("Неверный размер массива");
                }
                for(int j=0;j<_myArray[i].length;j++) {
                    try {
                        sum += Integer.parseInt(_myArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Невозможно конвертировать ячейку "+i+"x"+j);
                    }
                }
            }

            Integer[][] intArray = new Integer[_myArray.length][_myArray[0].length];
            int res=0;
            for(int i=0;i<_myArray.length;i++) {
                for (int j=0;j<_myArray[0].length;j++) {
                    intArray[i][j] = Integer.parseInt(_myArray[i][j]);
                    i++;
                    res += intArray[i][j];
                }
            }
            return sum;
        }
    }
}
