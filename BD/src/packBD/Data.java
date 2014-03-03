package packBD;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Data 
{
	private static Data miData;
	private String usuario;
	private String contraseña;
	private String servidor = ;
	
	private Data ()
	{
	}
	
	public static Data getData (
	{
		if (miData == null)
			miData = new Data();

		return miData;
			
	}
	
	public String[] realizarConsulta (String pRol, String pConsulta)
	{
		usuario = getRol();
		String consulta = getConsulta();
		try {
			Connection a = (Connection) ConexionDB.GetConnection(usuario, contraseña, servidor);
			Statement s = (Statement) a.createStatement();
			ResultSet rs = s.executeQuery("select * from "+ consulta);
			return prepararRespuesta(rs);
			}
		}
	}
	

	public String[] realizarMatricula(String pId, String pFirstName, String pLastName, String pLevel, String pCredits)
			{
					Connection a = (Connection) ConexionDB.GetConnection("director", "imthedirector", servidor);
					Statement s = (Statement) a.createStatement();
					ResultSet rs = s.executeQuery("insert values"+"into Student");
			}
		
		
	
	private String[] prepararRespuesta(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getConsulta() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getRol() {
		// TODO Auto-generated method stub
		return null;
	}
