package com.rebegin;

public class jdbcConnectionCalling {

	public static void main(String[] args) {

/*		jdbcConnection jc = new jdbcConnection();
//		jc.insertion();
//		jc.Update();
//		jc.Delete();
*/		
		DynamicStatements ds =new DynamicStatements();
		ds.selectQuery();
	}

}
