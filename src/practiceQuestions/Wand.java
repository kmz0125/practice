package practiceQuestions;

public class Wand {
    private String name; //杖の名前
    private double power; //杖の魔力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException(
                    "名前が3文字未満不可。処理を中断");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || 100.0 < power) {
            throw new IllegalArgumentException(
                    "杖の増幅率が下限値・上限値から外れている。処理を中断。");
        }
        this.power = power;
    }

}
