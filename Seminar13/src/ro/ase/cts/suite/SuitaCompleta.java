package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.TestGetPromovabilitateGrupa;
import ro.ase.cts.tests.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.tests.TesteConstructorGrupa;
import ro.ase.cts.tests.TestePromovabilitateGrupaCuDubluri;

@RunWith(Suite.class)
@SuiteClasses({ TestePromovabilitateGrupaCuDubluri.class,
		TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaWithFixture.class })
public class SuitaCompleta {
    
}
