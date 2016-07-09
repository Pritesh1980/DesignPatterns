package net.pritesh.patterns.creational.factory;

/**
 * Details that are specific to this class.
 * See {@link Cv} for a fuller picture.
 */
public class LinkedInCv extends Cv
{
    @Override
    protected void assembleCv()
    {
        cvDetails.add(new BasicDetails());
        cvDetails.add(new Introduction());
        cvDetails.add(new KeySkills());
        cvDetails.add(new WorkHistory());
        cvDetails.add(new FuturePlans());
    }
}
