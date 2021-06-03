package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.GrupaAdaugaStudent;
import ro.ase.cts.teste.GrupaFakeTest;
import ro.ase.cts.teste.GrupaGetPromovabilitate;
import ro.ase.cts.teste.GrupaTestSetUp;
import ro.ase.cts.teste.TesteGrupa;

@RunWith(Suite.class)
@SuiteClasses({TesteGrupa.class, GrupaTestSetUp.class, GrupaGetPromovabilitate.class, GrupaFakeTest.class, GrupaAdaugaStudent.class})
public class SuitaCompleta {

}
