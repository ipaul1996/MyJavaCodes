package com.ip.Test8;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EnhancedList{

	Set<Integer> s1 = new TreeSet<>();

	@Override
	public int hashCode() {
		return Objects.hash(s1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnhancedList other = (EnhancedList) obj;
		return Objects.equals(s1, other.s1);
	}
	
	
	
	

}
