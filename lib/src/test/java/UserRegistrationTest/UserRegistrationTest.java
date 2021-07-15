package UserRegistrationTest;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{

    UserRegistration userRegistration = new UserRegistration();

    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	 boolean result = userRegistration.validateFirstName("Nethaji");
	 Assert.assertTrue(result);
	}
    
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse()
     {
	   boolean result = userRegistration.validateFirstName("Ne");
	   Assert.assertFalse(result);
    }
    
     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse()
     {
 		boolean result = userRegistration.validateFirstName("Nethaji55");
 		Assert.assertFalse(result);
 	}

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	  boolean result = userRegistration.validateFirstName("Neth@ji");
	  Assert.assertFalse(result);
   }
}   
