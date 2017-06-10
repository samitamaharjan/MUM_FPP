package innerclass;

public class Top {

	int t = 1;
	Middle mid; 
	Middle.Bottom midbot; 
		
	Top(){
		mid = new Middle();
		midbot = mid.new Bottom();
	}

	//returns the value in the instance variable of Bottom  
	int readBottom() {
		
		return midbot.b; 
	} 

	class Middle { 
		int m = 2; 
		//returns sum of instance variable in Top and 
		//instance variable in Bottom   
		int addTopAndBottom() { 
			
			int sum = t + midbot.b;
			  
			return sum;   
		}  

		class Bottom {   
			int b = 3;   
			Bottom(){

			}
			//returns the product of the instance variables   
			//in all three classes  
			int multiplyAllThree() {  
				int multiply = t * m * b;   
				return multiply;  
			}   
		} 
	}  

	public static void main(String[] args){ 
		Top top = new Top();  
		System.out.println(top.readBottom());    
		System.out.println(top.mid.addTopAndBottom());   
		System.out.println(top.midbot.multiplyAllThree()); 
	} 


}
