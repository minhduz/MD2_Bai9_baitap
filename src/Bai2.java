public class Bai2 {
    public static String tamGiac(double a,double b,double c) {
        if(a==b&&b==c) return "Tam giác đều";
        else if (a==b||c==b||a==c) return "Tam giác cân";
        else if (a+b>c&&c+b>a&&a+c>b) return "Tam giác thường";
        else return "Không phải tam giác";
    }
}
