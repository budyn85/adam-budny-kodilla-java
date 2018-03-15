package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {

    public void testCaseUsername(){
        @Test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        Assert.assertEquals("theForumUser",result);
    }
}
