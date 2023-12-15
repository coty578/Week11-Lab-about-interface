public class StudentApp {
    
    public static void main(String[] args) {

        MasterStudent masterStudent = new MasterStudent(1234, 25, 100, 5);
        PhDStudent PhDStudent = new PhDStudent(21345, 45, 100, 3, 4);
        BacherlourStudent bacherlourStudent  = new BacherlourStudent(67123, 80, 100);
        

       System.out.println("conferenceScore:"+masterStudent.conferenceScore()+" ,[computeTotalScore:"+masterStudent.computeTotalScore()+"]");
       System.out.println("ArticleScore:"+PhDStudent.ArticleScore()+" ,[computeTotalScore:"+PhDStudent.computeTotalScore()+"]");
       System.out.println("projectScore :"+bacherlourStudent.projectScore()+",[computeTotalScore:"+bacherlourStudent.computeTotalScore()+"]");

    } 
}
