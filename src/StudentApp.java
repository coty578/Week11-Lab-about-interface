public class StudentApp {
    
    public static void main(String[] args) {
        ConferenceScoreBehaviour c = new MasterStudent(1234, 25, 100, 5);
        ArticleScoreBehaviour a = new PhDStudent(21345, 45, 100, 3, 4);
        ProjectScoreBehaviour p  = new BacherlourStudent(67123, 80, 100);
        MasterStudent m = new MasterStudent(12345, 68, 34, 12);
        BacherlourStudent  b = new BacherlourStudent(12365, 89, 82);


       System.out.println("conferenceScore:"+c.conferenceScore());
       System.out.println("ArticleScore:"+a.ArticleScore());
       System.out.println("projectScore :"+p.projectScore());
       System.out.println("computeBaseScore:"+m.computeBaseScore());
       System.out.println("computeBaseScore:"+b.computeBaseScore());
    }

   
}
