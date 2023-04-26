package ua.en.kosse.oksana.tommy;


// Змінити клас так, щоб його можна було використовувати у якості винятка
public class SaferException extends Exception {
    public SaferException(String message) {
        super(message);
    }
}