public class BloodData {
    	String bloodType;
    	String rhFactor;
    	
    public BloodData(){
    	this.bloodType = "O";
    	this.rhFactor = "+";
    }
      public BloodData(String bt, String rh){
   		this.bloodType = bt ;
    	this.rhFactor = rh;
    } 
    public void display(){
    	System.out.print(bloodType + rhFactor + " is added to the bank.");
	}
}
