package Vista;

public class Controlador {
	 private CargaProfesor cargap;
	 private CargaAlumnos cargaal;
	 private Home home;
	 private ListadoProfesores listp;
	 private ListadosAlumnos listal;
	 private RegistroAlumnos regal;
	 private RegistroProfesores regp;
	 private SaberMas saber;
	 private Grupos grup;
	 private Consultas con;
	 
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
	 public void homesaber() {
		 home.setVisible(false);
		 saber.setVisible(true);
	 }
	 public void homegrup() {
		 home.setVisible(false);
		 grup.setVisible(true);
	 }
	 public void homeconsulta() {
		 home.setVisible(false);
		 con.setVisible(true);
	 }
	 
	 
}
