/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakadeController;

import Customer.Customer;
import DBConnection.DBConnection;
import Item.Item;
import List.List;
import com.mysql.cj.xdevapi.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

public class thogakadeController {
    
    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
    Connection connection = DBConnection.getInstance().getConnection();
    String SQL = "INSERT INTO customer (id, name, address, salary) VALUES (?, ?, ?, ?)";
    try (PreparedStatement stm = connection.prepareStatement(SQL)) {
        stm.setObject(1, customer.getId());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getSalary());
        return stm.executeUpdate() > 0;
    }
}

    
   public static String generateCustomerId() throws SQLException, ClassNotFoundException {
    Connection connection = DBConnection.getInstance().getConnection();
    String lastId = null;

    String SQL = "SELECT id FROM customer WHERE id LIKE 'C%' ORDER BY id DESC LIMIT 1";
    try (PreparedStatement stm = connection.prepareStatement(SQL); 
         var resultSet = stm.executeQuery()) {
        if (resultSet.next()) {
            lastId = resultSet.getString("id");
        }
    }

    if (lastId == null) {
        return "C001";
    } else {
        String idPart = lastId.substring(1);
        int lastIdNumber = Integer.parseInt(idPart);
        return String.format("C%03d", lastIdNumber + 1);
    }
}   
   
    public static String showDate() {
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }


 public static String orderIdGenerate() throws ClassNotFoundException, SQLException {
    Connection connection = DBConnection.getInstance().getConnection();
    String query = "SELECT MAX(id) FROM orders";
    int maxNumericPart = 0;

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        try (java.sql.ResultSet result = statement.executeQuery()) {
            if (result.next()) {
                String lastOrderId = result.getString(1);
                if (lastOrderId != null && lastOrderId.startsWith("D")) {
                    try {
                        maxNumericPart = Integer.parseInt(lastOrderId.substring(1));
                    } catch (NumberFormatException e) {
                        maxNumericPart = 0;  // Handle invalid ID format
                    }
                }
            }
        }
    }

    return String.format("D%03d", maxNumericPart + 1);
}

public static ArrayList<Customer> getCustomerIds() throws ClassNotFoundException, SQLException {
    ArrayList<Customer> customerIdList = new ArrayList<>();
    String query = "SELECT id FROM customer";
    
    try (Connection connection = DBConnection.getInstance().getConnection();
         PreparedStatement pstmt = connection.prepareStatement(query);
         ResultSet rst = pstmt.executeQuery()) {
         
        while (rst.next()) {
            customerIdList.add(new Customer(rst.getString("id"), null, null, 0));
        }
    }
    return customerIdList;
}

    public static String getCustomerName(String selecCusId) throws ClassNotFoundException, SQLException {
    String query = "SELECT name FROM customer WHERE id = ?";
    
    try (Connection connection = DBConnection.getInstance().getConnection();
         PreparedStatement pstmt = connection.prepareStatement(query)) {
        
        pstmt.setString(1, selecCusId); // Safely set the parameter
        try (ResultSet rst = pstmt.executeQuery()) {
            if (rst.next()) {
                return rst.getString("name"); // Return the name if found
            }
        }
    } 
    return null; // Return null if no match is found
}
    
     public static ArrayList<Item> getItemCode() throws SQLException, ClassNotFoundException {
    ArrayList<Item> itemCodeList = new ArrayList<>();
    String query = "SELECT code FROM item";
    
    try (Connection connection = DBConnection.getInstance().getConnection();
         PreparedStatement pstmt = connection.prepareStatement(query);
         ResultSet rst = pstmt.executeQuery()) {
        
        while (rst.next()) {
            itemCodeList.add(new Item(rst.getString("code"), null, 0, 0));
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving item codes: " + e.getMessage());
        throw e;
    }

    return itemCodeList;
}
}
