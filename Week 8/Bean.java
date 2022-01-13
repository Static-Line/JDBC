package org.o7planning.simplewebapp.beans;

 

public class UserAccount { //what to eat for dinner

 

   public static final String Tacos ="T"; //I want tacos

 

   public static final String Sushi = "S"; //erica wants sushi

 

 

   private String userName;

 

   private String food;

 

   private String password;


 

   public UserAccount() {


 

   }

 
   public String getUserName() {

       return userName;

   }

 
   public void setUserName(String userName) {


       this.userName = userName;
   }

 

   public String getfood() {

       return food;

   }

 

   public void setfood(String food) {


       this.food = food;
   }


   public String getPassword() {


       return password;

   }

 

   public void setPassword(String password) {

 

       this.password = password;


   }

 

}