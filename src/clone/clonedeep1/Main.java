package clone.clonedeep1;

public class Main {
	public static void main(String[] args) {
		try {
			//Shallow copy of Job is good enough
			Job joesjob = new Job(40, "Carpenter");
			Job jobCopy = (Job)joesjob.clone();
			System.out.println(jobCopy);
			
			//Shallow copy of Person is not good enough
			Person joe = new Person("Joe", joesjob);
			System.out.println(joe);
			Person joecopy = (Person)joe.clone();
			System.out.println(joecopy);
			
			//A change in copy does NOT change original object in this case
			joecopy.job.typeOfJob = "Painter"; 			
			System.out.println(joe);  
		} catch(CloneNotSupportedException e) { }
	}
}