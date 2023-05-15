public class multiDimensionalArray {
    private String courseName;
    private int[][] grades;
    public multiDimensionalArray(String courseName, int[][] grades){
        this.courseName  = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        outputGrades();
        System.out.printf("%d %d%n ",getMaximum(), getMinimum());
        outputBarChart();
    }

    public int getMinimum(){
        int min = grades[0][0];
        for(int[] gradeRow : grades){
            for(int individualScore : gradeRow){
                if (individualScore < min){
                    min = individualScore;
                }
            }
        }
        return min;
    }

    public int getMaximum(){
        int max = grades[0][0];
        for(int[] gradeRow : grades){
            for (int individualScore : gradeRow){
                if (individualScore > max){
                    max =individualScore;
                }
            }
        }
        return max;
    }


    public double getAverage(int[] setofGrades){
        int total = 0;

        for(int grade: setofGrades){
            total = total = grade;
        }
       int average = total / setofGrades.length;
        return average;
    }


    public void outputBarChart(){
        int[] frequency = new int[11];

        for(int[] index: grades){
            for(int scores : index){
                frequency[scores/10] = frequency[scores/10] + 1;
            }
        }

        for(int count = 0; count < frequency.length; count++)
        {if(count == 10) { System.out.printf("%d", 100);}
        else {
            System.out.printf("%02d - %02d", count * 10, count * 10 + 9 );
        }
        for (int asterisk = 0; asterisk < frequency[asterisk]; asterisk++){
            System.out.println("*");}
            System.out.println();
        }
    }
    public void outputGrades(){
        System.out.printf("THe grades are: %n %n");
        for(int index = 0; index < grades[0].length; index++){

        }
    }
}
