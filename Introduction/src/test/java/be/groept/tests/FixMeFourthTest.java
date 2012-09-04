package be.groept.tests;

import java.util.ArrayList;
import java.util.Collection;

import be.groept.generics.Base1;
import be.groept.generics.Base2;
import be.groept.generics.Super;

public class FixMeFourthTest {

	public void testGenerics() {

		// TODO FIRST -----> Uncomment and FIX the raw type warning, DO NOT
		// continue before this is fixed
		// the unused warning may remain it will go away when you continue
		// Make if type <Integer>

		Collection<Integer> collection = new ArrayList<>();

		// -- NO INHERITANCE
		// TODO SECOND -------> Uncomment [1] and make it work, rewrite message
		// signature if needed

		//thisWillNotWork(collection);

		// -- LOWER BOUNDS
		Collection<Base1> upperboundCollection = new ArrayList<Base1>();
		upperboundCollection.add(new Base1());
		// TODO THIRD --------> Uncomment [2] Make it work, rewrite message
		// signature if needed
		 //thisWillNotWorkEither(upperboundCollection);

	}

	//[1]
	//public void thisWillNotWork(Collection<Object> collection) {
	//}

	//[2]
	//public void thisWillNotWorkEither(Collection<?> collection) {
 	//	collection.add(new Base2());
	//}
}