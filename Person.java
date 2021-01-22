public class Person
{
   private String name;
   private String email;
   private String phoneNum;

   public Person()
	 {
		 	name = "";
			email = "";
			phoneNum = "";
	 }

	 public Person(String initName, String initEmail, String initPhoneNum)
   {
      name = initName;
			email = initEmail;
			phoneNum = initPhoneNum;
   }

   /* accessor method to get name */
   public String getName()
   {
     return name;
   }

   /* mutator method to set name */
   public void setName(String newName)
   {
     name = newName;
   }

   /* accessor method to get email */
   public String getEmail()
   {
     return email;
   }

   /* mutator method to set email */
   public void setEmail(String newEmail)
   {
     email = newEmail;
   }

   /* accessor method to get phoneNum */
   public String getPhoneNum()
   {
     return phoneNum;
   }

   /* mutator method to set email */
   public void setPhoneNum(String newPhoneNum)
   {
     phoneNum = newPhoneNum;
   }

   public String toString()
   {
     return "Name: " + name + " Email: " + email + " PhoneNum: " + phoneNum;
   }
}
