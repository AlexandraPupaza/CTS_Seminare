package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.suite.categorii.TestPromovabilitateCategorie;
import ro.ase.cts.suite.categorii.TesteUrgente;
import ro.ase.cts.tests.TestGetPromovabilitateGrupa;
import ro.ase.cts.tests.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.tests.TesteConstructorGrupa;
import ro.ase.cts.tests.TestePromovabilitateGrupaCuDubluri;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteConstructorGrupa.class, TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaWithFixture.class, TestePromovabilitateGrupaCuDubluri.class})
@Categories.IncludeCategory(TestPromovabilitateCategorie.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {
	
}
