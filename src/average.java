import java.util.Scanner;

// 自定义异常类
class IllegalScoreExceptions extends Exception{
    public IllegalScoreExceptions(String message) {
        super(message);
    }
}


public class average {
    public static void main(String[] args) {
        System.out.print("2022091606020 苏彦豪");
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        int numClass = 0;
        int totalStudent = 0;
        double totalScore = 0;
        double totalAverage = 0;


        try {
            System.out.print("请输入班级数量");
            numClass = scanner.nextInt();
            scanner.nextLine();
            ScoreCalculator scoreCalculator = new ScoreCalculator();
            double classScore[][] = scoreCalculator.readClassScores(numClass);
            for (int i = 0 ; i < numClass ; i++) {
                for (int j = 0 ; j < classScore[i].length ; j++) {
                    totalScore += classScore[i][j];
                    totalStudent++;
                }
            }
            totalAverage = totalScore/totalStudent;
            System.out.print("所有班级的平均成绩："+totalAverage);


        } catch (IllegalScoreExceptions e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }

    }
}
