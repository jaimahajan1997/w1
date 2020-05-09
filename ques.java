
public class ques {
	private String ans;
	private String question;
	private String o1;
	private String o2;
	private String o3;
	private String o4;



	public ques(String s1, String s2, String s3, String s4, String s5, String s6) {
		this.question = s1;
		this.o1 = s2;
		this.o2 = s3;
		this.o3 = s4;
		this.o4 = s5;
		this.ans = s6;
	}
	public String getCorrectOption() {
		return ans;
	}
	public String getQuestion() {
		return question;
	}
	public String getOpt4() {
		return o4;
	}

	
	public String getOpt1() {
		return o1;
	}

	public String getOpt2() {
		return o2;
	}

	public String getOpt3() {
		return o3;
	}

	

}