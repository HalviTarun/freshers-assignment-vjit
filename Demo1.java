import java.io.*;
import java.util.*;

public class Demo1 {

public static void main(String[] args) throws Exception 
{		boolean t=true;
	boolean k=true;
  boolean pp=true;
  int swas=0;
  int weight=0;
	System.out.println("WELCOME TO SWATCH BHARAT ");
  
	InputStreamReader isr = new InputStreamReader(System.in);
   	BufferedReader br = new BufferedReader(isr);
	while(t)
{

	Scanner s=new Scanner(System.in);
	System.out.println("_________________________");
	System.out.println("1: REGISTER \n2: LOGIN \n3: EXIT");
	System.out.println("_________________________");

	int kk=s.nextInt();

	switch(kk)
	{
		case 1:
				System.out.println("REGISTRATION");
			
   				FileOutputStream outputStream = new FileOutputStream("password1.txt",true);
            OutputStreamWriter ou = new OutputStreamWriter(outputStream, "UTF-8");
              BufferedWriter wri = new BufferedWriter(ou);


			    System.out.println("enter user name");
			    String reguser=br.readLine();
      //    ou.newLine();
			    wri.write(reguser+",");
			    System.out.println("enter password");
			    String regpass=br.readLine();
			    wri.write(regpass+",");
          System.out.println("Enter phone number");
          String phone=br.readLine();
          System.out.println("Enter mail");
          String mail=br.readLine();
          wri.write(phone+"");
          wri.write(mail);
          wri.newLine();
          wri.write("");
          //ou.flush();

			    wri.close();
          System.out.println("REGISTRATION SUCCESS");
            t=false;
		break ;

		case 2:
    System.out.println("*********LOGIN PAGE *********\n");
					while(k)
					{		System.out.println("_________________________");
								
								//System.out.println("_________________________");
					     		
   								 System.out.println("Enter user name");
   								 String inputUser = br.readLine();
   						 		System.out.println("Enter Password");
   								 String inppass = br.readLine();
   									Scanner scr = new Scanner(new File("password1.txt"));
                  //   FileInputStream fin=new FileInputStream("password.txt");  
   									while(scr.hasNextLine())
   								{
   									String line = scr.nextLine();
   //line.slice(1,-1);
   									String det[]= line.split(",");
   //String password =line.substri;
 //  String hh=det[0];
                   // System.out.println(line);
  									 if((det[0].equals(inputUser)) && (det[1].equals(inppass)))
  									{
  					 						//System.out.println("suc");
  					 						System.out.println("Login Success ");
  					 						System.out.println("_________________________");
  					 						System.out.println("WELCOME "+inputUser);
                       // System.out.println(det[2]);
                         swas=7;
  					 						t=false;
  					 						k=false;
   									}
                  }
                    if(k)
                    {
                      System.out.println("INVALID");
                    }

                    if(swas==7)
                    {
                      while(pp)
                      {
                      System.out.println("Select Type os waste\n 1:Plastic \n 2:Glass\n 3:Paper");
                      int klm =s.nextInt();
                      switch(klm)
                      {   
        


                         case 1:
                        System.out.println("type of plastic \n 1:bottle\n 2:cover");
                        int klmm=s.nextInt();
                        switch(klmm)
                        {
                          case 1:
                          {
                              System.out.println("bottle weight");
                               weight+=s.nextInt();
                               System.out.println("Press 1 to add more waste entries");
                                int rep=s.nextInt();

                                   if(rep!=1)
                    {
                      pp=false;
                    }

                              break;

                          }
                          case 2:

                          {
                              System.out.println("cover weight");
                              weight+=s.nextInt();
                              System.out.println("Press 1 to add more waste entries");
                                int rep=s.nextInt();

                                   if(rep!=1)
                    {
                      pp=false;
                    }
                              break;

                          }
                        }
                        break;
                        case 2:
                              System.out.println("type of glass \n 1:bottle\n 2:Other");
                        int klmmm=s.nextInt();
                        switch(klmmm)
                        {
                          case 1:
                          {
                              System.out.println("bottle weight");
                               weight+=s.nextInt();
                               System.out.println("Press 1 to add more waste entries");
                                int rep=s.nextInt();

                                   if(rep!=1)
                    {
                      pp=false;
                    }
                              break;

                          }
                          case 2:

                          {
                              System.out.println("other glass weight");
                              weight+=s.nextInt();
                              System.out.println("Press 1 to add more waste entries");
                               int rep=s.nextInt();
                                if(rep!=1)
                    {
                      pp=false;
                    }
                              break;

                          }
                        }

                        case 3:
                      }

                    }
                    
                   
                  }
   									
     						
                 // System.out.println("Invlid ");
     					}
              System.out.println("total credits you have is "+weight);
              br.close();
     					break;

		case 3:
				t=false;
				break;
		default:
					System.out.println("Correct enter cheyy ");
					break;
	}
}
}
}
