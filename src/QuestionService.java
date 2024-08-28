import java.util.Scanner;
public class QuestionService {
	
	Question [] questions =new Question[5];
	String [] selection = new String[5];
	public QuestionService() {
		questions[0]=new Question(1,"What is Size of Int in Java", "2", "4", "6", "8", "4");
		questions[1]=new Question(2,"What is default access modifier in java", "default", "private", "public", "protected", "default");
		questions[2]=new Question(3,"what is String in java", "Datatype", "Class", "keyword", "all of this", "Class");
		questions[3]=new Question(4,"Logiacl_Or_Operator symbol used in java", "||", "or", "&&", "!", "||");
		questions[4]=new Question(5,"Which is the default datatype to store decimal numner in java", "double", "int", "float", "decimal", "double");
		
	}
	
	public void displayQuestions() {
		int i=0;
		for(Question Q : questions) {
			System.out.println("Ouestions No::"+Q.getId());
			System.out.println(Q.getQuestion());
			System.out.println(Q.getOpt1());
			System.out.println(Q.getOpt2());
			System.out.println(Q.getOpt3());
			System.out.println(Q.getOpt4());
			Scanner scn = new Scanner(System.in);
			selection[i]=scn.nextLine();
			i++;
			
		}
		
		for(String s: selection) {
			System.out.println(s);
		}
	}
	
	public void  showScore() {
		
	    int score=0;
		for(int j=0;j<questions.length;j++) {
		Question que=questions[j];
		String actualAns=que.getAnswer();
		String userAns=selection[j];
		if(actualAns.equals(userAns)) {
			score++;
		}
	}
        System.out.println("Your Score is ::"+ score);
}
}
