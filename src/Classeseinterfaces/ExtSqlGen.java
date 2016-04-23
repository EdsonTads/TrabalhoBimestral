package Classeseinterfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ExtSqlGen extends SqlGen{

	@Override
	protected String getCreateTable(Connection con, Object obj) {
		System.out.println("Criando Tabela");
		return null;
	}

	@Override
	protected String getDropTable(Connection con, Object obj) {
		System.out.println("Apagando Tabela");
		return null;
	}

	@Override
	protected PreparedStatement getSqlInsert(Connection con, Object obj) {
		System.out.println("Inserindo Dados");
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectAll(Connection con, Object obj) {
		System.out.println("Selecionando Dados");
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectById(Connection con, Object obj) {
		System.out.println("Selecionado Dados por ID");
		return null;
	}

	@Override
	protected PreparedStatement getSqlUpdateById(Connection con, Object obj) {
		System.out.println("Atualizando Dados por ID");
		return null;
	}

	@Override
	protected PreparedStatement getSqlDeleteById(Connection con, Object obj) {
		System.out.println("Deletando Dados por ID");
		return null;
	}
}
