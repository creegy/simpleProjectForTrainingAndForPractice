public class Methods {
    public int sum;
    public int X;
    public int Y;
    public Methods(int X, int Y, int sum) {
        this.X = X;
        this.Y = Y;
        this.sum = sum;
    }

//    public int getSum() {
//        return sum;
//    }
//
//    public void setSum(int sum) {
//        this.sum = sum;
//    }
//
//    public int getX() {
//        return X;
//    }
//
//    public void setX(int X) {
//        this.X = X;
//    }
//
//    public int getY() {
//        return Y;
//    }
//
//    public void setY(int Y) {
//        this.Y = Y;
//    }

    protected String metoda() {
        return "text from different class";
    }

    public int addition() {
        sum = X+Y;
        return sum;
    }
}
