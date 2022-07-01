package lab3006; 

  

 import java.util.Arrays; 

 import java.util.Scanner; 

  

 public class CheckMissingNumber { 

          

         static void doCheckMissingNumber(int a[],int n) throws DuplicateElementException,  

         ElementOutOfBondException, StartNotWith1Exception, ElementGreaterThanLastLimitException { 

          

                 int temp=0,sum=0; 

                                                                     

                                 Arrays.sort(a); 

                                  

                                 for(int i=0;i<a.length-1;i++) { 

                                         if(a[0]!=1) { 

                                                 throw new StartNotWith1Exception(); 

                                         } 

                                 } 

                                  

                                 for(int i=0;i<a.length-1;i++) { 

                                         if(a[i]==a[i+1]) { 

                                                 throw new DuplicateElementException(); 

                                         } 

                                         } 

                                  

                                 for(int i=0;i<a.length;i++) { 

                                         if(a[i]>n) { 

                                                 throw new ElementGreaterThanLastLimitException(); 

                                         } 

                                 } 

                                                                                          

                          

                         if(n>a.length+1) {                                                //for checking num is greater than size or not 

                                 throw new ElementOutOfBondException(); 

                         } 

                                  

                 for(int i=0;i<n-1;i++) { 

                         sum+=a[i]; 

                 } 

                 temp=n*(n+1)/2; 

                  

                 int result =temp-sum; 

                 if(result==n) { 

                         System.out.println(); 

                 } 

                 else { 

                         System.out.println("Missing element in series is "+result);         

                 } 

                  

                 } 

                                                                                          

         public static void main(String[] args) { 

                 // TODO Auto-generated method stub 

  

                 int[]a= {1,2,4,5,6,7,8,9,10};             //will get proper output without exception 

 //                int[]a= {1,1,4,5,6,7,8,9,10};             // will get exception for repetitive elements 

 //                int[]a= {1,2,14,5,6,7,8,9,10};            // will get ElementGreaterThanLastLimitException 

 //                int[]a= {0,2,4,5,6,7,8,9,10};                         //will get StartNotWith1Exception 

                  

 //                Scanner sc =new Scanner(System.in); 

 //                System.out.println("Enter Last Limit "); 

                 int lastLimit= 10 ;//sc.nextInt(); 

                 try { 

                         doCheckMissingNumber(a,lastLimit); 

                 } catch (DuplicateElementException | ElementOutOfBoundException | StartNotWith1Exception |  

                                 ElementGreaterThanLastLimitException e) { 

                  

                         System.out.println(e); 

                 } 

                  

         } 

  

 }
