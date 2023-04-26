package ua.en.kosse.oksana.tommy;

import ua.en.kosse.oksana.tommy.SaferException;

public class ExceptionMaker {

    public static void main(String[] args) throws SaferException {
        new ExceptionMaker().isThereTwo(getData());
    }

    public boolean isThereTwo(Object[] objectsArray) throws SaferException {

        try {
            for (Object someObject : objectsArray) {
                // Додати код, що перехоплює вийняток NullPointerException та повертає SaferException
                if (someObject.equals(2)) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            throw new SaferException("Ошибка!!!");
        }
        return false;
    }

    public static Object[] getData() {
        return new Object[] { new Object(), null, "test data", 2 };
    }
}
