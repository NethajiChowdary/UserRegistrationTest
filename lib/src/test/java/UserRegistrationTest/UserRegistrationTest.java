package UserRegistrationTest;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {

UserRegistration userRegistration = new UserRegistration();

    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
	 boolean result = userRegistration.validateFirstName("Nethaji");
	 Assert.assertTrue(result);
	}
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
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
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
	    boolean result = userRegistration.validateLastName("Chowdary");
	    Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() {
		boolean result = userRegistration.validateLastName("Ch");
		Assert.assertFalse(result);
	}
	
	@Test
	  public void givenLastName_WhenHasNumber_ShouldReturnFalse()
	  {
	      boolean result = userRegistration.validateLastName("Chowdary55");
	      Assert.assertFalse(result);
	  }

	  @Test
	  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() 
	  {
	      boolean result = userRegistration.validateLastName("Chowd@ry");
	      Assert.assertFalse(result);
	  }
	  @Test
	    public void givenEmailId_WhenProper_ShouldReturnTrue()
	    {
	        boolean result = userRegistration.validateEmailid("nethaji.ch.123@gmail.com");
	        Assert.assertTrue(result);
	    }
	  @Test
	    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
	        boolean result = userRegistration.validateMobileNum("91 9876543210");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("919876543210");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("9876543210");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
	        boolean result = userRegistration.validateMobileNum("1245437234");
	        Assert.assertFalse(result);
	    }
	    @Test
		public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("Nethaji@123");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("asd56RIU%^");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("QWeRTy@#445");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
			boolean result = userRegistration.validatePassword("QWErty!@#$%");
			Assert.assertFalse(result);
		}

		@Test
		public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
			boolean result = userRegistration.validatePassword("QWErty!34");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
			boolean result = userRegistration.validatePassword("QWErty456");
			Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
			boolean result = userRegistration.validatePassword("QWErty!@#45");
			Assert.assertTrue(result);
		}

	}