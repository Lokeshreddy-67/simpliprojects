package com.lockme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Lockme {

		public static void main(String[] args)throws IOException, InterruptedException 
		{
			Scanner sc = new Scanner(System.in);
			int choice,Fchoice,OPchoice,  kl=0,j, count=0;
			String st;
			File mFolder =new File("H:\\java\\Virtual");
			String location="H:\\java\\Virtual";
			System.out.println("Welcome to the Screen\n\n");
			System.out.println("Lockme developed by Lokesh Reddy");
			System.out.println("********************************************************");
			System.out.println("Press Enter to continue...");
		    System.in.read();
	        do {
	        	choice=0;
		    System.out.println("MAIN MENU");
		    System.out.println("Select the Options Given Below:");
		    System.out.println("1. Retrieve All Files inside Main Folder");
		    System.out.println("2. Bussiness File Operations");
		    System.out.println("3. Exit\n");
		    choice= sc.nextInt();
		    switch(choice) {
		    case 1:
		    	File Fobj = new File("H:\\java\\Virtual");
				File Farray[] = Fobj.listFiles();
		    	for(int i=0;i<Farray.length;i++) {
		    		if(Farray[i].isFile()) {
		    			System.out.println("File: "+Farray[i] +"\n\n");
		    		}
		    		else {
		    			System.out.println("Retriving not done");
	}
		    	}
		    	break;
		    case 2:
		    	do {
		    		count=0;
		    	System.out.println("Bussiness OPERATION SECTION");
		    	System.out.println("Select the Options Given Below:");
			    System.out.println("1. Add File/Folder");
			    System.out.println("2. Delete File/Folder");
			    System.out.println("3. Search File/Folder");
			    System.out.println("4. Goback Main Menu");
			    System.out.println("5. Exit\n");
			    Fchoice= sc.nextInt();
			    switch(Fchoice) {
			    case 1:
			    		
			    	System.out.println("Want to add File ");
			    	System.out.println("Press 1 for File");
			    	OPchoice= sc.nextInt();
			    	switch(OPchoice) {
			    	case 1:
			    		System.out.println("Please Enter the File name");
			    		String str1 = sc.next();
			    		File addfile = new File(location+"\\"+str1);
			    		if(addfile.createNewFile()) {
			    			System.out.println("File is added");
			    		}
			    		else {
			    			System.out.println("File not added");
			    		}
			    		break;
			    	default:
			    		System.out.println("Please Enter Correct Value!!!!!\n");
			    	
			    	}
			    	break;
			    case 2:
			    	
			    		kl= 0;
			    	System.out.println("Want to Delete File ");
			    	System.out.println("Press 1 for file");
			    	kl= sc.nextInt();
			    	switch(kl) {
			    	case 1: 
			    		System.out.println("Please Enter the File name with extension");
			    		st = sc.next();
			    		File delFile = new File(location+"\\"+st);
			    		if(delFile.exists()) {
			    			delFile.delete();
			    			System.out.println("File Deleted\n");
			    			}else {
			    				System.out.println("!!File not Found!!!\n");
			    			}
			    	break;
			    	default:
			    		System.out.println("Please Enter Correct Value!!!!!\n");
			    	}
			    	break;
			    	
			    case 3:
			    	System.out.println("Please Enter Name of File:");
			    	st = sc.next();
			    	File fsearch = new File("H:\\java\\Virtual");
					File FSarray[] = fsearch.listFiles();
			    	for(int i=0;i<FSarray.length;i++) {
			    		if(FSarray[i].getName().startsWith(st)) {
			    			count++;
			    			if(FSarray[i].isFile()) {
				    			System.out.println("File: "+FSarray[i]+"\n\n");
				    		}
			    			else {
			    				System.out.println("File not found");
				    		}
			    		}    		
			    	}
			    	break;
			    case 4: 
			    	break;
			    case 5:
			    	System.out.println("Thanks for using my application");
			    	System.exit(1);
			    	break;
			    
			    default:
		    		 System.out.println("Wrong input");
			    
			    }
			    
			    System.out.println("Press Enter to continue...");
			    System.in.read();
		    	}while(Fchoice!=4);
		    	break;
		    case 3:
		    	System.out.println("Thanks for using my application");
		    	System.exit(1);
		    	default:
		    		 System.out.println("Wrong input");
		    }
		    }while(choice!=3);
	        sc.close();
	        
		}

	}

