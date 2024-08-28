
public class Main {

	public static void main(String[] args) {
		//System.out.println("Hi");
        QuestionService q=new QuestionService();
        q.displayQuestions();
        q.showScore();
		//System.out.println( Runtime.getRuntime().availableProcessors());
		//System.out.println( Runtime.getRuntime().maxMemory()/(1024*1024));
	}

}
