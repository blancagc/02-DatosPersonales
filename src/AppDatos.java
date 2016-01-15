import javax.swing.JOptionPane;
/**
 * 
 * @author Blanca
 *
 */
public class AppDatos {
/**
 * 
 * @param metodo en donde se colocan los gets de la clase Alumno 
 */
	public static void main(String[] args) {
		Alumno al= new Alumno("Blanca","21","62697990","González","Castañeda","Francisco Villa","UTTEC","soltera","Ecatepec","México");
		JOptionPane.showMessageDialog(null, String.format("hola %s \n tu edad es %s \n tu teléfono es  %s "
				+ "\n tu apellido paterno es %s  \n tu apellido materno es %s \n"
				+ "tu dirección es %s  \n tu escuela es %s \n tu estado civil es %s \n tu municipio es %s y \n tu estado es %s ", al.getNombre()
				, al.getEdad() , al.getTelefono(), al.getApellidoPaterno() , al.getApellidoMaterno(), al.getDireccion(), al.getEscuela()
				, al.getEstadoCivil() , al.getMunicipio(), al.getEstado()));

	}

}
