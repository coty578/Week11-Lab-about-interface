public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    public int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfConf,int numberOfArtciles) {
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArtciles;
    }

    @Override
    public float ArticleScore() {
       return numberOfArticles * 8;
    }
    @Override
    float computeTotalScore(){
        return computeBaseScore() + ArticleScore();
    }
}
