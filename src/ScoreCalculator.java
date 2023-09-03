import java.util.Scanner;

public class ScoreCalculator {
    double[][] readClassScores(int classNum) throws IllegalScoreExceptions {
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int numScores = 0;
        boolean judge = true;
        double classScore[][] = new double[classNum][];
        try {
            // 输入信息
            for (int i = 0; i < classNum ; i++) {
                System.out.print("请输入第"+(i+1)+"班级人数：");
                int StudentNumber = scanner.nextInt();
                classScore[i] = new double[StudentNumber];
                totalScore = 0;
                try {
                    for (int j = 0 ; j < StudentNumber ; j++) {
                        System.out.print("请输入第"+(j+1)+"个学生的成绩：");
                        double score = scanner.nextDouble();
                        classScore[i][j] = score;

                        if (score < 0 || score > 100) {
                            throw new IllegalScoreExceptions("成绩输入有误，请输入0~100的数字");
                        }

                        totalScore += score;

                    }
                } finally {
                    if (judge) {
                        double Average = totalScore/StudentNumber;
                        System.out.print("第"+(i+1)+"个班级的平均成绩是："+Average);
                        System.out.print("\n");
                    }
                }

            }
        } catch (IllegalScoreExceptions e) {
            System.err.println("错误：" + e.getMessage());
        } finally {
            scanner.close();
        }
        return classScore;
    }
}
