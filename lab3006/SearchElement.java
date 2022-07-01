package lab3006; 

  

 import java.util.Scanner; 

  

 public class SearchElement { 

  

         public static void main(String[] args) { 

 //                int []a= {1,2,3,4,5}; 

                  

                 Scanner sc =new Scanner(System.in); 

                 System.out.println("Enter lenght of array"); 

                 int len=sc.nextInt(); 

                 int []a= new int[len]; 

                  

                 System.out.println("Enter elements for array"); 

                 for(int i=0 ;i<a.length;i++) { 

                         a[i]=sc.nextInt(); 

                 } 

                  

                 System.out.println("Your Array is "); 

                 for(int e:a) { 

                         System.out.print(e+" "); 

                 } 

                 System.out.println(); 

                 System.out.println("Enter number to find"); 

                 int n=sc.nextInt(); 

                 int m = 0; 

                  

                  

                 for(int i=0 ;i<a.length;i++) { 

                         if(a[i]==n) { 

                                 m=i; 

                                  

                         } 

                         else { 

                                 m=0; 

                         }         

                 } 

                  

                  

                 if(m>0) { 

                         System.out.println("Your number "+n +" is present at index "+m +" where " 

                                         + "index starts from 0"); 

                 } 

                 else { 

                         System.out.println("Given number is not present"); 

                 } 

                  

         } 

 }            
