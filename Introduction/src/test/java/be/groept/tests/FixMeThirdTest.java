package be.groept.tests;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.PackageUtils;

import be.groept.annotations.ImASecuredClass;
import be.groept.annotations.Secured;

@Test
public class FixMeThirdTest {

	public void scanForClassesWithSecuredAnnotations() throws Exception {
		List<String> include = new ArrayList<String>();
		include.add(".*");

		Object[] results = new Object[2];
		for (String processorClassName : PackageUtils.findClassesInPackage("be.groept.annotations", include,
				new ArrayList<String>())) {
			Class<?> clazz = Class.forName(processorClassName);
			Secured secured = clazz.getAnnotation(Secured.class);
			if(secured != null){
			results[0] = clazz;
			results[1] = secured.role();
			}
			// TODO Create an annotation called "Secured" (put it in the src/main/java), give it a property "role"
			// Put the annotation on the "ImASecuredClass", and give the role property a value "admin"
			// Filter the classes here with reflection so that only the ImASecuredClass is treated,
			// the annotation is read and the rolename is printed. The result must be like:
			// class: ImASecuredClass Role:
			// whicheverroleyouputontheannotationinImASecuredClass
			// results[0] = the class which has the annotation
			// results[1] = the value of the role property parsed from the annotation on the class
		}

		Assert.assertEquals(results[0], ImASecuredClass.class);
		Assert.assertEquals(results[1], "admin");
	}
}