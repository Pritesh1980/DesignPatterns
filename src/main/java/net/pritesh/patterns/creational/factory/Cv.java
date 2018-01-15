package net.pritesh.patterns.creational.factory;


import java.util.ArrayList;
import java.util.List;

/**
 * The meat of the logic is here.
 * All the component bits are in here. The constructor calls the abstract assembleCv() method
 * which does the specific work within each subclass
 */
public abstract class Cv
{
    protected List<CvDetail> cvDetails = new ArrayList<>();

    public List<CvDetail> getCvDetails()
    {
        return cvDetails;
    }

    public Cv()
    {
        this.assembleCv();
    }

    protected abstract void assembleCv();
}
