import java.util.*; //Import this function

public class Self_checkout_machine_final_program_java{ //Create a public class named 'Self_checkout_machine_final_program_java'
    public static void main(String[] args) { //Begin the java program

HashMap<String, Double> inventory = new HashMap<String, Double>(); //Create a HashMap dictionary named 'inventory' which contains a String value and a Double value
		inventory.put("bread", 10.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("milk", 12.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("cola", 7.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("fanta", 7.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("water", 7.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("newspaper", 12.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("magazine", 18.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("candy", 13.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("juice", 7.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("orange", 3.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("strawberry", 25.00); //Add this item and number to the dictionary named 'inventory'
		inventory.put("mango", 99.00); //Add this item and number to the dictionary named 'inventory'
		
        
 	    ArrayList<String> basket = new ArrayList<String>(); //Create a String ArrayList named 'basket'
 	    ArrayList<Double> total = new ArrayList<Double>(); //Create a Double ArrayList named 'total'
        
 	    System.out.println("Hello there!"); //Print this line
		Scanner scanner = new Scanner(System.in); //Create a Scanner object named 'scanner'
		System.out.println("What would you like to purchase?"); //Print this message
		
		String user_answer = scanner.nextLine().toLowerCase(); //Ask the user to input a String value, store this value in the variable 'user_answer'
		while (true){ //While the loop is not equal to False, perform the following lines
			if(user_answer.equals("quit")) { //Check if 'user_answer' equals 'quit', if it does, perform the following lines
				break; //Exit the while loop
			}
			try{ //Try and perform the following lines
				 if(inventory.containsKey(user_answer)){ //Check if the dictionary named 'inventory' contains the key 'user_answer'. If it does, run the following lines
			    	basket.add(user_answer); //Add 'user_answer' to the ArrayList 'basket'
			    	total.add(inventory.get(user_answer));
			    	//Look at 'inventory' and find the value corresponding to the key stored in 'user_answer'. Add this value to the array 'total'
			    	System.out.println("This item has been added to the basket. What else would you like to purchase (Type Quit to end program)?"); //Print this line
			    	user_answer = scanner.nextLine().toLowerCase();
			     	//Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'

				}
				 else if(!inventory.containsKey(user_answer)) { //If the dictionary named 'inventory' does not contain the key 'user_answer', run the following lines
				     System.out.println("Sorry, we do not have this item. What else would you like to purchase (Type Quit to end program)?"); //Print this line
			     	 user_answer = scanner.nextLine().toLowerCase();
   			     	 //Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'

				 }
			    }	                                
			catch(Exception e){ //If the user does not enter a value, run the following code
			    	System.out.println("You need to enter a product name (Type Quit to end program)"); //Print this line
			     	user_answer = scanner.nextLine().toLowerCase(); 
			     	//Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'
			}          



	   }
		double price_of_one_product = 0; //Create a double variable named 'price_of_one_product'. Assign the value '0' to this variable
		double amount_to_pay = 0;  //Create a double variable named 'amount_to_pay'. Assign the value '0' to it.
		for(int i = 0; i < total.size(); i++){ 
			//Create an integer variable named 'i'. Assign the value '0' to it. Whilst 'i' is less than the size of 'total', add '1' to 'i' and perform the following lines.
			price_of_one_product = total.get(i); //Get the value stored in the ArrayList 'total' to the position 'i'. Store this value in the variable 'price_of_one_product'
			amount_to_pay = amount_to_pay + price_of_one_product; //Perform the calculation 'amount_to_pay + price_of_one_product'. Store this value in the variable 'amount_to_pay'

	}
		System.out.println("Here is your shopping basket " + basket); //Print this line
		System.out.println("Do you want to add anything else to your shopping basket? (Yes/No)?"); //Print this line
		user_answer = scanner.nextLine().toLowerCase();
     	//Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'

		if(user_answer.equals("yes")) { //Check if 'user_answer' equals 'yes', if it does, perform the following lines
			System.out.println("What would you like to purchase?"); //Print this message
			
			user_answer = scanner.nextLine().toLowerCase(); //Ask the user to input a String value, store this value in the variable 'user_answer'
			while (true){ //While the loop is not equal to False, perform the following lines
				if(user_answer.equals("quit")) { //Check if 'user_answer' equals 'quit', if it does, perform the following lines
					break; //Exit the while loop
				}
				try{ //Try and perform the following lines
					 if(inventory.containsKey(user_answer)){ //Check if the dictionary named 'inventory' contains the key 'user_answer'. If it does, run the following lines
				    	basket.add(user_answer); //Add 'user_answer' to the ArrayList 'basket'
				    	total.add(inventory.get(user_answer));
				    	//Look at 'inventory' and find the value corresponding to the key stored in 'user_answer'. Add this value to the array 'total'
				    	System.out.println("This item has been added to the basket. What else would you like to purchase (Type Quit to end program)?"); //Print this line
				    	user_answer = scanner.nextLine().toLowerCase(); //Ask the user to input a String value, store this value in the variable 'user_answer' 
					}
					 else if(!inventory.containsKey(user_answer)) { //If the dictionary named 'inventory' does not contain the key 'user_answer', run the following lines 
					     System.out.println("Sorry, we do not have this item. What else would you like to purchase (Type Quit to end program)?"); //Print this line
				     	 user_answer = scanner.nextLine().toLowerCase();
				     	 //Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'

					 }
				    }	                                
				catch(Exception e){ //If the user does not enter a value, run the following code
				    	System.out.println("You need to enter a product name (Type Quit to end program)"); //Print this line
				     	user_answer = scanner.nextLine().toLowerCase();
				     	//Ask the user to input a String value. Turn the value entered into all lowercase and then store this value in the variable 'user_answer'
				}          



		   }			
		}
		for(int i = 0; i < total.size(); i++){
			//Create an integer variable named 'i'. Assign the value '0' to it. Whilst 'i' is less than the size of 'total', add '1' to 'i' and perform the following lines.
			price_of_one_product = total.get(i); //Get the value stored in the ArrayList 'total' to the position 'i'. Store this value in the variable 'price_of_one_product'
			amount_to_pay = amount_to_pay + price_of_one_product; //Perform the calculation 'amount_to_pay + price_of_one_product'. Store this value in the variable 'amount_to_pay'
		}
		System.out.println("Here is your shopping basket " + basket); //Print this line
        Formatter formatter = new Formatter(); //Create a formatter, save this formatter tp the variable 'formatter'
		ArrayList<Double> currency = new ArrayList<Double>(); //Create a Double ArrayList named 'currency'
        currency.add(0.01); //Add the value '0.01' to the ArrayList named 'currency'
        currency.add(0.02); //Add the value '0.02' to the ArrayList named 'currency'
        currency.add(0.05); //Add the value '0.05' to the ArrayList named 'currency'
        currency.add(0.1); //Add the value '0.1' to the ArrayList named 'currency'
        currency.add(0.2); //Add the value '0.2' to the ArrayList named 'currency'
        currency.add(0.5); //Add the value '0.5' to the ArrayList named 'currency'
        currency.add(1.0); //Add the value '1.0' to the ArrayList named 'currency'
        currency.add(2.0); //Add the value '2.0' to the ArrayList named 'currency'
        currency.add(5.0); //Add the value '5.0' to the ArrayList named 'currency'
        currency.add(10.0); //Add the value '10.0' to the ArrayList named 'currency'
        currency.add(20.0); //Add the value '20.0' to the ArrayList named 'currency'
        currency.add(50.0); //Add the value '50.0' to the ArrayList named 'currency'
        currency.add(100.0); //Add the value '100.0' to the ArrayList named 'currency'
        
		while (amount_to_pay > 0){ //While the variable 'amount_to_pay' is bigger than 0, perform the following lines

			try { //Try and perform the following lines
				
			    amount_to_pay = Math.round(amount_to_pay*100.00)/100.00; //Round the variable 'amount_to_pay' to 2 decimal places
				System.out.println("You need to pay £" + amount_to_pay); //Print this line
	            double amount_needed_to_pay = scanner.nextDouble(); //Ask the user to enter a Double value
	            if(currency.contains(amount_needed_to_pay)){ // Check if the ArrayList 'currency' contains the value 'amount_needed_to_pay'. If it does, perform the following lines
	            	amount_to_pay = amount_to_pay - amount_needed_to_pay;
	            	//Perform the calculation 'amount_to_pay - amount_needed_to_pay'. Store this value in the variable 'amount_to_pay'
		               
		            } else { //If the ArrayList 'currency' does not contain the value 'amount_needed_to_pay', perform the following line
		               System.out.println("Not a valid coin."); //Print this line
		            }
		         } catch (Exception e) { //If there is an invalid input (e.g. the user enters a String value), perform the following lines.
		            System.out.println("Not a valid number."); //Print this line
		            scanner.next(); //This line has been written to stop an infinite loop

		         }
	}
	    amount_to_pay = Math.round(amount_to_pay*100.0)/100.0; //Round the variable 'amount_to_pay' to 2 decimal places
		amount_to_pay = -(amount_to_pay); //Perform the calculation 'amount_to_pay = -(amount_to_pay)'
		int change = 0; //Create an integer variable named 'change'. Assign the value 0 to this variable
		System.out.println("We need to return £" + amount_to_pay); //Print this line
		
		while (amount_to_pay>2.0) { //While 'amount_to_pay > 2.0', perform the following lines
			amount_to_pay = amount_to_pay - 2.0; //Perform the calculation 'amount_to_pay = amount_to_pay - 2.0'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 2 pound coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>1.0) { //While 'amount_to_pay > 1.0', perform the following lines
			amount_to_pay = amount_to_pay - 1.0; //Perform the calculation 'amount_to_pay = amount_to_pay - 1.0'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 1 pound coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>0.5) { //While 'amount_to_pay > 0.5', perform the following lines
			amount_to_pay = amount_to_pay - 0.5; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.5'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 50 pence coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>0.2) { //While 'amount_to_pay > 0.2', perform the following lines
			amount_to_pay = amount_to_pay - 0.2; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.2'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 20 pence coins"); //Print this line
		change = 0; //Print this line

		while (amount_to_pay>0.1) { //While 'amount_to_pay > 0.1', perform the following lines
			amount_to_pay = amount_to_pay - 0.1; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.1'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 10 pence coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>0.05) { //While 'amount_to_pay > 0.05', perform the following lines
			amount_to_pay = amount_to_pay - 0.05; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.05'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 5 pence coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>0.02) { //While 'amount_to_pay > 0.02', perform the following lines
			amount_to_pay = amount_to_pay - 0.02; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.02'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 2 pence coins"); //Print this line
		change = 0; //Print this line
		
		while (amount_to_pay>0.01) { //While 'amount_to_pay > 0.01', perform the following lines
			amount_to_pay = amount_to_pay - 0.01; //Perform the calculation 'amount_to_pay = amount_to_pay - 0.01'
			change += 1; //Perform the calculation 'change = change + 1'
		}
		System.out.println("We need to return " + change + " 1 pence coins"); //Print this line
		System.out.println("Thank you for shopping at our store"); //Print this line
}
}