package java14;

public record Author(int id, String name, String topic) {
    public Author{
        if(name.trim().length() < 1) {
            throw new IllegalArgumentException("author must be a valid name");
        }

        if(id > 0) {
            throw new IllegalArgumentException("id must be a greater than 0");
        }
    }
}