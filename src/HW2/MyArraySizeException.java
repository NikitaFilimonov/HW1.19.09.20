package HW2;

public class MyArraySizeException extends Exception{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public MyArraySizeException(String msg) {
        this.msg = msg;
    }

    public MyArraySizeException(String message, String msg) {
        super(message);
        this.msg = msg;
    }
}
