package org.abstraction;

public abstract class PartialAbstaction1 {
	/*
	 *   Project   :UniversityInformation
     Package   :org.univ
     Class     :University
     Methods   :ug(),pg()

     Class     :College
     Methods   :ug(),pg()

Description:
ug(),pg() is just a templete in University class and You have to override the method ug(),pg() in College class.
	 */
	public abstract void ug(int num);
	public abstract void pg(int num);
	public void masters() {
		System.out.println("Masters courses Avaliable");
	}
	
}
