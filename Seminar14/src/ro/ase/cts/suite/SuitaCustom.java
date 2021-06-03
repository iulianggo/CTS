package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.teste.GrupaAdaugaStudent;
import ro.ase.cts.teste.GrupaFakeTest;
import ro.ase.cts.teste.GrupaGetPromovabilitate;
import ro.ase.cts.teste.GrupaTestSetUp;
import ro.ase.cts.teste.TesteGrupa;

@RunWith(Categories.class)
@SuiteClasses({TesteGrupa.class, GrupaTestSetUp.class, GrupaGetPromovabilitate.class, 
	GrupaFakeTest.class, GrupaAdaugaStudent.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}
