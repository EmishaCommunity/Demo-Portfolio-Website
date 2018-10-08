import java.io.*;
import java.net.*;
//class Server
class Server1//starting of the class
      {
      public static void main(String a[])throws Exception//main method
                   {//starting of main metod
                    
                     ServerSocket ss=new ServerSocket(8989);//creating server socket object and passing the port no
                     Socket s=ss.accept();//call the accept method by server socket object
                     BufferReader br=new BufferedReader(s.getInputStream());//for taking input using of BufferedReader class
                     PrintStream ps=new PrintStream(s.getOutputStream());//for getting the output it is used
                     BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));//for getting input from the keyboard we create one object of BufferedReader class
                     String sndstr="",rcvstr="";
                     while(!rcvstr.equals("stop"))//starting of the loop ,this loop we initiate as bcz upto that extend the chatting operation will continue upto which the clint will not send rhe stop 
                           
                            {
                                rcvstr=br.readLine();//call the method readLine by the object br
                                System.out.println("from clint"+rcvstr);//print statement
                                sndstr=kb.readLine();//call the method readLine by kb object
                                ps.println(sndstr);//print statement
                             }
                   kb.close();//closing of the object
                   ps.close();//closing of the object
                   br.close();//closing of the object
                   s.close();//closing of the object
                   ss.close();//closing of the object
              }
       }

                             
                             
           


                  
