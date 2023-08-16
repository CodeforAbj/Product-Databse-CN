package com.careercamp.service;

import java.util.Scanner;

import com.careercamp.dao.Products;

public class Use extends Products{


public static void main(String[] args) {
		
		int numProd=10; // Number of products auto generated
		create(numProd); // Database Created
		
		Scanner s = new Scanner(System.in); 
		int choice = 9;
		while(choice!=0)
		{	
			// choose from Menu
			switch(choice) 
			{ 
				
				case 1 : 												// Display all
					for(int num=0;num<numProd;num++)
					{
						Db[num].display();
					}
					Menu();
					choice = s.nextInt();
					break;
				case 2 : // Add a Product
					add(numProd);					
					numProd++;
					Menu();
					choice = s.nextInt();
					break;
				case 3 : // delete a Product
					System.out.println("Enter Product Id of what you want to delete");
					int pid =s.nextInt();
					delete(pid);
					System.out.println("Deletion Success");
					numProd--;
					Menu();
					choice = s.nextInt();
					break;
				case 4 : //update a product
					System.out.println("Enter Product Id of what you want to update");
					pid =s.nextInt();
					System.out.println("What value you want to update");
					System.out.println("Press 1 for Product Id");
					System.out.println("Press 2 for Product Name");
					System.out.println("Press 3 for Price");
					System.out.println("Press 4 for quantity");
					System.out.println("Press 5 for discount");
					int c=s.nextInt();
					System.out.println("Enter Value");
					if(c==2)
					{
						update(pid,s.next());
					}
					else if(c==1 || c==4)
					{
						update(pid,s.nextInt(),c);
					}
					else if(c==3 || c==5)
					{
						update(pid,s.nextDouble(),c);
					}
					else
					{System.out.println("Invalid Choice");}
					Menu();
					choice = s.nextInt();
					break;
				case 5 : //search a product by Id
					System.out.println("Enter the Produt ID");
					search(s.nextInt());
					Menu();
					choice = s.nextInt();
					break;
				case 6 : //search a product by Name
					System.out.println("Enter the Produt Name");
					search(s.next());
					Menu();
					choice = s.nextInt();
					break;
				case 7 : //display all products in order of price
					System.out.println("Enter A for Ascending and D for Descending");
					String AD=s.next();
					displaySort(AD,0);
					Menu();
					choice = s.nextInt();
					break;
				case 8 : //display all products in order of discount
					System.out.println("Enter A for Ascending and D for Descending");
					AD=s.next();
					displaySort(AD,1);
					Menu();
					choice = s.nextInt();
					break;
				case 9 : // Reprint Menu
					Menu();
					choice = s.nextInt();
					break;
					
				default : 
					choice = s.nextInt();
					break;
				
				
				 
			} // switch close
		
		} // while close
		System.out.println("The End");
		s.close();
		
		
		
		
	}

}
