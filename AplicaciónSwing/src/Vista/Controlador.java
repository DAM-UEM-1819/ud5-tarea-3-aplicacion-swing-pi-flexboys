package Vista;

public class Controlador {
	 private CargaProfesor cargap;
	 private CargaAlumnos cargaal;
	 private Home home;
	 private ListadoProfesores listp;
	 private ListadosAlumnos listal;
	 private RegistroAlumnos regal;
	 private RegistroProfesores regp;
	 
	 public void homeCarga() {
		 home.setVisible(false);
		 cargap.setVisible(true);
	 }
	 public void homeReg() {
		 home.setVisible(false);
		 regal.setVisible(true);
	 }
	 public void homelistp() {
		 home.setVisible(false);
		 listal.setVisible(true);
	 }
	 
	 
	 
	 
}
