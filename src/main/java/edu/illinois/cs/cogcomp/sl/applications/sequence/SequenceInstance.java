package edu.illinois.cs.cogcomp.sl.applications.sequence;


import edu.illinois.cs.cogcomp.sl.core.IInstance;
import edu.illinois.cs.cogcomp.sl.util.IFeatureVector;

/**
 * Sequence instance 
 * @author kchang10
 */

public class SequenceInstance implements IInstance {

	public final IFeatureVector baseFeatures[];
	public SequenceInstance(IFeatureVector[] baseFeatures) {
		this.baseFeatures = baseFeatures;
	}
	
	public int size(){
		return baseFeatures.length;
	}
	
}