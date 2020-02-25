
public class GradeInfo {

	private String className;
	private String grade;
	private double credit;

	public GradeInfo(String name, String letter, double cred) {
		className = name;
		grade = letter;
		credit = 0.0;
	}

	public void setClass(String name) {
		className = name;
	}

	
	
	
	
	
	public double getCredit() {
		return credit;
	}

	public void setCredit(double cred) {
		credit = cred;
	}

	public void setGrade(String letter) {
		grade = letter;
	}

	public String getClass() {
		return className;
	}

	public String getGrade() {
		return grade;
	}

	public double getGradeVaule() {
		switch (grade)
		{
		case "A":
			return 4.0;
		case "B":
			return 3.0;
		case "C":
			return 2.0;
		case "D":
			return 1.0;
		default:
			return 0.0;
		}
		
	public String toString()
	{
		return("class" + className + "grade:" + grade + "credit:" + credit);
	}
	}

}
