package ua.en.kosse.oksana.tommy;

public class ExceptionMaker {

    public static void main(String[] args) {
        new ExceptionMaker().isThereTwo(getData());
    }

    public boolean isThereTwo(Object[] objectsArray) {

            for (Object someObject : objectsArray) {
                // Додати код, що перехоплює вийняток NullPointerException та повертає SaferException
                try {
                    System.out.println(someObject);

                    if (someObject.equals("test data")) {
                        SaferException.throwOne();
                    }
                    if (someObject.equals(2)) {
                        return true;
                    }
                }
                catch (NullPointerException e) {
                    System.err.println( " Исключение :  ("+  someObject  +")   "+e.getMessage());
                    e.printStackTrace();
                }
            }
        return false;
    }
    public static Object[] getData() {
        return new Object[] { new Object(), "test data", null,  2 };
    }
}
