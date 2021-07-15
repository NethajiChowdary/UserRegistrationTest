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
	 boolean result = userRegistration.validateFirstName("Nethaj!");
	 Assert.assertFalse(result);
   }
    
    @Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	    boolean result = userRegistration.validateLastName("Chowdary");
	    Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse()
	{
		boolean result = userRegistration.validateLastName("Ch");
		Assert.assertFalse(result);
	}
	
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
	      boolean result = userRegistration.validateLastName("Chowdary55");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
	      boolean result = userRegistration.validateLastName("Chowd@ry");
	      Assert.assertFalse(result);
	  }
	  @Test
	    public void givenEmailId_WhenProper_ShouldReturnTrue(){
	        boolean result = userRegistration.validateEmailid("nethajich123@gmail.com");
	        Assert.assertTrue(result);
	    }
	  
	  @Test
	    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue()
	  {
	        boolean result = userRegistration.validateMobileNum("91 7853736579");
	        Assert.assertTrue(result);
	    }
	  
	    @Test
	    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("9876543210");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() 
	    {
	        boolean result = userRegistration.validateMobileNum("99674");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse()
	    {
	        boolean result = userRegistration.validateMobileNum("12345678");
	        Assert.assertFalse(result);
	    }


}