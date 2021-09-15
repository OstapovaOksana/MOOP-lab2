package main;

import db.DbExamples;
import db.DbNewsAgency;

public class Main {
	public static void main(String[] args) throws Exception {
        DbExamples examples = new DbExamples(getServicesInstance());
        examples.runAll();
    }

    public static DbNewsAgency getServicesInstance() throws Exception {
    	DbNewsAgency services = new DbNewsAgency();
        services.connect("jdbc:sqlserver://SERVER-NAME;user=USER;password=PASSWORD;databaseName=DB-NAME;");
        return services;
    }
}
