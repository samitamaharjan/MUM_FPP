package ExamEqual;

public class Student {
	private int id;
	private String stuName;
	private Professor prof;
	private String subject;
	private String profName;
	
	public Student(String stuName, String profName, String subject) {
		this.stuName = stuName;
		
	}
	
	public String getProfName() {
		return profName;
	}


	public String getSubject() {
		return subject;
	}

	public int getId() {
		return id;
	}

	public String getStuName() {
		return stuName;
	}

	public Professor getProf() {
		return prof;
	}
	
	public String toString() {
		return getStuName() + " "+ getProfName() + " " + getSubject();
	}
	
	public boolean equals(Object ob) {
		if (ob == null || !(ob instanceof Student)) return false;
		
		Student st = (Student) ob;
		boolean isEqual = st.prof.getProfName().equals(getProf()) 
				&& st.prof.getSubject().equals(getSubject());
		return isEqual;
	}
}
