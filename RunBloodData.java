import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    BloodData bd = new BloodData();
	
	System.out.println("Enter the blood type of patient: ");
    	String input1 = sc.nextLine();
    System.out.println("Enter the Rhesus Factor( + or - ): ");
    	String input2 = sc.nextLine();

     if(input1.isEmpty()|| input2.isEmpty()){
     	System.out.print("Invalid!");
     	
     }
     else if (input1.equals("O")){
     	System.out.print("O" + input2 + " is added to the blood bank.");
     }
     else if (input1.equals("A")){
     	System.out.print("A" + input2 + " is added to the blood bank.");
     
     }
     else if (input1.equals("B")){
     	System.out.print("B" + input2 + " is added to the blood bank.");
     		
     }
     else if (input1.equals("AB")){
     	System.out.print("AB" + input2 + " is added to the blood bank.");     	     
	 }
	 else {
	 	bd.display();
	 }
    }
    }
