import java.util.Scanner;
public class online 
{
	public static void main(String[] args) {
        	int ch=4;
        	int choice;
        	String name;
        	int id=0;
        	Scanner sc=new Scanner(System.in);
	System.out.print("Enter user name:");
               	name=sc.next();
                	System.out.print("Enter roll no:");
                	id=sc.nextInt();
                	int count=0;
                 	System.out.println("Welcome "+name+"  to Oasis Online Examination");
	System.out.println("***************************************");
	do
        	{
		System.out.println("1.Take Exam");
        		System.out.println("2.View Marks");
       		 System.out.println("3.Exit");
            		System.out.print("Enter your choice:");
        		ch=sc.nextInt();
        		if(ch==3)
        		{
			System.out.println("-------------------------------------------------------------------------");
            			System.out.println("Thank you for taking exam");
			System.out.println("-------------------------------------------------------------------------");
            			break;
        		}
        		switch(ch)
        		{
            			case 1:
            			{
                				System.out.println("Select programming language:");
                				System.out.println("1.C \n2.Java \n3.python");
                				System.out.println("Enter your choice:");
                				int sub=sc.nextInt();
                				System.out.println("There are 5 questions in the examination");
				System.out.println("Each question consist of 4 option you have to choose correct answer");
               				if(sub==2)
                				{
                    				count=0;
					System.out.println();
                    				System.out.println("Q.1.Java is developed by:");
					System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                					System.out.print("Enter answer:");
                					choice=sc.nextInt();
               					if(choice==1)
                					{
                    					++count;
                					}
					System.out.println();
                					System.out.println("Q.2.Number of primitive data types in java are:");
                					System.out.println("1.6\n2.7\n3.8\n4.9");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                					if(choice==3)
                					{
                    					++count;
                					}
					System.out.println();
                  					System.out.println("Q.3.Arrays in java are:");
               					System.out.println("1.object references\n2.objects\n3.primitive data type\n4.none ");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==2)
                					{
                   					 ++count;
                					}
					System.out.println();
                  					System.out.println("Q.4.When is the object created with new keyword:");
                					System.out.println("1.At run time\n2.At compile time\n3.Depends on the code\n4.none");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==1)
                					{
                    					++count;
                					}
					System.out.println();
                  					System.out.println("Q.5.Java is:");
                					System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both \n4.None");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
					if(choice==3)
                					{
                    					++count;
                					}
                				}
                				else if(sub==1)
                				{
                    				count=0;
					System.out.println();
                    				System.out.println("Q.1.C is developed by:");
					System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                					System.out.print("Enter answer:");
                					choice=sc.nextInt();
               					if(choice==2)
               					{
                    					++count;
                					}
					System.out.println();
                					System.out.println("Q.2.C is:");
                					System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                					if(choice==3)
                					{
                    					++count;
                					}
					System.out.println();
                  					System.out.println("Q.3.C is:");
                					System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==1)
                					{
                    					++count;
               					}
					System.out.println();
                  					System.out.println("Q.4. All keywords in C are in");
               					System.out.println("1.Lowercase\n2.Uppercase\n3.Camel case\n4.None");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==1)
                					{
                   					 ++count;
                					}
					System.out.println();
                					System.out.println("Q.5. Which of the following cannot be a variable name in C");
                					System.out.println("1.volatile\n2.true\n3.friend\n4.export");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();   
                					if(choice==1)
                					{
                    					++count;
                					}
                				}
                				else
                				{
                    				count=0;
					System.out.println();
                       				System.out.println("Q.1.Who developed Python Programming language");
					System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Guido van Rossum");
                					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                					if(choice==4)
                					{
                 						++count;
                					}
                					System.out.println("Q.2.Is python case sensitive when dealing with identifiers");
                					System.out.println("1.no\n2.yes\n3.machine dependent\n4.none");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                					if(choice==2)
                					{
                    					++count;
                					}
					System.out.println();
                 					System.out.println("Q.3.python is:");
                					System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==2)
                					{
                    					++count;
                					}
					System.out.println();
                 					System.out.println("Q.4. Which of the following is the correct extension of the python file");
                					System.out.println("1. .python\n2. .pl\n3. .py\n4. .p");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();
                  					if(choice==3)
                					{
                    					++count;
                					}
					System.out.println();
                  					System.out.println("Q.5. What will be the value of the following python expression 4+3%5");
                					System.out.println("1.7\n2.2\n3.4\n4.1");
                 					System.out.print("Enter answer:");
                					choice=sc.nextInt();   
                					if(choice==3)
                					{
                    					++count;
                					}
                				}
				break;
            			}
            			case 2:
            			{
				System.out.println("**************************************************");
                				System.out.println("Congrats  "+name+"  You scored "+count+" marks "+" out of 5 ");
				System.out.println("**************************************************");
            			}
		}

	}while(true);
	}
}
