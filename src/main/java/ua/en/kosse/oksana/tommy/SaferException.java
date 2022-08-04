package ua.en.kosse.oksana.tommy;


// Змінити клас так, щоб його можна було використовувати у якості винятка

public class SaferException {
    static void throwOne() throws NullPointerException {
        //System.out.println(" B теле метода throwOne().");
        throw new NullPointerException("дeмoнcтpaция throws");
    }
}
