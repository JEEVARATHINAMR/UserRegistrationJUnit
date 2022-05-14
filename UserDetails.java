package com.bridgelabz;

public class UserDetails {
	 @Test
	    public void GivenFirstName_WhenProper_ShouldReturnTrue() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateFirstName("Jeeva");
	        Assert.assertTrue(result);
	    }
	    
		@Test
	    public void GivenFirstName_WhenShort_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateFirstName("jeeva");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenFirstName_WhenSpecialChar_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateFirstName("Jeev@a");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenLastName_WhenProper_ShouldReturnTrue() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateLastName("Rathinam");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenLastName_WhenShort_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateLastName("Ra");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenLastName_WhenSpecialChar_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateLastName("Ra@thi@nam");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPassWord_WhenProper_ShouldReturnTrue() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validatePassWord("Jeeva_123");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPassWord_WhenNotProper_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validatePassWord("Jeeva123");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenEmail_WhenProper_ShouldReturnTrue() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateEmail("jeevasmart123@gmail.com");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenEmail_WhenNotProper_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validateEmail("jeevasmart12@.com");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPhoneNum_WhenProper_ShouldReturnTrue() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validatePhoneNum("91 1234567890");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPhoneNum_WhenNotProper_ShouldReturnFalse() {
	        UserDetails validator = new UserDetails();
	        boolean result = validator.validatePhoneNum("09 1234567890");
	        Assert.assertTrue(result);
	    }

}
