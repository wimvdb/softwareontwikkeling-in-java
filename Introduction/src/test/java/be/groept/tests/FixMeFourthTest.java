package be.groept.tests;

import java.util.ArrayList;
import java.util.Collection;

import be.groept.generics.Base2;
import be.groept.generics.Base3;
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
		Collection<Base2> upperboundCollectionOne = new ArrayList<Base2>();
		upperboundCollectionOne.add(new Base2());
		Collection<Base3> upperboundCollectionTwo= new ArrayList<Base3>();
		upperboundCollectionTwo.add(new Base3());

		// TODO THIRD --------> Uncomment [2] Make it work, rewrite message
		// signature if needed
		//thisWillNotWorkEither(upperboundCollectionOne);
		//thisWillNotWorkEither(upperboundCollectionTwo);

	}

	//[1]
	//public void thisWillNotWork(Collection<Object> collection) {
	//}

	//[2]
	//public void thisWillNotWorkEither(Collection<Object> collection) {
 	//	collection.add(new Base3());
	//}
}