package by.ekids.museum;

public class MuseumException extends IllegalArgumentException {

    public MuseumException() {
        super("Размер коллекции не может быть больше 1000 экземпляров");
    }
}
