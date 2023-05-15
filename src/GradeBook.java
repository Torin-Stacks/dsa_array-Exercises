//public class GradeBook {
//    private String courseName;
//    private int[] grades;
//
//    public GradeBook(String courseName, int[] grades) {
//        this.courseName = courseName;
//        this.grades = grades;
//    }

//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//
//    public void processGrades() {
//        outputGrades();
//
//        System.out.printf("%n Class average is %.2f", getAverage());
//        System.out.print(getMaximum(), getMinimum());
//        outputBarCharts();
//    }
//
//    public int getMinimum() {
//        int lowGrade = grades[0];
//        int highGrade = grades[0];
//        for (int count = 0; count < grades.length; count++) {
//            if (grades[count] < lowGrade) {
//                lowGrade = grades[count];
//            }
//            else if (grades[count] > highGrade) {
//                highGrade = grades[count];
//            }
//        }
//        return (lowGrade);
//    }
//
//    public int getMaximum(){
//
//    }
//
//    public double getAverage(){
//        int total = 0;
//        for (int grade: grades){
//            total = total + grade;
//        }
//        return (double) total / grades.length;
//    }
//
//    public void outputBarCharts(){
//        int[] frequency = new int[11];
//
//        for (int grade : grades){
//            frequency[grade / 10 ] = frequency[grade / 10] + 1;
//        }
//
//    }
//
//}
//
//
//
//
