package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mark=new YGeneration("Mark Spencer");
        User george=new Millenials("George Banck");
        User daryl=new ZGeneration("Daryl Newtown");

        //When
        String markShouldShare=mark.sharePost();
        System.out.println("Mark likes share : "+markShouldShare);
        String georgeShouldShare=george.sharePost();
        System.out.println("George likes share: "+georgeShouldShare);
        String darylShouldShare=daryl.sharePost();
        System.out.println("Daryl likes share: "+darylShouldShare);

        //Then
        Assert.assertEquals("[SnapchatPublisher] Snapchat",markShouldShare);
        Assert.assertEquals("[Twitter publisher] Twitter",georgeShouldShare);
        Assert.assertEquals("[FacebookPublisher] Facebook",darylShouldShare);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mark=new YGeneration("Mark Spencer");
        //When
        String markShouldShare=mark.sharePost();
        System.out.println("Mark likes share : "+markShouldShare);
        mark.setSocialStrategy(new FacebookPublisher());
        markShouldShare=mark.sharePost();
        System.out.println("Mark should now likes:"+markShouldShare);
        //Then
        Assert.assertEquals("[FacebookPublisher] Facebook",markShouldShare);
    }
}
