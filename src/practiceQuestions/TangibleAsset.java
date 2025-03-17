package practiceQuestions;

public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    //コンストラクタ
    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

    //メソッド
    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
