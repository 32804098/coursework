public static int[] average_grades(int[][] grades, int[] weights) {
      int[] averageGrades = new int[grades.length];
      for (int i = 0; i < grades.length; i++) {
            int total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                  total += grades[i][j] * weights[j];
            }
            averageGrades[i] = total / 100;
      }
      return averageGrades;
}
int[][] grades = {{51, 83, 28}, {0, 38, 95}};
int[] weights = {30, 40, 30};
int[] averageGrades = average_grades(grades, weights);
System.out.println("Weighted average grades: " + Arrays.toString(averageGrades));