package Classeseinterfaces;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal extends ExtSqlGen {
	public Principal(){
		getDropTable(null, null);
		getCreateTable(null, null);
		getSqlInsert(null,null);
		getSqlSelectAll(null,null);
		getSqlSelectById(null,null);
		getSqlUpdateById(null,null);
		getSqlDeleteById(null,null);
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		String strCreateTable = getCreateTable(null, Cliente.class);
		System.out.println(strCreateTable);				
	}
	
	public static void main(String []args){
		System.out.println("Realizando operações SQL: ");
		new Principal();
	}
}