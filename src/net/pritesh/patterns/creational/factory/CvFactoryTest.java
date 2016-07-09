package net.pritesh.patterns.creational.factory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class CvFactoryTest
{
    @Test
    public void createLinkedInCv() throws Exception
    {
        Cv cv = CvFactory.createCv(CvType.LINKEDIN);

        assertThat(cv.getCvDetails(), hasItem(isA(FuturePlans.class)));
        assertThat(cv.getCvDetails(), not(hasItem(isA(ContactDetails.class))));
    }

    @Test
    public void createJobApplicationCv() throws Exception
    {
        Cv cv = CvFactory.createCv(CvType.JOBAPPLICATION);

        assertThat(cv.getCvDetails(), hasItem(isA(ContactDetails.class)));
        assertThat(cv.getCvDetails(), not(hasItem(isA(FuturePlans.class))));
    }

    @Test
    public void createGenericCv() throws Exception
    {
        Cv cv = CvFactory.createCv(CvType.GENERIC);

        assertThat(cv.getCvDetails(), hasItem(isA(KeySkills.class)));
        assertThat(cv.getCvDetails(), not(hasItem(isA(CoveringLetter.class))));
    }
}
