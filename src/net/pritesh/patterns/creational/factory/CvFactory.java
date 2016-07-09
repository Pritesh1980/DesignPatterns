package net.pritesh.patterns.creational.factory;

/**
 * The main entry point to the factory. Look in each specific class for more details on what they do.
 */
public class CvFactory
{
    public static Cv createCv(CvType cvType)
    {
        switch (cvType)
        {
            case LINKEDIN:
            {
                return new LinkedInCv();
            }
            case JOBAPPLICATION:
            {
                return new JobApplicationCv();
            }
            default:
            {
                return new GenericCv();
            }
        }
    }

}
