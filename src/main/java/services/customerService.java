package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.customer;
import util.DBConnect;

public class customerService {
	
	public void regCustomer(customer cus) {
		try {
			
			
			String query = "INSERT INTO customer VALUES ('" +cus.getEmail()+ "','" + cus.getName()+"','" +cus.getAge()+"','"+cus.getPassword()+"')";
			
			
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean validate(customer cus) {
		try {
			String query = "select * from customer where email = '"+cus.getEmail()+"' and password= '"+cus.getPassword()+"'";
			
			Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			
			if(rs.next()) {
				return true;
				
			}
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public customer getOne(customer cus) {
		try {
			String query = "select * from customer where email = '"+cus.getEmail()+"' and password= '"+cus.getPassword()+"'";
			
			Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			
			if(rs.next()) {
				cus.setName(rs.getString("name"));
				cus.setAge(rs.getInt("age"));
				cus.setEmail(rs.getString("email"));
				cus.setPassword(rs.getString("password"));
				return cus;
				
			}
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<customer> getAllCustomers(){
		try {
			ArrayList<customer> listCus = new ArrayList<customer>();
			
			String query = "select*from customer";
			
			Statement  statement = DBConnect.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				customer cus =new customer();
				
				cus.setName(rs.getString("name"));
				cus.setAge(rs.getInt("age"));
				cus.setEmail(rs.getString("email"));
				cus.setPassword(rs.getString("password"));
				
				listCus.add(cus);
				
			}
			return listCus;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public customer singleDataButton(customer cus) {
		try {
			String query = "select * from customer where email = '"+cus.getEmail()+"'";
			
			Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			
			if(rs.next()) {
				cus.setName(rs.getString("name"));
				cus.setAge(rs.getInt("age"));
				cus.setEmail(rs.getString("email"));
				cus.setPassword(rs.getString("password"));
				return cus;
				
			}
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateCustomer(customer customer) {
		try {
			String query = "UPDATE customer SET name ='"+customer.getName()+"', age ='"+customer.getAge()+"', email ='"+customer.getEmail()+"', password ='"+customer.getPassword()+"' WHERE email='"+customer.getEmail()+"'";

			
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteCustomer(customer cus) {
		try {
			String query = "DELETE FROM customer WHERE email ='"+cus.getEmail()+"'";
			
			Statement statement = DBConnect.getConnection().createStatement();	
			statement.executeUpdate(query);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
