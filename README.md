# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.


2. What five objects are created in the main?
	ArrayList "dogs", 3 dog objects (Fido, Fido, and Alfie), Animal Comparator

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

The comparator constructor call occurs at "Collections.sort(dogs, new Comparator<Animal>()". The class definition for the comparator
is defined by the programmer. This is because Comparators belong in their own classes that contain NOTHING ELSE. In this instance, the compare
method is being overridden under the "@Override".