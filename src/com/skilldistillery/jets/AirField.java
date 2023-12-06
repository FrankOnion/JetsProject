package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jetFleet;

	public AirField() {
		jetFleet = new ArrayList<>();
	}

	public void addJet(Jet jet) {
		jetFleet.add(jet);
	}

	public List<Jet> getAllJets() {
		return jetFleet;
	}

	public Jet findFastestJet() {
	    if (jetFleet.isEmpty()) {
	        return null; 
	    }

	    Jet fastestJet = jetFleet.get(0); // Assume the first jet is the fastest initially
	    for (Jet jet : jetFleet) {
	        if (jet.getSpeed() > fastestJet.getSpeed()) {
	            fastestJet = jet; 
	        }
	    }
	    return fastestJet;
	}


	public Jet findLongestRangeJet() {
	    if (jetFleet.isEmpty()) {
	        return null; 
	    }

	    Jet longestRangeJet = jetFleet.get(0); // Assume the first jet has the longest range initially
	    for (Jet jet : jetFleet) {
	        if (jet.getRange() > longestRangeJet.getRange()) {
	            longestRangeJet = jet; 
	        }
	    }
	    return longestRangeJet;
	}

	public boolean removeJet(Jet jetToRemove) {
	    
	    if (jetFleet.isEmpty() || jetToRemove == null) {
	        return false; 
	    }

	    
	    for (Jet jet : jetFleet) {
	        if (jet.equals(jetToRemove)) {
	            jetFleet.remove(jet); 
	            return true; 
	        }
	    }

	    return false;
}
}
