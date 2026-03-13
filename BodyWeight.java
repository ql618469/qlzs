import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入身高(m)：");
        double height = sc.nextDouble();

        System.out.print("请输入体重(kg)：");
        double weight = sc.nextDouble();

        // 计算 BMI
        double bmi = weight / (height * height);
        System.out.printf("你的 BMI 指数为：%.2f%n", bmi);

        // 判断体重状态
        if (bmi < 18.5) {
            System.out.println("体重过轻");
        } else if (bmi < 24) {
            System.out.println("正常体重");
        } else if (bmi < 28) {
            System.out.println("超重");
        } else {
            System.out.println("肥胖");
        }

        sc.close();
    }
}