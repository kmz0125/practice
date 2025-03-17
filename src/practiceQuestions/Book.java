package practiceQuestions;

public class Book extends TangibleAsset {
    String isbn;

    //コンストラクタ
    public Book(String name, int price, String color, String isbn, double weight) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    //メソッド
    public String getIsbn() {
        return this.isbn;
    }
}
