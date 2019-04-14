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
	 public void cargahome() {
		 cargap.setVisible(false);
		 home.setVisible(true);
	 }
	 public void Reghome() {
		 regal.setVisible(false);
		 home.setVisible(true);
		 
	 }
	 public void listphome() {
		 
		 listal.setVisible(false);
		 home.setVisible(true);
	 }
	 public void saberhome() {
		 
		 saber.setVisible(false);
		 home.setVisible(true);
	 }
	 public void gruphome() {
		 
		 grup.setVisible(false);
		 home.setVisible(true);
	 }
	 public void consultahome() {
		 con.setVisible(false);
		 home.setVisible(true);
	 }
	 
}
